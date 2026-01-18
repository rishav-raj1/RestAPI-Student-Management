package com.crud.RishavRESTAPIs.service.impl;

import com.crud.RishavRESTAPIs.dto.StudentDto;
import com.crud.RishavRESTAPIs.entity.Student;
import com.crud.RishavRESTAPIs.repository.StudentRepository;
import com.crud.RishavRESTAPIs.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    public StudentServiceImpl(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students
                .stream()
                .map(student -> modelMapper.map(student, StudentDto.class))
                .toList();
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with this ID: "+id));
        return modelMapper.map(student, StudentDto.class);
    }
}
