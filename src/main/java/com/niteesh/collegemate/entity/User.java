package com.niteesh.collegemate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    @SequenceGenerator(name = "user_sequence_generator", sequenceName = "user_sequence_generator")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence_generator")
    private int userId;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    @OneToMany(targetEntity = College.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private List<College> collegeList;

    @OneToMany(targetEntity = Liked.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private List<Liked> likedList;

    @OneToMany(targetEntity = Hobbies.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private List<Hobbies> hobbiesList;

    @OneToMany(targetEntity = InterestedIn.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private List<InterestedIn> interestedInList;

    @OneToMany(targetEntity = LikedBy.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private List<LikedBy> likedByList;

    @OneToMany(targetEntity = Work.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private List<Work> workList;

}
