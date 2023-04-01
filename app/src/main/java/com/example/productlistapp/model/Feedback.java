package com.example.productlistapp.model;

import java.math.BigDecimal;
import java.util.List;

public class Feedback {
    private List<BigDecimal> ratings;
    private List<String> review;

    public List<BigDecimal> getRatings() {
        return ratings;
    }

    public void setRatings(List<BigDecimal> ratings) {
        this.ratings = ratings;
    }

    public List<String> getReview() {
        return review;
    }

    public void setReview(List<String> review) {
        this.review = review;
    }
}
