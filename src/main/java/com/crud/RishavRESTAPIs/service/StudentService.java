package com.crud.RishavRESTAPIs.service;

import com.crud.RishavRESTAPIs.dto.AddStudentRequestDto;
import com.crud.RishavRESTAPIs.dto.StudentDto;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface StudentService {
    
    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);

    StudentDto createdNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(Long id);
}
