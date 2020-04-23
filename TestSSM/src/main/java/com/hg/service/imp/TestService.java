package com.hg.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hg.dao.TestMapper;
import com.hg.service.ITestService;

@Service
public class TestService implements ITestService {

	@Autowired
	private  TestMapper testMapper;
	
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return testMapper.count();
	}
}
