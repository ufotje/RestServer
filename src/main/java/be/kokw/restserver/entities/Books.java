package be.kokw.restserver.entities;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {
    @Id
    private long id;
    private String title;
    private String authors;
    private String isbn;
    private String depot;
    private String topics;
    private String nrOfPages;
    private boolean inStock;

    public Books() {
    }

    public Books(String title, String author, String isbn, String depot, String topic, String nrOfPages, boolean inStock) {
        this.title = title;
        this.authors = author;
        this.isbn = isbn;
        this.depot = depot;
        this.topics = topic;
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

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String author) {
        this.authors = author;
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

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topic) {
        this.topics = topic;
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
