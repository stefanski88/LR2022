package io.backend.model;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "userTable")
@Table(name = "userTable")

public class UserEntity {
    @Id
    @GeneratedValue
    @Column(name = "userId", nullable = false, unique = true)
    private Long userId;

    @Column(name = "userName", nullable = false, unique = true)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "userRole", nullable = false)
    private String userRole;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private Date age; //int or Date (for calculation purposes)

    @Column(name = "gender")
    private String gender;

    @Column(name = "location")
    private String location;

    @Column(name = "aboutMe")
    private String aboutMe;

    @Column(name = "drivingSince")
    private Date drivingSince;

    @Column(name = "drivingExp")
    private String drivingExp;

    @Column(name  = "drivingStyle")
    private String drivingStyle;

    @Column(name = "registeredOn")
    private Date registeredOn;

    @Column(name = "deletedOn")
    private Date deletedOn;

}
