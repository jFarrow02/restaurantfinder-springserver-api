package com.restaurantfinder.api.controllers;

import com.restaurantfinder.api.models.Grade;
import com.restaurantfinder.api.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/grades")
public class GradesController {

    private final GradeService _gradeService;

    @Autowired
    public GradesController(GradeService gradeService) {
        this._gradeService = gradeService;
    }

//    @GetMapping(path="/find-all")
//    public List<Grade> findAllGrades(){
//        return _gradeService.findAllGrades();
//    }

    @GetMapping(path="/find-by")
    public List<Grade> findGradeByRestaurantId(@Param("restaurantId") String restaurantId) {
        return _gradeService.findGradeByRestaurantId(restaurantId);
    }

    @PostMapping(path="/create")
    public Grade createGrade(@RequestBody Grade newGrade) {
        return _gradeService.createGrade(newGrade);
    }
}
