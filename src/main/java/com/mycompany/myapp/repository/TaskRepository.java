package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Task;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB reactive repository for the Task entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TaskRepository extends ReactiveMongoRepository<Task, String> {}
