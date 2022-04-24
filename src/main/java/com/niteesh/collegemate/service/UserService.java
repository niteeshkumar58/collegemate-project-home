package com.niteesh.collegemate.service;

import com.niteesh.collegemate.dto.UserPublicData;
import com.niteesh.collegemate.entity.User;
import com.niteesh.collegemate.entity.UserData;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public UserData addNewUser(UserData userData);

    public List<UserPublicData> getUsersLikedByX(String id);

}
