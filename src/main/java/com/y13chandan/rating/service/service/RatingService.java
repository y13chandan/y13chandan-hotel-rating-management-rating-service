package com.y13chandan.rating.service.service;

import com.y13chandan.rating.service.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {
    Rating saveRating(Rating rating);
    List<Rating> getAllRatings();
    List<Rating> getRatingByUserId(long userId);
    List<Rating> getRatingByHotelId(String hotelId);
}
