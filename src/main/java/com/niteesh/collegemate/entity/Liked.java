package com.niteesh.collegemate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Liked {
    @Id
    @SequenceGenerator(
            name = "liked_sequence_generator",
            sequenceName = "liked_sequence_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "liked_sequence_generator"
    )
    private int id;
    private int likedByUser;
//
//    @OneToOne(
//            cascade = CascadeType.ALL
//    )
//    @JoinColumn(
//            name = "liked_user_id",
//            referencedColumnName = "userId"
//    )

//
//    @OneToOne(
//            cascade = CascadeType.ALL
//    )
//    @JoinColumn(
//            name = "user_id",
//            referencedColumnName = "userId"
//    )
//    private User user;
}
