package com.restaurantfinder.api.models;

import com.restaurantfinder.api.validation.GradeValueInRange;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Document(collection="grades")
public class Grade {

    @Id
    private String id;

    @Field
    @NotNull(message = "must not be null")
    private Long gradeDate;

    @Field
    @NotNull(message = "must not be null")
    @Min(value = 0)
    private int score;

    @Field
    @NotNull(message = "must not be null")
    @NotBlank(message = "must not be blank")
    private String restaurantId;

    @Field
    @NotNull(message = "must not be null")
    @NotBlank(message = "must not be blank")
    @GradeValueInRange(message = "must be in range {A, B, C, D, F}")
    private String grade;

    public Grade() {
    }

    public Grade(Long gradeDate, int score, String restaurantId, String grade) {
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
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
