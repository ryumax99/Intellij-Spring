package com.busanit501.service;

import com.busanit501.hello_project._3jdbc.dto.TodoDTO;
import com.busanit501.hello_project._3jdbc.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

@Slf4j
public class TodoServiceTests {
    private TodoService todoService;

    @BeforeEach
    public void ready() {
        todoService = TodoService.INSTANCE;
    }

    @Test
    public void testRegister() throws Exception {
        // 화면 -> 컨트롤러 부터 , DTO를 받아왔다고 가정,
        // 더미 DTO 를 생성하기.
        TodoDTO todoDTO = TodoDTO.builder()
                .title("서비스, 단위테스트 진행")
                .dueDate(LocalDate.now())
                .build();
        // 서비스에서 기능 테스트.
        todoService.register(todoDTO);

    }

    // 하나 조회 테스트
    @Test
    public void testGetByTno() throws Exception {
        TodoDTO todoDTO = todoService.getByTno(8L);
        log.info("서비스 단위테스트 하나조회 확인 ");
        log.info("todoDTO:"+todoDTO);

    }

    @Test
    public void testRemove() throws Exception{
        // 실제 삭제 할 tno 번호 파악
        todoService.remove(10L);
        log.info("서비스 단위테스트 삭제 확인 ");

    }

    // 수정 기능.
    @Test
    public void testModify() throws Exception{
        // 실제 수정 할 데이터 파악
        TodoDTO todoDTO = todoService.getByTno(3L);
        todoDTO.setTitle("제목만 변경해보기.");
        log.info("서비스 단위테스트 수정 확인 todoDTO :"+todoDTO);
        todoService.modify(todoDTO);
        log.info("서비스 단위테스트 수정 확인2 ");

    }




}
