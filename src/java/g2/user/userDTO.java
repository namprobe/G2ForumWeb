/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2.user;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class userDTO {
    private int user_id;
    private String username;
    private String password;
    private String email;
    private Date birthDate;
    private boolean isMod;
    private boolean isDelete;
    private boolean isBanned;
    private byte[] avatar;

    public userDTO() {
    }

    public userDTO(int user_id, String username, String password, String email, Date birthDate, boolean isMod, boolean isDelete,boolean isBanned, byte[] avatar) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.birthDate = birthDate;
        this.isMod = isMod;
        this.isDelete = isDelete;
        this.isBanned = isBanned;
        this.avatar = avatar;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isIsMod() {
        return isMod;
    }

    public void setIsMod(boolean isMod) {
        this.isMod = isMod;
    }

    public boolean isIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    

    public boolean isIsBanned() {
        return isBanned;
    }

    public void setIsBanned(boolean isBanned) {
        this.isBanned = isBanned;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }
    
}

    

