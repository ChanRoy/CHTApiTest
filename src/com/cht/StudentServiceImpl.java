package com.cht;

import java.util.List;

public class StudentServiceImpl implements StudentService {

	@Override
	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		
		return StudentBusiness.getAllStudents();
	}

}
