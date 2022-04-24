package com.niteesh.collegemate.repository;

import com.niteesh.collegemate.entity.InterestedIn;
import com.niteesh.collegemate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterestedInRepository extends JpaRepository<InterestedIn, Integer> {
}
