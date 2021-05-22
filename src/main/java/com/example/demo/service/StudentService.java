package com.example.demo.service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

import java.util.List;
import java.util.UUID;

public class StudentService {
    private final StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int persistNewStudent(UUID studentId, Student student){
        UUID studentUid = studentId == null? UUID.randomUUID():studentId;
        return studentDao.insertNewStudent(studentUid,student);
    }
    public Student getStudentById(UUID studentId){
        return studentDao.selectStudentById(studentId);
    }
    public List<Student> getAllStudents(){
        return studentDao.selectAllStudents();
    }
    public int updateStudentById(UUID student, Student updateStudent){
        return studentDao.updateStudentById(student,updateStudent);
    }
    public int deleteStudentById(UUID studentId){
        return studentDao.deleteStudentById(studentId);
    }
}
