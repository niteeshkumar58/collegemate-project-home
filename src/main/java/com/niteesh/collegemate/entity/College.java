package com.niteesh.collegemate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class College {
    @Id
    @SequenceGenerator(
            name = "college_sequence_generator",
            sequenceName = "college_sequence_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "college_sequence_generator"
    )
    private int id;
    private String courseName;
    private String collegeName;
//    @OneToOne(
//            cascade = CascadeType.ALL
//    )
//    @JoinColumn(
//            name = "user_id",
//            referencedColumnName = "userId"
//    )
//    private User user;
}
