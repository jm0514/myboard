package com.board2.controller;

import com.board2.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/")
    public String list(){
        return "board/list";
    }

    @GetMapping("/post")
    public String write(){
        return "board/post";
    }

    @GetMapping("/update")
    public String update(){
        return "board/update";
    }


}
