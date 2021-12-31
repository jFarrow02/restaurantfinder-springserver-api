package com.restaurantfinder.api.services;

import com.restaurantfinder.api.models.Review;
import com.restaurantfinder.api.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository _reviewRepository;

    public Review findReviewByReviewId(String reviewId) {
        return this._reviewRepository.findReviewByReviewId(reviewId);
    }

    public List<Review> findReviewsByRestaurantId(String restaurantId) {
        return this._reviewRepository.findReviewsByRestaurantId(restaurantId);
    }

    public Review createReview(Review review) {
        return this._reviewRepository.createReview(review);
    }
}
