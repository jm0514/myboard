package com.board2.service;

import com.board2.entity.Board;
import com.board2.repository.BoardRepository;
import com.board2.requestdto.RequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
//Autowired를 사용하지 않는 이유 수정자 주입과 유사하기 때문임
//NPE를 방지하고 주입받을 필드를 final로 선언할 수 있으며 테스트 코드 작성에도 용이함
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public void write(RequestDto requestDto){
        boardRepository.save(requestDto.ToEntity());
    }
}
