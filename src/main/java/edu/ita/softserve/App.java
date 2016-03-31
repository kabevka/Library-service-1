package edu.ita.softserve;


import java.util.*;


import edu.ita.softserve.entity.*;
import edu.ita.softserve.service.*;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
	/*BookService service = new BookService();
	InstanceService instanceService = new InstanceService();
	
	Book book = new Book();
	book.setName("Lviv");
	Book book2 = new Book();
	book2.setName("Lviv2");
	Instance instance = new Instance();
	instance.setBook(book);
	Instance instance2 = new Instance();
	instance.setBook(book2);
	
	
	service.add(book);
	service.add(book2);
	
	
	
	System.out.println(service.findbyName("Lviv"));
	System.out.println("end");*/
    	
    	BookService2 service = new BookService2();
    	AuthorService authorService = new AuthorService();
    	PublicationService publicationService = new PublicationService();
    	
    	Book book = new Book();
    	book.setName("Lviv");
    	
    	Book book2 = new Book();
    	book2.setName("Lviv2");
    	
    	
    	Author author = new Author();
    	author.setName("Vitali4g1vf12");
    	author.setSurname("Borovy4fg111v22");
    	    	
    	Author author2 = new Author();
    	author2.setName("Vitaliy1f1vg12");
    	author2.setSurname("Borovyk52gf11v2");
    	
		
    	ArrayList<Author> authors = new ArrayList<Author>();
    	authors.add(author);
    	authors.add(author2);
    	authorService.add(author);
    	authorService.add(author2);
    	
    	
    	
    	
    	book.setAuthors(authors);
    	book.setYear(2012);
    	book2.setYear(1991);
    	
    	
    	Publication publication = new Publication();
    	publication.setName("Syayvo121vgf1");
    	
    	
    	book.setPublication(publication);
    	book2.setPublication(publication);
    	
    	book.setAmountOfPage(20);
    	book2.setAmountOfPage(12);
    	
    	
    	
    	publicationService.add(publication);
    
    	
    	service.add(book);    	
    	service.add(book2);
    	
    	
    	
    	   	
    	
    
    
    	List<Author> auts = authorService.getAll();
    	for (Author a:auts){
    		System.out.println(a.getName() + " " +a.getSurname());
        }
    	
    	List<Book> bookList2 = service.findbyYear(1991,2016);
    	for (Book b:bookList2){
    		System.out.println(b.getName() + " " +b.getYear());
        }
    	System.out.println("end");
    	
    	
    }
}
