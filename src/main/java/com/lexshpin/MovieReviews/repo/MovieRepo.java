package com.lexshpin.MovieReviews.repo;

import com.lexshpin.MovieReviews.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepo extends MongoRepository<Movie, ObjectId> {
  public Optional<Movie> findMovieByImdbId(String imdbId);
}
