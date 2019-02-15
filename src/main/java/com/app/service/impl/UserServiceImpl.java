package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.model.Document;
import com.app.model.UserPeople;
import com.app.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDao dao;
	@Transactional
	public Integer saveUser(UserPeople user) {
		// TODO Auto-generated method stub
		return dao.saveUser(user);
	}

	@Transactional
	public void updateUser(UserPeople user) {
		// TODO Auto-generated method stub
		dao.updateUser(user);
		
	}

	@Transactional
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteUser(id);
	}

	@Transactional(readOnly=true)
	public UserPeople getOneUser(Integer id) {
		// TODO Auto-generated method stub
		return dao.getOneUser(id);
	}

	@Transactional(readOnly=true)
	public List<UserPeople> getAllUser() {
		// TODO Auto-generated method stub
		return dao.getAllUser();
	}

	@Transactional
	public Integer uploadData(Document doc) {
		// TODO Auto-generated method stub
		return dao.uploadData(doc);
	}

	@Transactional(readOnly=true)
	public List<Object[]> getIdAndName() {
		// TODO Auto-generated method stub
		return dao.getIdAndName();
	}

	@Transactional(readOnly=true)
	public Document downDoc(Integer id) {
		// TODO Auto-generated method stub
		return dao.downDoc(id);
	}

	@Transactional
	public void deleteData(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteData(id);
		
	}

	@Override
	public Document getOneData(Integer id) {
		// TODO Auto-generated method stub
		return dao.getOneData(id);
	}

	@Override
	public void updateData(Document doc) {
		// TODO Auto-generated method stub
		dao.updateData(doc);
	}

}
