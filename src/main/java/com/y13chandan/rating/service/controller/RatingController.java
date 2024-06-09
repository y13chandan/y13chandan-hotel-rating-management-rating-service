package com.y13chandan.rating.service.controller;

import com.y13chandan.rating.service.entities.Rating;
import com.y13chandan.rating.service.repository.RatingRepository;
import com.y13chandan.rating.service.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
        Rating rating1 = ratingService.saveRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings() {
        List<Rating> ratings = ratingService.getAllRatings();
        return ResponseEntity.ok(ratings);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable("userId") long userId) {
        List<Rating> ratings = ratingService.getRatingByUserId(userId);
        return ResponseEntity.ok(ratings);
    }

    @GetMapping("hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable("hotelId") String hotelId) {
        List<Rating> ratings = ratingService.getRatingByHotelId(hotelId);
        return ResponseEntity.ok(ratings);
    }

}
