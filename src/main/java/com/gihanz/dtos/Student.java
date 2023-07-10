package com.gihanz.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

    private Long id;
    private String name ;
    private String address;

    @JsonIgnore
    public static List<Student> getStudentList(){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1l,"Gihan","No 88 Wewala Wewa dambulla"));
        list.add(new Student(2l,"Error","No 1211 Wewala Wewa dambulla"));
        list.add(new Student(3l,"Eranga","No 111 Wewala Wewa dambulla"));
        return list;
    }
}
