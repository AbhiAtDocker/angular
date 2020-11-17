package com.angular.sb.dao;

import java.util.List;

import com.angular.sb.mod.Student1;

public interface StudentDao {

	public boolean saveStudent(Student1 student);
    public List<Student1> getStudents();
    public boolean deleteStudent(Student1 student);
    public List<Student1> getStudentById(Student1 student);
    public boolean updateStudent(Student1 student);
    
    
}
