package com.niteesh.collegemate.repository;

import com.niteesh.collegemate.entity.LikedBy;
import com.niteesh.collegemate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikedByRepository extends JpaRepository<LikedBy, Integer> {

    @Query("select s from User s join LikedBy l where l.userId = ?1")
    public List<LikedBy> findByUserId(int id);
}
