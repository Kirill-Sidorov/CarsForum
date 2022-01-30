package com.sidorov.carsforum.service;

import com.sidorov.carsforum.converter.ForumUserConverter;
import com.sidorov.carsforum.data.ForumUser;
import com.sidorov.carsforum.data.ForumUserRepository;
import com.sidorov.carsforum.dto.ForumUserDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ForumUserService {

    private final ForumUserRepository forumUserRepository;
    private final ForumUserConverter forumUserConverter;

    public ForumUserDto findById(Integer id) {
        Optional<ForumUser> user = forumUserRepository.findById(id);
        return user.map(forumUserConverter::toForumUserDto).orElse(null);
    }
}
