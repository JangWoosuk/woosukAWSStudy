package com.example.woosukawsstudy.web;

import com.example.woosukawsstudy.ExcelPoi.ExcelPoi;
import com.example.woosukawsstudy.Vo.TestVo;
import com.example.woosukawsstudy.csv.MakeCSV;
import com.example.woosukawsstudy.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController//컨트롤러를 JSON을 반환하는 컨트롤러로 만든다.
public class HelloController {


    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){

        return new HelloResponseDto(name,amount);
    }

    @GetMapping("/student")
    public String student()  {
        TestVo test = new TestVo();
        test.setAge("31");
        test.setName("WooSuk");
        test.setId("920517");
        MakeCSV csv = new MakeCSV(test.getId(),test.getName(),test.getAge());
        csv.makeCSV(csv);

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
