package com.ynov.nantes.soap.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entité Livre persistente en base de données.
 * 
 * @author Matthieu BACHELIER
 * @since 2020-10
 * @version 1.0
 */
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String ISBN;
    private Date dateOfPublish;
    // getters / setters
    public Book(Integer id, String title, String ISBN, Date dateOfPublish) {
        this.id = id;
        this.title = title;
        this.ISBN = ISBN;
        this.dateOfPublish = dateOfPublish;
    }

    public Book() {
        this.id = 0;
        this.title = "";
        this.ISBN = "";
        this.dateOfPublish = null;
    }
    
    public String getISBN() {
      return ISBN;
    }
    public void setISBN(String iSBN) {
      ISBN = iSBN;
    }
    public String getTitle() {
      return title;
    }
    public void setTitle(String title) {
      this.title = title;
    }
    public Integer getId() {
      return id;
    }
    public void setId(Integer id) {
      this.id = id;
    }
    public Date getDateOfPublish() {
      return dateOfPublish;
    }
    public void setateOfPublish(Date dateOfPublish) {
      this.dateOfPublish = dateOfPublish;
    }
    
    @ManyToOne
    private Author author;

    /// TODO les autres champs

    /// TODO la relation Foreign Key (ManyToOne ? ManyToMany ? OneToMany ?)
}