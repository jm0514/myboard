package com.board2;

import com.board2.entity.Member;
import com.board2.repository.BoardRepository;
import com.board2.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@RequiredArgsConstructor
public class InitDB {

    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.userDBInit();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService{

        private final MemberRepository memberRepository;
        private final BoardRepository boardRepository;
        public void userDBInit(){

            List<Member> memberList = memberRepository.findAll();
            if(memberList.size() == 0){
                Member member = Member.builder()
                        .username("정민")
                        .age(27)
                        .build();
                memberRepository.save(member);
            }
        }
    }
}
