package com.crud.RishavRESTAPIs.service;

import com.crud.RishavRESTAPIs.dto.StudentDto;

import java.util.List;

public interface StudentService {
    
    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);
}
