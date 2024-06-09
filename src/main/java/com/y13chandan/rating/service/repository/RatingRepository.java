package com.y13chandan.rating.service.repository;

import com.y13chandan.rating.service.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating, String> {

    List<Rating> findByUserId(long userId);
    List<Rating> findByHotelId(String hotelId);

}
