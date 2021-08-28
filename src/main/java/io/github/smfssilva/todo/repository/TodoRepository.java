package io.github.smfssilva.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.smfssilva.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
