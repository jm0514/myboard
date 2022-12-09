package com.board2.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    private String title;

    @Lob
    //Large Object의 줄임말이다. (CLOB는 문자 대형 객체, BLOB는 이진 대형 객체 (이미지, 동영상 등등))
    private String content;

    @CreatedDate //등록날짜
    private LocalDateTime regData;

    @LastModifiedDate //수정날짜
    private LocalDateTime uptData;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    public Board update(String title, String content){
        this.title=title;
        this.content=content;
        return this;
    }

    @Builder
    public Board(String title, Member member, String content) {
        this.title = title;
        this.content = content;
        this.member = member;
    }

}
