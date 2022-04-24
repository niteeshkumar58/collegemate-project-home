package com.niteesh.collegemate.service;

import com.niteesh.collegemate.dto.UserPublicData;
import com.niteesh.collegemate.entity.*;
import com.niteesh.collegemate.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.valueOf;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CollegeRepository collegeRepository;
    @Autowired
    private WorkRepository workRepository;
    @Autowired
    private LikedRepository likedRepository;
    @Autowired
    private LikedByRepository likedByRepository;
    @Autowired
    private InterestedInRepository interestedInRepository;
    @Autowired
    private HobbiesRepository hobbiesRepository;
//    @Autowired
    private Work work;
//    @Autowired
    private User user;
//    @Autowired
    private College college;
//    @Autowired
    private Liked liked;
//    @Autowired
    private LikedBy likedBy;
//    @Autowired
    private InterestedIn interestedIn;
//    @Autowired
    private Hobbies hobby;

    @Override
    public UserData addNewUser(UserData userData) {
        user = userRepository.save(userData.getUser());
        college = collegeRepository.save(userData.getCollege());
        work = workRepository.save(userData.getWork());
        interestedIn = interestedInRepository.save(userData.getInterestedIn());
        liked = likedRepository.save(userData.getLiked());
        likedBy = likedByRepository.save(userData.getLikedBy());
        hobby = hobbiesRepository.save(userData.getHobbies());
        userData.setUser(user);
        userData.setCollege(college);
        userData.setHobbies(hobby);
        userData.setInterestedIn(interestedIn);
        userData.setLiked(liked);
        userData.setWork(work);
        userData.setLikedBy(likedBy);

        return userData;
    }

    UserPublicData userPublicData = new UserPublicData();
    @Override
    public List<UserPublicData> getUsersLikedByX(String id) {
        List<UserPublicData> userPublicDataList = new ArrayList<>();
        for (LikedBy likedBy: likedByRepository.findByUser_id(Integer.valueOf(id))) {
            User user = userRepository.findByUserId(likedBy.getLikedByUserId());
            System.out.println(user);
            userPublicData.setUserId(user.getUserId());
            userPublicData.setAge(user.getAge());
            userPublicData.setGender(user.getGender());
            userPublicData.setFirstName(user.getFirstName());
            userPublicData.setLastName(user.getLastName());
            userPublicData.setCollegeList(user.getCollegeList());
            userPublicData.setHobbiesList(user.getHobbiesList());
            userPublicData.setInterestedInList(user.getInterestedInList());
            userPublicData.setWorkList(user.getWorkList());
            userPublicDataList.add(userPublicData);
        }

        return userPublicDataList;
    }
}
