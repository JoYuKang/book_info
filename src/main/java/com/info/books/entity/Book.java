package com.info.books.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, length = 50, name = "bookName")
    private String bookName;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "price", nullable = false)
    private int price; //가격

    private String bookDetail;

    private String publication_date;

    @Column(name = "publisher", nullable = false)
    private String publisher; // 출판사



}
