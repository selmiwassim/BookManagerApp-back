package com.wassim.BookStore.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private int price;
    private int quantity;
    private String imageURL;
    @Column(nullable = false, updatable = false)
    private String bookCode;


    // Constructor
    public Book() {
        // Default constructor
    }

    // Parameterized constructor
    public Book(Long id, String name, int price, int quantity, String imageURL, String bookCode) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.imageURL = imageURL;
        this.bookCode = bookCode;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getBookCode() {
        return bookCode;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    @Override
    public String toString(){
        return "Book{" +
                "id=" + id +
                ", name ='" + name + "\' " +
                ", price = " + price + "\' " +
                ", quantity = " + quantity + "\' " +
                ", imageURL = " + imageURL + "\' " +
                '}';
    }

}



