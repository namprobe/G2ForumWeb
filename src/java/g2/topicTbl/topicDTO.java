/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2.topicTbl;

/**
 *
 * @author APC
 */
public class topicDTO {
    private int topic_id;
    private String title;
    private String content;

    public topicDTO() {
    }

    public topicDTO(int topic_id, String title, String content) {
        this.topic_id = topic_id;
        this.title = title;
        this.content = content;
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

    public void setContext(String content) {
        this.content = content;
    }
    
    
}
