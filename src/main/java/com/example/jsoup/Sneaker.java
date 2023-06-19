package com.example.jsoup;

public class Sneaker {

    private String brand;
    private String model;
    private String link;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Sneaker{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
