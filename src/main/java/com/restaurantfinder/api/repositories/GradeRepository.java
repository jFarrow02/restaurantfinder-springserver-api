package com.restaurantfinder.api.repositories;
import com.restaurantfinder.api.models.Grade;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository {

    @Query("{restaurantId: '?0'}")
    List<Grade> getGradesByRestaurantId(String restaurantId);

    Grade createGrade(Grade grade);
}
