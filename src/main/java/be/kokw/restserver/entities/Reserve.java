package be.kokw.restserver.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Reserve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_books", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Books book;
    @JoinColumn(name = "id_members", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Member member;
    @JoinColumn(name = "id_digital", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Digital digital;
    private String firstName;
    private String lastName;
    private String eMail;
    private String title;
    private String author;
    private String isbn;
    private String depot;
    private LocalDate pickUpDate;


    public Reserve() {
    }

    public Reserve(Books book, String firstName, String lastName, String eMail, LocalDate pickUpDate) {
        this.book = book;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.pickUpDate = pickUpDate;
        title = book.getTitle();
        author = book.getAuthors();
        isbn = book.getIsbn();
        depot = book.getDepot();
    }

    public Reserve(Books book, Member member, LocalDate pickUpDate) {
        this.book = book;
        this.member = member;
        this.pickUpDate = pickUpDate;
        title = book.getTitle();
        author = book.getAuthors();
        isbn = book.getIsbn();
        depot = book.getDepot();
        firstName = member.getFirstName();
        lastName = member.getLastName();
        eMail = member.getEMail();
    }

    public Reserve(Digital digital, Member member, LocalDate pickUpDate) {
        this.digital = digital;
        this.member = member;
        this.pickUpDate = pickUpDate;
        title = digital.getTitle();
        author = digital.getAuthors();
        depot = digital.getDepot();
        firstName = member.getFirstName();
        lastName = member.getLastName();
        eMail = member.getEMail();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    public Digital getDigital() {
        return digital;
    }

    public void setDigital(Digital digital) {
        this.digital = digital;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
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

    public LocalDate getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(LocalDate pickUpDate) {
        this.pickUpDate = pickUpDate;
    }
}
