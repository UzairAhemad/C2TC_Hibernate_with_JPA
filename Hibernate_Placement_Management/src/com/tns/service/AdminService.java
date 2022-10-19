package com.tns.service;

import com.tns.entity.Admin;

public interface AdminService {
	
			public abstract Admin findAdminById(long AdminId);
			public abstract void addAdmin(Admin admin);
			public abstract void updateAdmin(Admin admin);
			public abstract void removeAdmin(Admin admin);
}
