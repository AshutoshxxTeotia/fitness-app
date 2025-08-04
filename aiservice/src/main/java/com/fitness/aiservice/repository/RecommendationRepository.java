package com.fitness.aiservice.repository;

import com.fitness.aiservice.Recommendations;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendationRepository extends MongoRepository<Recommendations,String> {
}
