package com.restaurantfinder.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="grades")
public class Grade {

    @Id
    private String id;

    @Field
    private Long gradeDate;

    @Field
    private String score;

    @Field
    private String restaurantId;

    @Field
    private String grade;

    public Grade(Long gradeDate, String score, String restaurantId, String grade) {
        this.gradeDate = gradeDate;
        this.score = score;
        this.restaurantId = restaurantId;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getGradeDate() {
        return gradeDate;
    }

    public void setGradeDate(long gradeDate) {
        this.gradeDate = gradeDate;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
