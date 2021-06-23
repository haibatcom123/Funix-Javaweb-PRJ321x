/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Article;
import entity.Author;
import entity.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @hanh
 */
public class ArticleDAO {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public List<Article> getTop3Article() {
        List<Article> list = new ArrayList<>();
        try {
            String query = "select top 3 * from article order by timePost desc";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Article p = new Article(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getInt(6));
                list.add(p);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Article> getAllArticle() {
        List<Article> list = new ArrayList<>();
        try {
            // String query = "select * from article order by timePost desc";
            String query = "select * from\n"
                    + " article as ar, author as au\n"
                    + " where ar.author = au.id\n"
                    + " order by timePost desc";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Article p = new Article(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getInt(6),
                        rs.getString(9)
                );
                list.add(p);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Article> getArticleByCid(int cid) {
        List<Article> list = new ArrayList<>();
        try {
            String query = "select  * from article where categoryid = ? order by timePost desc";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                Article p = new Article(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getInt(6));
                list.add(p);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Article> getArticleByAuthor(int aid) {
        List<Article> list = new ArrayList<>();
        try {
            String query = "select  * from article where author = ? order by timePost desc";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, aid);
            rs = ps.executeQuery();
            while (rs.next()) {
                Article p = new Article(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getInt(6));
                list.add(p);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Article getArticleByID(int id) {
        try {
            String query = " select * from \n"
                    + " article as ar, author as au\n"
                    + " where ar.id = ?\n"
                    + " and ar.author = au.id";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Article p = new Article(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getInt(6),
                        rs.getString(9)
                );
                return p;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addnew(String title, String shortDes, String detailDes, int cateID, int author) {
        List<Article> list = new ArrayList<>();
        try {
            String query = "insert into Article(title, shortDes,detailDes,timePost,categoryId,author) values(?,?,?,GETDATE(),?,?) ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, title);
            ps.setString(2, shortDes);
            ps.setString(3, detailDes);
            ps.setInt(4, cateID);
            ps.setInt(5, author);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void updatePost(String title, String shortDes, String detailDes, int cateID, int id) {
        try {
            String query = "UPDATE [dbo].[Article]\n"
                    + "   SET [title] = ?\n"
                    + "      ,[shortDes] = ? \n"
                    + "      ,[detailDes] = ?\n"
                    + "      ,[timePost] = GETDATE()\n"
                    + "      ,[categoryId] = ?\n"
                    + " WHERE id = ?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, title);
            ps.setString(2, shortDes);
            ps.setString(3, detailDes);
            ps.setInt(4, cateID);
            ps.setInt(5, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Category> getCategory() {
        List<Category> list = new ArrayList<>();
        try {
            String query = "select * from category";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Category p = new Category(rs.getInt(1),
                        rs.getString(2));
                list.add(p);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
