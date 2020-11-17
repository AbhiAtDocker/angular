package com.angular.sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.angular.sb.dao.StudentDao;
import com.angular.sb.mod.Student1;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	
	@Override
	public boolean saveStudent(Student1 student) {
		// TODO Auto-generated method stub
		  return studentDao.saveStudent(student);  
	}

	@Override
	public List<Student1> getStudents() {
		 return studentDao.getStudents();  
	}

	@Override
	public boolean deleteStudent(Student1 student) {
		// TODO Auto-generated method stub
		return studentDao.deleteStudent(student);
	}

	@Override
	public List<Student1> getStudentByID(Student1 student) {
		// TODO Auto-generated method stub
		return studentDao.getStudentById(student);
	}

	@Override
	public boolean updateStudent(Student1 student) {
		// TODO Auto-generated method stub
		return studentDao.updateStudent(student);
	}

}
