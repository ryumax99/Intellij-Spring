package com.busanit501.hello_project._3jdbc.listener;


import lombok.extern.log4j.Log4j2;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
@Log4j2
public class LoginListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        //세션을 이용하고 있음.
        // 로그인 시, loginInfo 키 이름으로, 사용중.
        // 새로운 로그인이 발생하면, 로그에 기록 해보기.
        // 세션이 무언가 동작을 하면, 이것을 지켜보고 있던 리스너가 기다렸단 듯이,
        // 다음 동작을 자동으로 하기. -> 자동시작.(세션이 동작하면 그다음 동작을 자동 시작하겠다)
        String name = (String) event.getName();
        Object obg = event.getValue();

        if(name.equals("loginInfo")){
            log.info("LoginListener에서, 확인중. 새로운 유저가 로그인 되었습니다.==================");
            log.info(obg.toString());
        }
    }

}
