package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Location;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB reactive repository for the Location entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LocationRepository extends ReactiveMongoRepository<Location, String> {}
