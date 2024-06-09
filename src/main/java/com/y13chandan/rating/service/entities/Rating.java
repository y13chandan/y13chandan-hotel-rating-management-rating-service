package com.y13chandan.rating.service.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("user_ratings")
public class Rating {
    @Id
    private String ratingId;
    private long userId;
    private String hotelId;
    private int rating;
    private String feedback;
}
