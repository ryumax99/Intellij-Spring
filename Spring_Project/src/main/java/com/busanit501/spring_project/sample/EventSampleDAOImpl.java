package com.busanit501.spring_project.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
// 해결책1
//@Primary
// 해결책2
@Qualifier("event")
public class EventSampleDAOImpl implements SampleDAO {

}
