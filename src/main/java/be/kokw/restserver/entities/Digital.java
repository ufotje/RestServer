package be.kokw.restserver.entities;



import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Digital {
    @Id
    private int id;
    private String depot;
    private String title;
    private String subtitles;
    private int edition;
    private String publisher;
    private int yearPublished;
    private LocalDate boughtOn;
    private LocalDate derated;
    private String destination;
    private String authors;
    private String topics;
    private boolean donated;
    private boolean traded;

    public Digital() {
    }

    public Digital(String depot, String title, String subtitles, int edition, String publisher, int yearPublished, String authors, String topics) {
        this.depot = depot;
        this.title = title;
        this.subtitles = subtitles;
        this.edition = edition;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.authors = authors;
        this.topics = topics;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepot() {
        return depot;
    }

    public void setDepot(String depot) {
        this.depot = depot;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(String subtitles) {
        this.subtitles = subtitles;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public LocalDate getBoughtOn() {
        return boughtOn;
    }

    public void setBoughtOn(LocalDate boughtOn) {
        this.boughtOn = boughtOn;
    }

    public LocalDate getDerated() {
        return derated;
    }

    public void setDerated(LocalDate derated) {
        this.derated = derated;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public boolean isDonated() {
        return donated;
    }

    public void setDonated(boolean donated) {
        this.donated = donated;
    }

    public boolean isTraded() {
        return traded;
    }

    public void setTraded(boolean traded) {
        this.traded = traded;
    }
}