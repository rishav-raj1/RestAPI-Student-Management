package com.crud.RishavRESTAPIs.dto;


public class AddStudentRequestDto {

    private String name;
    private String email;

    public AddStudentRequestDto() {
    }

    public AddStudentRequestDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
