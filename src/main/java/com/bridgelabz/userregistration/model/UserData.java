package com.bridgelabz.userregistration.model;

import com.bridgelabz.userregistration.dto.UserDTO;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="User_Data")
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_Id")
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public UserData(){

    }

    public UserData(UserDTO userDTO){
        this.firstName = userDTO.firstName;
        this.lastName = userDTO.lastName;
        this.email = userDTO.email;
        this.password = userDTO.password;
    }
}
