/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2.commentTbl;

import g2.utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author APC
 */
public class commentDAO {

    public List<commentDTO> getCommentByPost(int post_id) throws SQLException, ClassNotFoundException, Exception {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<commentDTO> list_comment = null;
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String query = "SELECT * FROM commentTbl WHERE post_id = ?";
                stm = con.prepareStatement(query);
                stm.setInt(1, post_id);
                rs = stm.executeQuery();
                if (rs.next()) {
                    int comment_id = rs.getInt("comment_id");
                    int user_id = rs.getInt("user_id");
                    //post_id
                    String content = rs.getString("content");
                    String image = rs.getString("image");
                    int parent_id = rs.getInt("parent_id");
                    list_comment.add(new commentDTO(comment_id, user_id, post_id, content, image, parent_id));
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

        return list_comment;
    }
}
