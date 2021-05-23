package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository("fakeDao")
public class StudentFakeDaoImpl implements StudentDao{
    private final Map<UUID, Student> database;

    public StudentFakeDaoImpl() {
        database = new HashMap<>();
        UUID studentId = UUID.randomUUID();
        database.put(
                studentId,
                new Student(studentId,31, "Tuhin","Samanta","SpringBoot"));
    }

    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        database.put(studentId,student);
        return 1;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return database.get(studentId);
    }

    @Override
    public List<Student> selectAllStudents() {
        return new ArrayList<>(database.values());
    }

    @Override
        public int updateStudentById(UUID student, Student studentUpdate) {
        database.put(student, studentUpdate);
        return 1;
    }

    @Override
    public int deleteStudentById(UUID studentId) {
        database.remove(studentId);
        return 1;
    }
}
