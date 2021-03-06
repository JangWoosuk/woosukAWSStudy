package com.example.woosukawsstudy.csv;

import lombok.Data;
import org.apache.logging.log4j.util.Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

@Data
public class MakeCSV {
    String id ;
    String name;
    String age;

    public MakeCSV (String id, String name, String age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void makeCSV(MakeCSV csv){
        try{
            String path = "src/main/resources/makeCsv";
            File downFolder = new File(path);
            if(!downFolder.exists()){
                downFolder.mkdir();
            }
            PrintWriter write = new PrintWriter(new File(path+"/test.csv"));
            StringBuilder sb = new StringBuilder();
            sb.append("id ");
            sb.append(",");
            sb.append("name");
            sb.append(",");
            sb.append("age");
            sb.append("\n");
            sb.append(csv.id);
            sb.append(",");
            sb.append(csv.name);
            sb.append(",");
            sb.append(csv.age);

            write.write(sb.toString());
            write.close();
        }
        catch(FileNotFoundException e ){
            e.printStackTrace();
        }

    }


}
