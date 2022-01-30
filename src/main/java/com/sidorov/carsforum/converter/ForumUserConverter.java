package com.sidorov.carsforum.converter;

import com.sidorov.carsforum.data.ForumUser;
import com.sidorov.carsforum.dto.ForumUserDto;
import org.springframework.stereotype.Component;

@Component
public class ForumUserConverter {

    public ForumUserDto toForumUserDto(ForumUser forumUser) {
        return ForumUserDto.builder()
                .id(forumUser.getId())
                .name(forumUser.getName())
                .age(forumUser.getAge())
                .build();
    }
}
