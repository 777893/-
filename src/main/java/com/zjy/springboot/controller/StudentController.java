package com.zjy.springboot.controller;

import com.zjy.springboot.mapper.StudentMapper;
import com.zjy.springboot.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {
    @Resource
    private StudentMapper studentMapper;

    @RequestMapping("/index")
    public String studentList(Model model){
        List<Student> list = studentMapper.findAll();
        model.addAttribute("list",list);
        return "hello";
    }

    @RequestMapping("/toadd")
    public String toadd(){
        return "add";
    }

    @RequestMapping("/add")
    public String add(Student s){
        studentMapper.addStudent(s);
        return "redirect:/index";
    }

    @RequestMapping("/delect")
    public String delect(String id){
        studentMapper.delectStudent(id);
        return "redirect:/index";
    }

    @RequestMapping("/toupdate")
    public String toupdate(Model model,String id){
        Student s=studentMapper.findByid(id);
        model.addAttribute("s",s);
        return "update";
    }

    @RequestMapping("/update")
    public String update(Student s){
        studentMapper.updateStudent(s);
        return "redirect:/index";
    }
}
