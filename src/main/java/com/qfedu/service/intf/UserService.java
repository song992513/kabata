package com.qfedu.service.intf;

import com.qfedu.entity.User;
import com.qfedu.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: kabata
 *
 * @author: szc
 * time:2020/10/19 15:46
 * description:
 */

public interface UserService {

    R<List<User>> all();

}
