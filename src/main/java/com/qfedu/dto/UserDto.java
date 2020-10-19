package com.qfedu.dto;

import lombok.Data;

/**
 * projectName: kabata
 *
 * @author: szc
 * time:2020/10/19 15:45
 * description:
 */
@Data
public class UserDto {
    private String phone;
    private String nname;//昵称
    private String pwd;//密码
}
