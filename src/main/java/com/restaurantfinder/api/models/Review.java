package com.restaurantfinder.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "reviews")
public class Review {

    @Id
    private long id;

    @Field(name = "restaurantId")
    private String restaurantId;

    @Field(name = "gradeId")
    private String gradeId;

    @Field(name = "reviewText")
    private String reviewText;

    @Field(name = "reviewer")
    private String reviewer;

    @Field(name = "reviewDate")
    private long reviewDate;

    @Field(name = "reviewId")
    private String reviewId;

    public Review(String restaurantId, String gradeId, String reviewText, String reviewer, long reviewDate, String reviewId) {
        this.restaurantId = restaurantId;
        this.gradeId = gradeId;
        this.reviewText = reviewText;
        this.reviewer = reviewer;
        this.reviewDate = reviewDate;
        this.reviewId = reviewId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public long getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(long reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }
}
