package com.example.demo.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Long> {
}
