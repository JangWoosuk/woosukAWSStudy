package com.example.woosukawsstudy.domain.posts;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // EntityClass에서는 절대 Setter를 만들지 않는다.
@NoArgsConstructor
@Entity /**
        * 테이블과 연결될 클래스임을 명시 EntityClass
        * 기본값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍 으로 테이블 이름을 매칭한다 EX) SalesManager.java => sales_manager table
        **/
//기본적인 구조는 생성자를 통해 최종값을 채운후 DB에 insert한다, 값 변경이 필요할시엔 해당 이벤트에 맞는 public 메소드를 호출하여 변경하는 것을 전제로 한다.
//builder클래스가 있을경우 해당 생성자를 사용한다.
public class Post {

    @Id //해당 테이블의 PK 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK생성 규칙을 나타냄 GenerationType.Identity -> autoIncrement
    private Long id ;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //해당 클래스의 빌더패턴 클래스를 생성
    public Post(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }



}
