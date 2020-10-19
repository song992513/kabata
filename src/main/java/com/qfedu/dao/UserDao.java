package com.qfedu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.entity.User;
import org.springframework.stereotype.Repository;

/**
 * projectName: kabata
 *
 * @author: szc
 * time:2020/10/19 15:40
 * description:基于Mybatis-plus 实现持久化层
 */
@Repository
public interface UserDao extends BaseMapper<User> {
}
