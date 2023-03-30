package zeka.springframework.spring6webapp.services;

import zeka.springframework.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
