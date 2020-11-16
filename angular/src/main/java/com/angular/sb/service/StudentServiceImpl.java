package com.angular.sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.angular.sb.dao.StudentDao;
import com.angular.sb.model.Student;

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	
	@Override
	public boolean saveStudent(Student student) {
		// TODO Auto-generated method stub
		  return studentDao.saveStudent(student);  
	}

	@Override
	public List<Student> getStudents() {
		 return studentDao.getStudents();  
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.deleteStudent(student);
	}

	@Override
	public List<Student> getStudentByID(Student student) {
		// TODO Auto-generated method stub
		return studentDao.getStudentById(student);
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.updateStudent(student);
	}

}
