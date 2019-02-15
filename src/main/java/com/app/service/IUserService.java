package com.app.service;

import java.util.List;

import com.app.model.Document;
import com.app.model.UserPeople;

public interface IUserService {
	public Integer saveUser(UserPeople user);
	public void updateUser(UserPeople user);
	public void deleteUser(Integer id);
	public UserPeople getOneUser(Integer id);
	public List<UserPeople> getAllUser();
	public Integer uploadData(Document doc);
	public List<Object[]> getIdAndName();
	public Document downDoc(Integer id);
	public void deleteData(Integer id);
	public Document getOneData(Integer id);
	public void updateData(Document doc);

}
 