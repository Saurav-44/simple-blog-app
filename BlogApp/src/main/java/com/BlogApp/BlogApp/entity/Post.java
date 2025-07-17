package com.BlogApp.BlogApp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String name;

    @Column(length = 3500)
    private String content;

    private String postedBy;
    private String img;
    private Date date;
    private int likeCount;
    private int viewCount;

    @ElementCollection
    private List<String> tags;

    public void setLikeCount(int i) {
        this.likeCount = i;
    }

    public void setViewCount(int i) {
        this.viewCount = i;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getViewCount() {
        return this.viewCount;
    }

    public int getLikeCount() {
        return this.likeCount;
    }
}
