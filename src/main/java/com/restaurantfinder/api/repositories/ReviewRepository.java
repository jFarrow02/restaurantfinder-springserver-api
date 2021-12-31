package com.restaurantfinder.api.repositories;

import com.restaurantfinder.api.models.Review;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository {

    public List<Review> findReviewsByRestaurantId(String restaurantId);

    public Review findReviewByReviewId(String reviewId);

    public Review createReview(Review review);
}
