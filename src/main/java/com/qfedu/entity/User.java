package com.qfedu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * projectName: kabata
 *
 * @author: szc
 * time:2020/10/19 15:41
 * description:
 */
@Data
@TableName("t_user")
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String phone;
    private String nickname;
    private String password;
    private int flag;//标记位 1有效 2无效
}
