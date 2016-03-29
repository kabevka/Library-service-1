package edu.ita.softserve.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -458793870572406618L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="name", nullable=false)
    private String name;
    
    @Column(name="description", nullable=true)
    private String description;
    
    @ManyToMany(cascade=CascadeType.ALL, targetEntity=Author.class)
    private List<Author> authors;
    
    @Column(name="amount_of_page", nullable=false)
    private int amountOfPage;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="publication_id")
    private Publication publication;
    
    @Column(name="year_of_publishing", nullable=false)
    private int year;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfPage() {
        return amountOfPage;
    }

    public void setAmountOfPage(int amountOfPage) {
        this.amountOfPage = amountOfPage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    @Override
    public String toString() {
	return "Book [id=" + id + ", name=" + name + ", description="
		+ description + ", authors=" + authors + ", amountOfPage="
		+ amountOfPage + ", publication=" + publication + ", year="
		+ year + "]";
    }
    

}