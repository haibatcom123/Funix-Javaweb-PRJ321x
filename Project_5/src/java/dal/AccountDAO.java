/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Yajin
 */
public class AccountDAO extends BaseDAO {

    public boolean checkPassword(String email, String password) {
        try {
            Statement stmt = connection.createStatement();
            // String sql = "SELECT a.password FROM dbo.Account AS a WHERE a.email = '" + email + "'";
            String sql = "select [password] from [User] \n"
                    + "where username like '"+email+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String pass = rs.getString("password");
                if (pass.equals(password)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
