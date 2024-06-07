package com.example.demo;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.example.Board;

public class DemoApplication {

	public static void main(String[] args) {
		//EntityManager생성
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemoApplication");
		EntityManager em = emf.createEntityManager();
		
		try {
			
			Board board = new Board();
			board.setTitle("First JPA Test");
			board.setWriter("관리자");
			board.setContent("JPA 글 등록");
			board.setCreateDate(new Date());
			board.setCnt(0L);
			
			em.persist(board);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
		
	}
	
}