package net.codejava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.model.Book;
import net.codejava.repository.BookRepo;


@Service
public class BookService {	
	

	@Autowired
	private BookRepo bookRepo;	
//	
//	
//	public BookService(BookRepo bookRepo) {
//		super();
//		this.bookRepo = bookRepo;
//	}


	public void save(Book book){
		this.bookRepo.save(book);
	}
	
}
