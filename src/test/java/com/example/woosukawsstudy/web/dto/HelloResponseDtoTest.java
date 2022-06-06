package com.example.woosukawsstudy.web.dto;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void lombokTest(){
        //given
        String name = "testName";
        int amount = 5;

        //when
        HelloResponseDto test = new HelloResponseDto(name,amount);

        //then
        assertThat(test.getName()).isEqualTo(name);
        assertThat(test.getAmount()).isEqualTo(amount);
    }

}
