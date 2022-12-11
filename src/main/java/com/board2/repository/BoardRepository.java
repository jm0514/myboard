package com.board2.repository;

import com.board2.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// 엔티티에 의해 생성된 DB에 접근하는 메서드를 사용하기 위한 인터페이스
@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {


}
