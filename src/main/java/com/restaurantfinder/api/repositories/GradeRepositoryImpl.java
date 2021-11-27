package com.restaurantfinder.api.repositories;

import com.restaurantfinder.api.models.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Component
public class GradeRepositoryImpl implements GradeRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Grade> getGradesByRestaurantId(String restaurantId) {
        Query query = new Query(Criteria.where("restaurantId").is(restaurantId));
        List<Grade> result = mongoTemplate.find(query, Grade.class);
        return result;
    }

    @Override
    public <S extends Grade> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Grade> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Grade> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<Grade> findAll() {
        return null;
    }

    @Override
    public Iterable<Grade> findAllById(Iterable<String> strings) {
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
    public void delete(Grade entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Grade> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Grade> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Grade> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Grade> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends Grade> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends Grade> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Grade> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Grade> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Grade> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Grade> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Grade> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Grade, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
