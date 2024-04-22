/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2.userTbl;

import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class LoginErrors {

    private String userNameLenError = "";
    private String passwordLenError = "";
    private String confirmNotMatch = "";
    private String accountExisted = "";

    public String getUserNameLenError() {
        return userNameLenError;
    }

    public String getPasswordLenError() {
        return passwordLenError;
    }

    public String getConfirmNotMatch() {
        return confirmNotMatch;
    }

    public String getAccountExisted() {
        return accountExisted;
    }

    public void setUserNameLenError(String userNameLenError) {
        this.userNameLenError = userNameLenError;
    }

    public void setPasswordLenError(String passwordLenError) {
        this.passwordLenError = passwordLenError;
    }

    public void setConfirmNotMatch(String confirmNotMatch) {
        this.confirmNotMatch = confirmNotMatch;
    }

    public void setAccountExisted(String accountExisted) {
        this.accountExisted = accountExisted;
    }

    public boolean checkUserNameLen(String userName, int len) {
        userName = userName.trim();
        if (userName.length() < len) {
            userNameLenError = " Username length must be larger than " + len +" characters" ;
            return false;
        }
        return true;
    }

    public boolean checkPasswordLen(String password, int len) {
        password = password.trim();
        if (password.length() != 5) {
            passwordLenError = " Password length must be " + len + " characters";
            return false;
        }
        return true;
    }

    public boolean checkConfirmNotMatch(String password, String confirm) {
        password = password.trim();
        confirm = confirm.trim();
        if (!password.equals(confirm)) {
            confirmNotMatch = "password and confirm not match";
            return false;
        }
        return true;
    }

    public boolean checkAccountExisted(String userName) throws SQLException, ClassNotFoundException {
        userName = userName.trim();
        userDAO dao = new userDAO();
        boolean flag = dao.checkAccountExisted(userName);
        if (flag) {
            accountExisted = userName + " Existed";
            return false;
        } else {
            return true;
        }

    }
    public boolean checkEmailExisted(String email) throws SQLException, ClassNotFoundException {
        email = email.trim();
        userDAO dao = new userDAO();
        boolean flag = dao.checkEmailExisted(email);
        if (flag) {
            accountExisted = email + " Existed";
            return false;
        } else {
            return true;
        }

    }
}
