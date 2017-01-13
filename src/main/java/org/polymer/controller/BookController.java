package org.polymer.controller;

import java.util.List;

import org.polymer.model.Book;
import org.polymer.repository.BookRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("books")
	public List<Book> list() {
		return bookRepository.findAll();
	}
	
	@PostMapping("books")
	public Book create(@RequestBody Book book) {
		return bookRepository.saveAndFlush(book);
	}
	
	@GetMapping("books/{id}")
	public Book get(@PathVariable Long id) {
		return bookRepository.findOne(id);
	}
	
	@PutMapping("books/{id}")
	public Book update(@PathVariable Long id, @RequestBody Book book) {
		Book existingBook = bookRepository.findOne(id);
		BeanUtils.copyProperties(book, existingBook);
		return bookRepository.saveAndFlush(existingBook);
	}
	
	@DeleteMapping("books/{id}")
	public Book delete(@PathVariable Long id) {
		Book existingBook = bookRepository.findOne(id);			
		bookRepository.delete(existingBook);
		return existingBook;
	}

}
