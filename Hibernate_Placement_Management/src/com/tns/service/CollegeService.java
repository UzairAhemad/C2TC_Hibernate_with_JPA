package com.tns.service;

import com.tns.entity.College;

public interface CollegeService {
		public abstract College findCollegeById(long collegeId);
		public abstract void addCollege(College college);
		public abstract void removeCollege(College college);
		public abstract void updateCollege(College college);
}
