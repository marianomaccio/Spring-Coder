package com.coder.jpaservice.dto;

import com.coder.jpaservice.model.ClientModel;
import com.coder.jpaservice.model.UserModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.catalina.User;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
public class UserDto {

    private String userName;

    private String password;

    private ClientModel clientModel;

    public static UserDto from(UserModel userModel ){
        return new UserDto(userModel.getUserName(), userModel.getPassword(), userModel.getClientModel());
    }
}
