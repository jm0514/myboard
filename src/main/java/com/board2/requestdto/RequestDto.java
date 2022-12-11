package com.board2.requestdto;

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

}
