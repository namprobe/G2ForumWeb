/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author APC
 */
public class DBUtils {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection cn = null;
        String ip = "localhost";
        String port = "1433";
        String uid = "sa";
        String pwd = "12345";
        String db = "G2ForumWeb";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://" + ip + ":" + port + ";databasename=" + db + ";";
        Class.forName(driver);
        cn = DriverManager.getConnection(url, uid, pwd);
        return cn;
    }
}
