package com.busanit501.spring_project.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@ToString
//@RequiredArgsConstructor
public class SampleService {

    // 필드 주입,
    // 루트 컨텍스트 의 파일 위치를 인식를 못해서, 컴파일러 오류상황

//    @Qualifier("normal")
    private final SampleDAO sampleDAO;

    public SampleService(@Qualifier("normal")  SampleDAO sampleDAO) {
        this.sampleDAO = sampleDAO;
    }

}
