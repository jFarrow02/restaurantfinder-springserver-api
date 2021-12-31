package com.restaurantfinder.api.repositories;

import com.restaurantfinder.api.models.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReviewRepositoryImpl implements ReviewRepository {

    @Autowired
    private MongoTemplate _mongoTemplate;

    public List<Review> findReviewsByRestaurantId(String restaurantId) {
        Query query = new Query(Criteria.where("restaurantId").is(restaurantId));
        return this._mongoTemplate.find(query, Review.class, "reviews");
    }

    public Review findReviewByReviewId(String reviewId) {
        Query query = new Query(Criteria.where("reviewId").is(reviewId));
        return this._mongoTemplate.findOne(query, Review.class, "reviews");
    }

    public Review createReview(Review review) {
        return this._mongoTemplate.insert(review, "reviews");
    }
}
