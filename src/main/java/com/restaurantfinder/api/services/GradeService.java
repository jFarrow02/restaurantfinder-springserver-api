package com.restaurantfinder.api.services;

import com.restaurantfinder.api.models.Grade;
import com.restaurantfinder.api.repositories.GradeRepository;
import com.restaurantfinder.api.repositories.GradeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {

    private final GradeRepositoryImpl _gradeRepository;

    @Autowired
    public GradeService(GradeRepositoryImpl gradeRepository) {
        this._gradeRepository = gradeRepository;
    }

    public List<Grade> findAllGrades() {
        return _gradeRepository.findAll();
    }

    public List<Grade> findGradeByRestaurantId(String restaurantId) {
        return _gradeRepository.getGradesByRestaurantId(restaurantId);
    }

    public Grade createGrade(Grade grade) {
//        System.out.println("in createGrade:" + grade.getRestaurantId()); // OK
        return _gradeRepository.createGrade(grade);
    }
}
