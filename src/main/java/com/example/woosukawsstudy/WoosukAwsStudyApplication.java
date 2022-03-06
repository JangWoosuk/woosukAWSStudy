package com.example.woosukawsstudy;

import com.example.woosukawsstudy.controller.Application;
import com.example.woosukawsstudy.web.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Application 클래스는 현 프로젝트의 가장 메인 클래스가 된다.
 *
 * @SpringBootApplication 어노테이션으로 인해 스프링 부트의 자동설정, 스프링 Bean읽기와 생성을 모두 자동으로 설정된다.
 */
@SpringBootApplication
public class WoosukAwsStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(WoosukAwsStudyApplication.class, args);
    }

}
