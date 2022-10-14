package com.tns.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.tns.entity.Employee;
import com.tns.entity.Manager;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory fectory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = fectory.createEntityManager();
		em.getTransaction().begin();
		
		// Creating Employee
		Employee employee = new Employee();
		employee.setEmployeeId(101);
		employee.setName("Pranav");
		employee.setSalary(10000);
		em.persist(employee);
		
		// Creating Manager
		Manager manager = new Manager();
		manager.setEmployeeId(110);
		manager.setName("Ramesh");
		manager.setSalary(35000);
		manager.setDepartmentName("Sales");
		em.persist(manager);
		
		em.getTransaction().commit();
		
		System.out.println("Employee and Manager added int database");
		em.close();
		fectory.close();
		
	}

}
