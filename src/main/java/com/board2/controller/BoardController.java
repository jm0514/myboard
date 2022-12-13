package com.board2.controller;

import com.board2.requestdto.BoardRequestDto;
import com.board2.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/board")
    public void postBoard(@RequestBody@Valid BoardRequestDto requestDto){
        boardService.write(requestDto);
    }


}
