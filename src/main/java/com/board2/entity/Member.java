package com.board2.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;
    private String username;
    private String password;
    private int age;

    @OneToMany(mappedBy = "member")
    private List<Board> boards = new ArrayList<>();

    @Builder
    public Member(String username, int age){
        this.username = username;
        this.age = age;
    }

}
