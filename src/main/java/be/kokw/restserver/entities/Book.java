package be.kokw.restserver.entities;


import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String author;
    private String isbn;
    private String depot;
    private String topic;
    @Column(name = "nr_of_pages")
    private String nrOfPages;
    private boolean inStock;

    public Book() {
    }

    public Book(String title, String author, String isbn, String depot, String topic, String nrOfPages, boolean inStock) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.depot = depot;
        this.topic = topic;
        this.nrOfPages = nrOfPages;
        this.inStock = inStock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDepot() {
        return depot;
    }

    public void setDepot(String depot) {
        this.depot = depot;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getNrOfPages() {
        return nrOfPages;
    }

    public void setNrOfPages(String nrOfPages) {
        this.nrOfPages = nrOfPages;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
