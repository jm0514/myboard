package com.board2.responsedto;

import com.board2.entity.Board;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ResponseDto {

    private Long id;
    private String title;
    private String writer;
    private String content;

    public ResponseDto(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.writer = board.getWriter();
        this.content = board.getContent();
    }

    @Builder
    public ResponseDto(Long id, String title, String writer, String content) {
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.content = content;
    }


}
