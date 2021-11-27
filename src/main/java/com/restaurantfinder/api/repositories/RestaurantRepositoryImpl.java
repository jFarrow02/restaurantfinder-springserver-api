package com.restaurantfinder.api.repositories;

import com.restaurantfinder.api.models.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class RestaurantRepositoryImpl implements RestaurantRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Restaurant findByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));
        Restaurant result = mongoTemplate.findOne(query, Restaurant.class);
        return result;
    }

    public Restaurant findByRestaurantId(String restaurantId) {
        Query query = new Query(Criteria.where("restaurantId").is(restaurantId));
        Restaurant result = mongoTemplate.findOne(query, Restaurant.class);
        return result;
    };

    public List<Restaurant> findByBorough(String borough) {
        Query query = new Query(Criteria.where("borough").is(borough));
        List<Restaurant> results = mongoTemplate.find(query, Restaurant.class);
        return results;
    };

    public List<Restaurant> findByCuisine(String cuisine) {
        Query query = new Query(Criteria.where("borough").is(cuisine));
        List<Restaurant> results = mongoTemplate.find(query, Restaurant.class);
        return results;
    };

    @Override
    public <S extends Restaurant> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Restaurant> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Restaurant> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<Restaurant> findAll() {
        return null;
    }

    @Override
    public Iterable<Restaurant> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Restaurant entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Restaurant> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Restaurant> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Restaurant> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Restaurant> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends Restaurant> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends Restaurant> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Restaurant> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Restaurant> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Restaurant> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Restaurant> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Restaurant> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Restaurant, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
