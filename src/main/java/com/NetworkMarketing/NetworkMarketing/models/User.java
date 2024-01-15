package com.NetworkMarketing.NetworkMarketing.models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class User extends BaseModel{

    private String userName;
    private String password;
    private String phoneNumber;
    private String address;
    private List<LeftDownline> leftDownline;
    private List<RightDownLine> rightDownLine;
}
