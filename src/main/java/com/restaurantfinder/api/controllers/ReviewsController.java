package com.restaurantfinder.api.controllers;

import com.restaurantfinder.api.ResourceTypes;
import com.restaurantfinder.api.exceptions.RecordCreateFailedException;
import com.restaurantfinder.api.exceptions.ResourceNotFoundException;
import com.restaurantfinder.api.models.Review;
import com.restaurantfinder.api.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/restaurantfinder/reviews")
public class ReviewsController {

    @Autowired
    private ReviewService  _reviewService;

    public ReviewsController(ReviewService reviewService) {
        this._reviewService = reviewService;
    }

    @GetMapping(path = "find/restaurantId/{restaurantId}")
    public HttpEntity<List<Review>> getReviewsByRestaurantId(@PathVariable String restaurantId) {
        List<Review> reviews = this._reviewService.findReviewsByRestaurantId(restaurantId);
        if(reviews == null) {
            throw new ResourceNotFoundException(ResourceTypes.REVIEW, restaurantId);
        }
        return new ResponseEntity<>(reviews, HttpStatus.OK);
    }

    @GetMapping(path = "find/reviewId/{reviewId}")
    public HttpEntity<Review> getReviewByReviewId(@PathVariable String reviewId) {
        Review review = this._reviewService.findReviewByReviewId(reviewId);
        if(review == null) {
            throw new ResourceNotFoundException(ResourceTypes.REVIEW, reviewId);
        }
        return new ResponseEntity<>(review, HttpStatus.OK);
    }

    @PostMapping(path = "/create")
    public HttpEntity<Review> createReview(@RequestBody Review review) {
        Review r = this._reviewService.createReview(review);
        if(r == null) {
            throw new RecordCreateFailedException(ResourceTypes.REVIEW);
        }
        return new ResponseEntity<>(r, HttpStatus.CREATED);
    }
}
