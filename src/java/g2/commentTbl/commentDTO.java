/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2.commentTbl;

/**
 *
 * @author APC
 */
public class commentDTO {
    private int comment_id;
    private int user_id;
    private int post_id;
    private String content;
    private String image;
    private int parent_id;

    public commentDTO() {
    }
    
    //Contructor -- comment_id;
    //unuse
    public commentDTO(int user_id, int post_id, String content, String image, int parent_id) {
        this.user_id = user_id;
        this.post_id = post_id;
        this.content = content;
        this.image = image;
        this.parent_id = parent_id;
    }

    public commentDTO(int comment_id, int user_id, int post_id, String content, String image, int parent_id) {
        this.comment_id = comment_id;
        this.user_id = user_id;
        this.post_id = post_id;
        this.content = content;
        this.image = image;
        this.parent_id = parent_id;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }
    
    
    
}
