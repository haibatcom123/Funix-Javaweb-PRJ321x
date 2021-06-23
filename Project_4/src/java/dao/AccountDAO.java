package dao;

import context.DBContext;
import entity.Author;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountDAO {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public Author checkLogin(String username, String password) {
        try {
            String query = "SELECT * from author where username like ? and password like ?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + username + "%");
            ps.setString(2, "%" + password + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Author account = new Author(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3));
                return account;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
      

}
