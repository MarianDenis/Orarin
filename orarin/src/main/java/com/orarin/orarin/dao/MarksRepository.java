package com.orarin.orarin.dao;

import com.orarin.orarin.model.Marks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarksRepository extends CrudRepository<Marks, Integer> {
}
