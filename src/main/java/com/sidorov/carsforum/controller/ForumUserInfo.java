package com.sidorov.carsforum.controller;

import com.sidorov.carsforum.dto.ForumUserDto;
import com.sidorov.carsforum.service.ForumUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@AllArgsConstructor
public class ForumUserInfo {

    private final ForumUserService forumUserService;

    @GetMapping(value = "/user/{id}")
    public String userInfo(@PathVariable int id, Model model) {

        ForumUserDto forumUserDto = forumUserService.findById(id);
        if (forumUserDto == null) {
            model.addAttribute("user", "name");
        } else {
            model.addAttribute("user", forumUserDto.getName());
        }

        return "user_info";
    }
}
