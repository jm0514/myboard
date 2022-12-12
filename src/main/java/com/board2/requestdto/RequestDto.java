package com.board2.requestdto;

import com.board2.entity.Board;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class RequestDto {

    @NotBlank(message = "제목을 입력하세요.")
    private String title;

    @NotBlank(message = "이름을 입력하세요.")
    private String writer;

    @NotBlank(message = "내용을 입력하세요.")
    private String content;

    @Builder
    public RequestDto(String title, String writer, String content) {
        this.title = title;
        this.writer = writer;
        this.content = content;
    }

    public Board ToEntity(){
        return Board.builder()
                .title(this.title)
                .writer(this.writer)
                .content(this.content)
                .build();
    }

}
