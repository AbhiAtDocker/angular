package com.angular.sb.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.angular.sb.model.Student;

public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveStudent(Student student) {
		 boolean status=false;  
	        try {  
	            sessionFactory.getCurrentSession().save(student);  
	            status=true;  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        return status;  
	}

	@Override
	public List<Student> getStudents() {
		Session currentSession = sessionFactory.getCurrentSession();  
        Query<Student> query=currentSession.createQuery("from Student", Student.class);  
        List<Student> list=query.getResultList();  
        return list;  
	}

	@Override
    @Transactional
	public boolean deleteStudent(Student student) {
		 boolean status=false;  
	        try {  
	            sessionFactory.getCurrentSession().delete(student);  
	            status=true;  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        return status;  
	}

	@Override
	public List<Student> getStudentById(Student student) {
		 Session currentSession = sessionFactory.getCurrentSession();  
	        Query<Student> query=currentSession.createQuery("from Student where student_id=:student_id", Student.class);  
	        query.setParameter("student_id", student.getStudent_id());  
	        List<Student> list=query.getResultList();  
	        return list; 
	}

	@Override
	@Transactional
	public boolean updateStudent(Student student) {
		  boolean status=false;  
	        try {  
	            sessionFactory.getCurrentSession().update(student);  
	            status=true;  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        return status;  
	}

}
