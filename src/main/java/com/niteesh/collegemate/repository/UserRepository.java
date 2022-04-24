package com.niteesh.collegemate.repository;

import com.niteesh.collegemate.dto.UserPublicData;
import com.niteesh.collegemate.entity.College;
import com.niteesh.collegemate.entity.User;
import com.niteesh.collegemate.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUserId(int id);

    public List<User> findAllByUserId(int id);





}