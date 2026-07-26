package com.library;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            BookService bookService = context.getBean("bookService", BookService.class);
            BookRepository bookRepository = context.getBean("bookRepository", BookRepository.class);

            System.out.println(bookService.getServiceInfo());
            System.out.println(bookRepository.getRepositoryInfo());
            System.out.println("Dependency injection configured successfully.");
        }
    }
}