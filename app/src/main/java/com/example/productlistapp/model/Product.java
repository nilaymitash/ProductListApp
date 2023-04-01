package com.example.productlistapp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Product implements Serializable {

    private long sku;
    private String item_title;
    private String primary_image;
    private BigDecimal retail_price;
    private ArrayList<String> fun_tags;
    private ArrayList<String> item_characteristics;
    private Feedback feedback;

    public Product(long sku, String item_title, String primary_image, BigDecimal retail_price, ArrayList<String> fun_tags, ArrayList<String> item_characteristics, Feedback feedback) {
        this.sku = sku;
        this.item_title = item_title;
        this.primary_image = primary_image;
        this.retail_price = retail_price;
        this.fun_tags = fun_tags;
        this.item_characteristics = item_characteristics;
        this.feedback = feedback;
    }

    public Product() {
    }

    public long getSku() {
        return sku;
    }

    public void setSku(long sku) {
        this.sku = sku;
    }

    public String getItem_title() {
        return item_title;
    }

    public void setItem_title(String item_title) {
        this.item_title = item_title;
    }

    public String getPrimary_image() {
        return primary_image;
    }

    public void setPrimary_image(String primary_image) {
        this.primary_image = primary_image;
    }

    public BigDecimal getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(BigDecimal retail_price) {
        this.retail_price = retail_price;
    }

    public ArrayList<String> getFun_tags() {
        return fun_tags;
    }

    public void setFun_tags(ArrayList<String> fun_tags) {
        this.fun_tags = fun_tags;
    }

    public ArrayList<String> getItem_characteristics() {
        return item_characteristics;
    }

    public void setItem_characteristics(ArrayList<String> item_characteristics) {
        this.item_characteristics = item_characteristics;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }
}
