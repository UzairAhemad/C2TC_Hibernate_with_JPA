package com.tns.service;

import com.tns.dao.CollegeDao;
import com.tns.dao.CollegeDaoImpl;
import com.tns.entity.College;

public class CollegeServiceImpl implements CollegeService{

	private CollegeDao dao;
	public CollegeServiceImpl() {
		dao = new CollegeDaoImpl();
	}
	
	@Override
	public College findCollegeById(long collegeId) {
		College college = dao.getCollegeById(collegeId);
		return college;
	}

	@Override
	public void addCollege(College college) {
		dao.beginTransection();
		dao.addCollege(college);
		dao.commitTransection();
		
	}

	@Override
	public void removeCollege(College college) {
		dao.beginTransection();
		dao.removeCollege(college);
		dao.commitTransection();
		
	}

	@Override
	public void updateCollege(College college) {
		dao.beginTransection();
		dao.updateCollege(college);
		dao.commitTransection();
		
	}
	
		
	
	

}
