/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2.userTbl;

import g2.utils.DBUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nam
 */
public class userDAO {
    public userDTO checkLogin(String username, String password) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        userDTO acc = null;
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String query = " select * from userTbl where username=? and password=?";
                stm = con.prepareStatement(query);
                stm.setString(1, username);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    int userID = rs.getInt("user_id");
                    String userName = rs.getString("username");
                    String passWord = rs.getString("password");
                    String email = rs.getString("email");
                    Date birthdate = rs.getDate("birthdate");
                    boolean isMod = rs.getBoolean("isMod");
                    boolean isDelete = rs.getBoolean("isDelete");
                    boolean isBanned = rs.getBoolean("isBanned");
                    byte[] avatar = rs.getBytes("avatar");
                    acc = new userDTO(userID, userName, password, email, birthdate, isMod, isDelete, isBanned, avatar);
                    // public userDTO(int user_id, String username, String password, String email, Date birthDate, boolean isMod, boolean isDelete,boolean isBanned, byte[] avatar) {

                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }

        }
        return acc;
    }

    public boolean checkAccountExisted(String username) throws SQLException, ClassNotFoundException {
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String query = "select * from userTbl where username = ? ";
                stm = con.prepareStatement(query);
                stm.setString(1, username);
                rs = stm.executeQuery();
                return rs.next();
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;//exception
    }
     public boolean checkEmailExisted(String email) throws SQLException, ClassNotFoundException {
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String query = "select * from userTbl where email = ? ";
                stm = con.prepareStatement(query);
                stm.setString(1, email);
                rs = stm.executeQuery();
                
                return rs.next();
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;//exception
    }
    

    public boolean signup(String username, String email, String password) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String query = "insert into userTbl(username,email,password) values(?,?,?)";
                stm = con.prepareStatement(query);
                stm.setString(1, username);
                stm.setString(2, email);
                stm.setString(3, password);
                int affectedRows = stm.executeUpdate();
                return affectedRows == 1;
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
}
