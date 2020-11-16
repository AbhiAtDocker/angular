package com.angular.sb.dao;

import java.util.List;

import com.angular.sb.model.Student;

public interface StudentDao {

	public boolean saveStudent(Student student);
    public List<Student> getStudents();
    public boolean deleteStudent(Student student);
    public List<Student> getStudentById(Student student);
    public boolean updateStudent(Student student);
    
    
}
