package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String getServiceInfo() {
        if (bookRepository == null) {
            return "BookService is ready to serve library operations.";
        }
        return "BookService is ready to serve library operations using " + bookRepository.getRepositoryInfo();
    }
}