/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @hanh 
 */
public class Article {
    private int id;
    private String title;
    private String shorDes;
    private String detailDes;
    private Date timePost;
    private int categoryID;
    private int author;
    private String au;
    public Article() {
    }

    public Article(int id, String title, String shorDes, String detailDes, Date timePost, int categoryID) {
        this.id = id;
        this.title = title;
        this.shorDes = shorDes;
        this.detailDes = detailDes;
        this.timePost = timePost;
        this.categoryID = categoryID;
    }

    public Article(int id, String title, String shorDes, String detailDes, Date timePost, int categoryID, int author) {
        this.id = id;
        this.title = title;
        this.shorDes = shorDes;
        this.detailDes = detailDes;
        this.timePost = timePost;
        this.categoryID = categoryID;
        this.author = author;
    }
    public Article(int id, String title, String shorDes, String detailDes, Date timePost, int categoryID, String author) {
        this.id = id;
        this.title = title;
        this.shorDes = shorDes;
        this.detailDes = detailDes;
        this.timePost = timePost;
        this.categoryID = categoryID;
        this.au = author;
    }

    public String getAu() {
        return au;
    }

    public void setAu(String au) {
        this.au = au;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShorDes() {
        return shorDes;
    }

    public void setShorDes(String shorDes) {
        this.shorDes = shorDes;
    }

    public String getDetailDes() {
        return detailDes;
    }

    public void setDetailDes(String detailDes) {
        this.detailDes = detailDes;
    }

    public Date getTimePost() {
        return timePost;
    }

    public void setTimePost(Date timePost) {
        this.timePost = timePost;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
    
}
