package com.restaurantfinder.api.controllers;

import com.restaurantfinder.api.ResourceTypes;
import com.restaurantfinder.api.exceptions.RecordCreateFailedException;
import com.restaurantfinder.api.exceptions.ResourceNotFoundException;
import com.restaurantfinder.api.exceptions.ValidationFailedException;
import com.restaurantfinder.api.models.Grade;
import com.restaurantfinder.api.models.HttpResponse;
import com.restaurantfinder.api.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.ConstraintViolationException;
import java.util.List;

@RestController
@RequestMapping(path="/grades")
public class GradesController {

    private final GradeService _gradeService;

    @Autowired
    public GradesController(GradeService gradeService) {
        this._gradeService = gradeService;
    }

    @GetMapping(path="/find-by")
    public HttpEntity<List<Grade>> findGradeByRestaurantId(@Param("restaurantId") String restaurantId) {
        List<Grade> result =  _gradeService.findGradeByRestaurantId(restaurantId);
        if(result == null) {
            throw new ResourceNotFoundException(ResourceTypes.GRADE, restaurantId);
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping(path="/create")
    public HttpEntity<Grade> createGrade(@RequestBody Grade newGrade) {

        try{
            Grade result = _gradeService.createGrade(newGrade);
            if(result == null) {
                throw new RecordCreateFailedException(ResourceTypes.GRADE);
            }
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        } catch (ConstraintViolationException e) {
            throw new ValidationFailedException(e.getMessage());
        }
    }
}
