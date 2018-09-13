package com.Controller;

import com.Service.StudentService;
import com.entity.StudentEntity;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/get")
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping("/get.do")
    public String getStudent(int id){

        StudentEntity entity = studentService.findById(1);
        Gson gson = new Gson();
        String json = gson.toJson(entity);
        return json;
    }
}
