package com.example.woosukawsstudy.web;

import com.example.woosukawsstudy.Vo.TestVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void returnsHello () throws Exception {
        String text = "hello";

        mvc.perform(get("/hello"))  //MockMvc를 통해서 /hello주소로 HTTP Get 요청을 진행한다.
                .andExpect(status().isOk())     // mvc.perform의 결과를 검증, Header의 Status를 검증한다. 200/404/500 등의 상태를 검증
                .andExpect(content().string(text));//mvc.perform의 결과를 검증, 응답 본문의 내용을 검증한다.

    }

    @Test
    public void returnsStudends() throws Exception{


        TestVo test = new TestVo();
        test.setAge("10 years old");
        test.setName("WooSuk");

        mvc.perform(get("/student"))
                .andExpect(status().isOk())
                .andExpect(content().string(test.toString()));


    }

}
