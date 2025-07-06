package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;          
    private NotificationService notificationService; 
    public BookService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addBook(String title) {
        System.out.println("Adding book: " + title);
        bookRepository.saveBook(title);
        notificationService.notifyUser("Book '" + title + "' added to library.");
    }
}
