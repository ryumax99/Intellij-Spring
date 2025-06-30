package com.busanit501.spring_project.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

// 서버에, DAO 역할을 하는 자주 사용하는 객체
@Repository
// 해결책2
@Qualifier("normal")
public class SampleDAOImpl implements SampleDAO {

}
