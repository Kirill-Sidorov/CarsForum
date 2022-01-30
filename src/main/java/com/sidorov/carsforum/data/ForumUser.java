package com.sidorov.carsforum.data;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="forum_user")
@Data
public class ForumUser {
    @Id
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer age;
}
