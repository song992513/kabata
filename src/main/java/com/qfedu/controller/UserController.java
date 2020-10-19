package com.qfedu.controller;

import com.qfedu.service.intf.UserService;
import com.qfedu.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Service;

/**
 * projectName: kabata
 *
 * @author: szc
 * time:2020/10/19 15:38
 * description:
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("all.do")
    public R all(){
        return userService.all();
    }
}
