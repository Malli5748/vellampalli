package com.app.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUserDao;
import com.app.model.Document;
import com.app.model.UserPeople;
@Repository
public class UserDaoImpl implements IUserDao{
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveUser(UserPeople user) {
		// TODO Auto-generated method stub
		return(Integer)ht.save(user);
	}

	@Override
	public void updateUser(UserPeople user) {
		// TODO Auto-generated method stub
		ht.update(user);
		
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		ht.delete(new UserPeople(id));
		
	}

	@Override
	public UserPeople getOneUser(Integer id) {
		// TODO Auto-generated method stub
		return ht.get(UserPeople.class, id);
	}

	@Override
	public List<UserPeople> getAllUser() {
		// TODO Auto-generated method stub
		return ht.loadAll(UserPeople.class);
	}

	@Override
	public Integer uploadData(Document doc) {
		// TODO Auto-generated method stub
		return(Integer)ht.save(doc);
	}

	@Override
	public List<Object[]> getIdAndName() {
		/*
		 * @SuppressWarnings("unchecked") List<Object[]>
		 * data=(List<Object[]>)ht.findByCriteria(
		 * DetachedCriteria.forClass(Document.class)
		 * .setProjection(Projections.projectionList() .add(Projections.property("id"))
		 * .add(Projections.property("fileName")) ) ); return data;
		 */
		@SuppressWarnings("unchecked")
		List<Object[]> data=(List<Object[]>)ht.findByCriteria(DetachedCriteria.forClass(Document.class)
				.setProjection(Projections.projectionList().add(Projections.property("id"))
						.add(Projections.property("fileName"))));
		return data;
				
		 /*String hql=" select id,fileName from "+Document.class.getName();
		 List<Object[]> data=(List<Object[]>)ht.find(hql); return data;*/
		 
	}

	@Override
	public Document downDoc(Integer id) {
		// TODO Auto-generated method stub
		return ht.get(Document.class, id);
	}

	@Override
	public void deleteData(Integer id) {
		// TODO Auto-generated method stub
		ht.delete(new Document(id));
		
	}

	@Override
	public void updateData(Document doc) {
		// TODO Auto-generated method stub
		ht.update(doc);
		
	}

	@Override
	public Document getOneData(Integer id) {
		// TODO Auto-generated method stub
		return ht.get(Document.class, id);
	}
	

}
