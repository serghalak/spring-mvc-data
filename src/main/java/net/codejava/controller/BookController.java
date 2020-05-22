package net.codejava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import net.codejava.repository.BookRepo;



@Controller
public class BookController {
		
	@Autowired
	private BookRepo repository;
//
//	public BookController(BookRepository repository) {
//		super();
//		this.repository = repository;
//	}
	
	@RequestMapping("/books")
	public String showBooks(Model model){
		model.addAttribute("books",repository.findAll());
		System.out.println(">>>>>>>>>>>>>>/books");
		return "books";
	}
	
	
	@RequestMapping("/books/{bookId}")
	public String showBook(@PathVariable("bookId") Long bookId,Model model){
		model.addAttribute("books",repository.findById(bookId));
		return "book";
	}
	
	

}
