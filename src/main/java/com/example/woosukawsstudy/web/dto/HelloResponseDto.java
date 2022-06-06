package com.example.woosukawsstudy.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor // final 선언자가 붙은 필드가 포함된 생성자를 만든다, final이 없는 필드는 생성자에 포함 안됨.
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
