/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2.voteTbl;

import g2.utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author APC
 */
public class voteDAO {
    public List<voteDTO> getVoteData() throws SQLException, ClassNotFoundException, Exception {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<voteDTO> list_vote = new ArrayList<>();
        try {
            con = DBUtils.getConnection();
            if (con!=null) {
                String query = "SELECT * FROM voteTbl";
                stm = con.prepareStatement(query);
                rs = stm.executeQuery();
                if (rs.next()) {
                    int vote_id = rs.getInt("vote_id");
                    int user_id = rs.getInt("user_id");
                    int post_id = rs.getInt("post_id");
                    int vote_type = rs.getInt("vote_type");
                    list_vote.add(new voteDTO(vote_id, user_id, post_id, vote_type));
                }
            }
           
        } finally {
            if(rs!= null) rs.close();
            if(stm!= null) stm.close();
            if(con!= null) con.close();
        }
        return list_vote;
    }

    
}
