package com.niteesh.collegemate.repository;

import com.niteesh.collegemate.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface WorkRepository extends JpaRepository<Work, Integer> {
}
