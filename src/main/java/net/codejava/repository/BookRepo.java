package net.codejava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.codejava.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

}
