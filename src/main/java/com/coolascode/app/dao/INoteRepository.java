package com.coolascode.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.entity.Note;

@Repository
public interface INoteRepository extends CrudRepository<Note, Integer> {

}
