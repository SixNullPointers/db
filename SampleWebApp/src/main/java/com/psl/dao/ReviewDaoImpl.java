package com.psl.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.psl.bean.Review;
import com.psl.utility.HibernateUtility;

public class ReviewDaoImpl implements ReviewDao{

	public void insertReview(Review review) {
SessionFactory sf = HibernateUtility.getSessionfactory();
		
		Session session =sf.openSession(); 
		
		session.beginTransaction();
		
		session.save(review);
		
		
		session.getTransaction().commit();		
	}

	public Review getReview(int reviewId) {
		SessionFactory sf = HibernateUtility.getSessionfactory();

		Session session =sf.openSession(); //session factory will give sessions
		Review rev = (Review)session.get(Review.class,reviewId);
		
		return rev;
	}

	public void updateReview(Review review) {
SessionFactory sf = HibernateUtility.getSessionfactory();
		
		Session session =sf.openSession(); 
		session.beginTransaction();
		session.update(review);
		session.getTransaction().commit();		
	}

	public void deleteReview(Review review) {
		SessionFactory sf = HibernateUtility.getSessionfactory();
		
		Session session =sf.openSession();
		
		session.beginTransaction();
		session.delete(review);		
	}

}
