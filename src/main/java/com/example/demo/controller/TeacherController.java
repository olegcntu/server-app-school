package com.example.demo.controller;

import com.example.demo.dto.ApiResponse;
import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
@Validated
public class TeacherController {
    @Autowired
    TeacherService teacherService;


    @PostMapping("/add-teacher")
    public ResponseEntity<ApiResponse> addTeacher(@Valid @RequestBody Teacher teacher) {
        try {
            boolean added = teacherService.addTeacher(teacher);
            String message = added ? "Учитель успешно добавлен" : "Учитель не может быть добавлен (какая-то ошибка)";
            ApiResponse response = new ApiResponse(true, message);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            ApiResponse response = new ApiResponse(false, "Ошибка при добавлении учителя: " + e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/teachers")
    public ResponseEntity<List<Teacher>> getAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers();
        return new ResponseEntity<>(teachers, HttpStatus.OK);
    }


}

