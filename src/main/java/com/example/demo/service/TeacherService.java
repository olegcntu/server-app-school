package com.example.demo.service;

import com.example.demo.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {
    private final ArrayList<Teacher> teacherList = new ArrayList<>();
    public boolean addTeacher(Teacher teacher) {

        boolean added = teacherList.add(teacher);
        return added;
    }

    public List<Teacher> getAllTeachers() {
        return teacherList;
    }

}
