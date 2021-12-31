package com.restaurantfinder.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Document(collection = "reviews")
public class Review {

    @Id
    private String id;

    @Field(name = "restaurantId")
    @NotNull(message = "must not be null")
    @NotBlank(message = "must not be blank")
    private String restaurantId;

    @Field(name = "gradeId")
    @NotNull(message = "must not be null")
    @NotBlank(message = "must not be blank")
    private String gradeId;

    @Field(name = "reviewText")
    @NotNull(message = "must not be null")
    @NotBlank(message = "must not be blank")
    private String reviewText;

    @Field(name = "reviewer")
    @NotNull(message = "must not be null")
    @NotBlank(message = "must not be blank")
    private String reviewer;

    @Field(name = "reviewDate")
    @NotNull(message = "must not be null")
    @NotBlank(message = "must not be blank")
    private long reviewDate;

    @Field(name = "reviewId")
    @NotNull(message = "must not be null")
    @NotBlank(message = "must not be blank")
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
