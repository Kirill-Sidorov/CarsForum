package com.sidorov.carsforum.controller;

import com.sidorov.carsforum.dto.ForumUserDto;
import com.sidorov.carsforum.service.ForumUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RESTForumUserInfo {

    private final ForumUserService forumUserService;

    @GetMapping(value = "/rest/{id}")
    public ForumUserDto restUser(@PathVariable int id) {
        return forumUserService.findById(id);
    }
}
