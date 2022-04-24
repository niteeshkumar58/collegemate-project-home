package com.niteesh.collegemate.dto;

import com.niteesh.collegemate.entity.College;
import com.niteesh.collegemate.entity.Hobbies;
import com.niteesh.collegemate.entity.InterestedIn;
import com.niteesh.collegemate.entity.Work;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserPublicData {
    private int userId;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    private List<College> collegeList;
    private List<Hobbies> hobbiesList;
    private List<InterestedIn> interestedInList;
    private List<Work> workList;
}
