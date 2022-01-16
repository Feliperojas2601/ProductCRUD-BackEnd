package com.example.demo.product;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTO")
public class Product {
    @Id
    @SequenceGenerator(
            name="product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Long id;
    private int code;
    private String description;
    private String color;
    private double width;
    private double height;
    private double tall;
    private double value;

    public Product(Long id, int code, String description, String color, double width, double height, double tall, double value) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.color = color;
        this.width = width;
        this.height = height;
        this.tall = tall;
        this.value = value;
    }

    public Product(int code, String description, String color, double width, double height, double tall, double value) {
        this.code = code;
        this.description = description;
        this.color = color;
        this.width = width;
        this.height = height;
        this.tall = tall;
        this.value = value;
    }

    public Product() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
