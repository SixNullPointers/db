package com.psl.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.psl.bean.ReviewReplyDetails;
import com.psl.utility.HibernateUtility;

public class ReviewReplyDaoImpl implements ReviewReplyDao {

	public void insertReviewReply(ReviewReplyDetails reply) {
SessionFactory sf = HibernateUtility.getSessionfactory();
		
		Session session =sf.openSession(); 
		
		session.beginTransaction();
		
		session.save(reply);
		
		
		session.getTransaction().commit();

	}

	public ReviewReplyDetails getReviewReply(int replyId) {
		SessionFactory sf = HibernateUtility.getSessionfactory();
		Session session = sf.openSession();
		ReviewReplyDetails reply = (ReviewReplyDetails) session.get(ReviewReplyDetails.class, replyId);
		return reply;
	}

	public void updateReviewReply(ReviewReplyDetails reply) {
		SessionFactory sf = HibernateUtility.getSessionfactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(reply);
		session.getTransaction().commit();
	}

	public void deleteReviewReply(ReviewReplyDetails reply) {
		SessionFactory sf = HibernateUtility.getSessionfactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.delete(reply);
		session.getTransaction().commit();
	}

}
