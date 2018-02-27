package com.android.alen.mybasicproject.DBUntiy;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Alen on 2018/2/27.
 * GreenDao 数据库的实体类
 */
@Entity
public class Book {
    private String id;
    private String title;
    private String url;
    private String alt_title;
    private String author_intro;
    private String summary;
    private String price;
    @Generated(hash = 1413576097)
    public Book(String id, String title, String url, String alt_title,
            String author_intro, String summary, String price) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.alt_title = alt_title;
        this.author_intro = author_intro;
        this.summary = summary;
        this.price = price;
    }
    @Generated(hash = 1839243756)
    public Book() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getUrl() {
        return this.url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getAlt_title() {
        return this.alt_title;
    }
    public void setAlt_title(String alt_title) {
        this.alt_title = alt_title;
    }
    public String getAuthor_intro() {
        return this.author_intro;
    }
    public void setAuthor_intro(String author_intro) {
        this.author_intro = author_intro;
    }
    public String getSummary() {
        return this.summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getPrice() {
        return this.price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}
