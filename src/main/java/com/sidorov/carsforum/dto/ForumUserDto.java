package com.sidorov.carsforum.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ForumUserDto {
    private Integer id;
    private String name;
    private Integer age;
}
