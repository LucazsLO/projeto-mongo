package com.estudos.workshopmongo.domain;

import com.estudos.workshopmongo.DTO.AuthorDTO;
import com.estudos.workshopmongo.DTO.CommentDTO;
import org.springframework.data.annotation.Id;

import javax.xml.stream.events.Comment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Post implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String title;
    private Date date;
    private String body;
    private AuthorDTO author;


    private List<CommentDTO> comments = new ArrayList<>();
    public Post(){

    }

    public Post(String id, Date date, String title, String body, AuthorDTO author) {
        super();
        this.body = body;
        this.date = date;
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    public List<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }



}
