package Database;

import model.AccountDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public AccountDB checkLogin(String username, String password) {
        try {
            String query = "SELECT * from account where username = ? and password = ?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,username);
            ps.setString(2,password);
            rs = ps.executeQuery();
            while (rs.next()) {
                AccountDB account = new AccountDB(
                        rs.getString(1),
                        rs.getString(2));
                //System.out.println("get success");
                return account;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    public void addnew(String username, String password) {
        List<AccountDB> list = new ArrayList<>();
        try {
            String query = "insert into account(username, password) values(?,?) ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
      
//    public static void main(String[] args) {
//        new AccountDAO().checkLogin("admin", "admin");
//    }
}
