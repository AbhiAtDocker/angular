package com.angular.sb.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.angular.sb.mod.Student1;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveStudent(Student1 student) {
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
	public List<Student1> getStudents() {
		Session currentSession = sessionFactory.getCurrentSession();  
        Query<Student1> query=currentSession.createQuery("from Student", Student1.class);  
        List<Student1> list=query.getResultList();  
        return list;  
	}

	@Override
    @Transactional
	public boolean deleteStudent(Student1 student) {
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
	public List<Student1> getStudentById(Student1 student) {
		 Session currentSession = sessionFactory.getCurrentSession();  
	        Query<Student1> query=currentSession.createQuery("from Student where student_id=:student_id", Student1.class);  
	        query.setParameter("student_id", student.getStudent_id());  
	        List<Student1> list=query.getResultList();  
	        return list; 
	}

	@Override
	@Transactional
	public boolean updateStudent(Student1 student) {
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
