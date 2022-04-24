package com.niteesh.collegemate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Work {
    @Id
    @SequenceGenerator(
            name = "custom_sequence_generator",
            sequenceName = "custom_sequence_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "custom_sequence_generator"
    )
    private int id;
//    @OneToOne(
//            cascade = CascadeType.ALL
//    )
//    @JoinColumn(
//            name = "user_id",
//            referencedColumnName = "userId"
//    )
//    private User user;
    private String workName;
    private String workLocation;

}
