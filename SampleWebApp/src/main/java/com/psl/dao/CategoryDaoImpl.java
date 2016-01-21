package com.psl.dao;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.psl.bean.Category;
import com.psl.bean.RatingDetails;
import com.psl.utility.HibernateUtility;

public class CategoryDaoImpl implements CategoryDao{


	public void insertCategory(Category cat) {
		SessionFactory sf = HibernateUtility.getSessionfactory();
		
		Session session =sf.openSession(); 
		
		session.beginTransaction();
		System.out.println(cat.getCategoryId()+cat.getCategoryName());
		Category existingCategory = getCategoryByName(cat.getCategoryName());
		
		if(existingCategory==null){
			session.save(cat);
		}
		else{
			System.out.println(cat +" already exists");
		}
		
		
		session.getTransaction().commit();
	}

	public Category getCategory(int catId) {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtility.getSessionfactory();

		Session session =sf.openSession(); //session factory will give sessions
		Category c = (Category)session.get(Category.class,catId);
		System.out.println(c);
		return c;
	}
	
	public Category getCategoryByName(String categoryName) {
		SessionFactory sf = HibernateUtility.getSessionfactory();

		Session session =sf.openSession(); 
		session.beginTransaction();
		String sql = "SELECT * FROM category where categoryName = :cname";
        SQLQuery query = session.createSQLQuery(sql);
        query.addEntity(Category.class);
        query.setParameter("cname", categoryName);
        Category catobj = (Category) query.uniqueResult();
     	session.getTransaction().commit();	
		//System.out.println(catobj.getCategoryId()+catobj.getCategoryName());
		return catobj;
	}

	public void updateCategory(Category cat) {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtility.getSessionfactory();
		
		Session session =sf.openSession(); 
		session.beginTransaction();
		session.update(cat);
		session.getTransaction().commit();
	}

	public void deleteCategory(Category cat) {
		// TODO Auto-generated method stub
				SessionFactory sf = HibernateUtility.getSessionfactory();
				
				Session session =sf.openSession();
				
				session.beginTransaction();
				session.delete(cat);
				session.getTransaction().commit();
		
	}

	

}
