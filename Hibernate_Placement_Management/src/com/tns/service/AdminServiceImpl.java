package com.tns.service;

import com.tns.dao.AdminDao;
import com.tns.dao.AdminDaoImpl;
import com.tns.entity.Admin;

public class AdminServiceImpl implements AdminService{

	private AdminDao dao;
	public AdminServiceImpl() {
		dao = new AdminDaoImpl();
	}
	
	@Override
	public Admin findAdminById(long AdminId) {
		Admin admin = dao.getAdminById(AdminId);
		return admin;
	}

	@Override
	public void addAdmin(Admin admin) {
		dao.beginTransection();
		dao.addAdmin(admin);
		dao.commitTransection();
		
	}

	@Override
	public void updateAdmin(Admin admin) {
		dao.beginTransection();
		dao.updateAdmin(admin);
		dao.commitTransection();
		
	}

	@Override
	public void removeAdmin(Admin admin) {
		dao.beginTransection();
		dao.removeAdmin(admin);
		dao.commitTransection();
		
	}

}
