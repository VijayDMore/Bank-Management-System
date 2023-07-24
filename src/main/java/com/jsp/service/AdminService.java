package com.jsp.service;

import java.util.List;

import com.jsp.dao.AdminDao;
import com.jsp.dto.Admin;
import com.jsp.dto.Manager;

public class AdminService {

	AdminDao adminDao = new AdminDao();

	// ===================save admin==============
	public Admin saveAdmin(Admin admin) {

		return adminDao.saveAdmin(admin);

	}

	public List<Manager> getAllManagerDetails() {
		return adminDao.getAllManagerDetails();
	}
}