package com.busanit501.service;

import com.busanit501.hello_project._3jdbc.dto.TodoDTO;
import com.busanit501.hello_project._3jdbc.service.TodoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

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
}
