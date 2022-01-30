package com.sidorov.carsforum.controller;

import com.sidorov.carsforum.dto.ForumUserDto;
import com.sidorov.carsforum.service.ForumUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ForumUserInfo {

    private final ForumUserService forumUserService;

    @GetMapping("/userinfo")
    public ForumUserDto userInfo() {
        return forumUserService.findById(1);
    }
}
