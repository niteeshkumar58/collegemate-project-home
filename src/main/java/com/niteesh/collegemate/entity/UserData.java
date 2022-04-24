package com.niteesh.collegemate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.criteria.CriteriaBuilder;
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserData {
    private User user;
    private Hobbies hobbies;
    private College college;
    private Work work;
    private InterestedIn interestedIn;
    private Liked liked;
    private LikedBy likedBy;
}

