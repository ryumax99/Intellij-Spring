package com.busanit501.hello_project._3jdbc.service;


import com.busanit501.hello_project._3jdbc.dao.TodoDAO;
import com.busanit501.hello_project._3jdbc.domain.TodoVO;
import com.busanit501.hello_project._3jdbc.dto.TodoDTO;
import com.busanit501.hello_project._3jdbc.util.MapperUtil;
import org.modelmapper.ModelMapper;

public enum TodoService {
    INSTANCE;

    // 다른 기능을 불러와서 사용
    private TodoDAO dao;
    // DTO <-> VO
    private ModelMapper modelMapper;

    TodoService() {
        dao = new TodoDAO();
        modelMapper = MapperUtil.INSTANCE.get();
    }

    // 등록 기능
    public void register(TodoDTO todoDTO) throws Exception {
        System.out.println("화면으로 부터 받은 데이터 확인" + todoDTO);
        // DTO -> VO
        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
        System.out.println("TodoService 변환 데이터 확인" + todoVO);
        dao.insert(todoVO);
    }

}
