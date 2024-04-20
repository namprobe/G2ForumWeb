/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2.servlets;

import g2.voteTbl.VoteDAO;
import g2.voteTbl.VoteSubmitError;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
public class SubmitVoteServlet extends HttpServlet {
    private final VoteDAO DAO = new VoteDAO();
    private final String VIEW_POST = "ViewPostServlet";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int postId = Integer.parseInt(request.getParameter("postId"));
        int userId = Integer.parseInt(request.getParameter("userId"));
        int voteType = Integer.parseInt(request.getParameter("voteType"));
        VoteSubmitError err = new VoteSubmitError();
        String url = VIEW_POST +"?postId="+postId;

        try {
            if (!DAO.hasVoted(postId, userId)) {
                // User has not voted, proceed with vote submission
                DAO.sumbitVote(userId, postId, voteType);
            } else {
                // User has already voted, handle accordingly (e.g., display error message)
                err.setVoteHasBeenMadeError("You already voted. Click here to remove vote");   
                request.setAttribute("ERROR", err);
                //=> display as a clickable link on the post UI next to the vote button, when clicked, it triggers removeVoteServlet
            }
        } catch (SQLException e){
            log("Error at VoteServlet _ SQL : " + e.toString());
        } catch (ClassNotFoundException e){
            log("Error at VoteServlet _ CNF : " + e.toString());
        } catch (Exception e) {
            log("Error at VoteServlet _ EX : " + e.toString());
        } finally {
            request.getRequestDispatcher(url).forward(request,response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
