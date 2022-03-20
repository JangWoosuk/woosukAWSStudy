package com.example.woosukawsstudy.web;

import com.example.woosukawsstudy.ExcelPoi.ExcelPoi;
import com.example.woosukawsstudy.Vo.TestVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController//컨트롤러를 JSON을 반환하는 컨트롤러로 만든다.
public class HelloController {


    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/student")
    public String student(){
        TestVo test = new TestVo();
        test.setAge("10 years old");
        test.setName("WooSuk");

        return test.toString();
    }

    @GetMapping("/excel")
    public void excel() {
        ExcelPoi poi = new ExcelPoi();
        try{
            poi.writeExcel();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
