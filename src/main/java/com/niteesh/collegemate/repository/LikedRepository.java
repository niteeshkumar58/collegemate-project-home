package com.niteesh.collegemate.repository;

import com.niteesh.collegemate.entity.Liked;
import com.niteesh.collegemate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikedRepository extends JpaRepository<Liked, Integer> {
}
