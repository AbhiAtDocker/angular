package com.angular.sb.service;

import java.util.List;

import com.angular.sb.mod.Student1;

public interface StudentService {

	    public boolean saveStudent(Student1 student);  
	    public List<Student1> getStudents();  
	    public boolean deleteStudent(Student1 student);  
	    public List<Student1> getStudentByID(Student1 student);  
	    public boolean updateStudent(Student1 student);
}
