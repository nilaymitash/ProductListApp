package com.example.productlistapp.model;

import java.math.BigDecimal;
import java.util.List;

public class Feedback {
    private float rating;
    private String review;

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
