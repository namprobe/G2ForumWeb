/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2.postTbl;

/**
 *
 * @author APC
 */
public class postDTO {
    private int post_id;
    private int user_id;
    private int topic_id;
    private String title;
    private String content;
    private boolean isHidden;
    private boolean isDelete;
    private String image;

    public postDTO() {
    }
//constructor =-- post_id
    public postDTO(int user_id, int topic_id, String title, String content, boolean isHidden, boolean isDelete, String image) {
        this.user_id = user_id;
        this.topic_id = topic_id;
        this.title = title;
        this.content = content;
        this.isHidden = isHidden;
        this.isDelete = isDelete;
        this.image = image;
    }

    public postDTO(int post_id, int user_id, int topic_id, String title, String content, boolean isHidden, boolean isDelete, String image) {
        this.post_id = post_id;
        this.user_id = user_id;
        this.topic_id = topic_id;
        this.title = title;
        this.content = content;
        this.isHidden = isHidden;
        this.isDelete = isDelete;
        this.image = image;
    }


    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(int topic_id) {
        this.topic_id = topic_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isIsHidden() {
        return isHidden;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }

    public boolean isIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    
    
    
}
