package com.ibm.restaurant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ibm.restaurant")
public class DemoBeansConfig {

    /*declararea beanurilor direct in clasa de configurare, metoda folosita cand nu folosim @Autowired la injectarea
    dependintelor in clase*/
    /*@Bean
    public Book getTitle() {
        Book book = new Book();
        book.setTitle("HP");
        book.setNrOfPages(123);
        book.setAuthor(getAuthor());
        return book;
    }*/

    //putem injecta dependita la Author si prin transmitere ca param, Spring apeleza getAuthor
    /*@Bean
    public Book getTitle(Author author) {
        Book book = new Book();
        book.setTitle("HP");
        book.setNrOfPages(123);
        book.setAuthor(author);
        return book;
    }*/

    /*@Bean
    public Author getAuthor() {
        Author author = new Author();
        author.setFirstName("J.K");
        author.setLastName("Rowling");

        return  author;
    }*/
}
