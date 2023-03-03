package com.loda.testspringboot;

import java.util.List;

public interface TodoRepository {
    List<Todo> findAll();
    Todo findById(int id);
}
