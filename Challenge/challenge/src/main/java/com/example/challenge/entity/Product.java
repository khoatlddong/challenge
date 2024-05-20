package com.example.challenge.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name="product")
@Data
@Getter
@Setter

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 9)
    private String code;

    @Column(nullable = false, length = 90)
    private String name;

    @Column(nullable = false, length = 28)
    private String category;

    @Column(nullable = true, length = 28)
    private String brand;

    @Column(nullable = true, length = 21)
    private String type;

    @Column(nullable = true, length = 180)
    private String description;

    @CreationTimestamp
    private Date createdAt;

    @CreationTimestamp
    private Date updatedAt;
}
