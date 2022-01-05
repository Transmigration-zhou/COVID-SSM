package cn.edu.zust.se.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String userNum;
    private Integer collegeNum;
    private Integer majorNum;
    private Integer classNum;
    private Integer userType;
    private String userName;
    private String password;
    private boolean sex;
    private String telephone;
    private Integer state;
}