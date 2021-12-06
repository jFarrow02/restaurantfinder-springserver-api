package com.restaurantfinder.api.repositories;

import com.restaurantfinder.api.models.Zipcode;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZipcodeRepository {

    List<Zipcode> findAllZipcodes();
}
