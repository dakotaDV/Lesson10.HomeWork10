package pro.sky.java.course1.lesson10;

import java.util.Objects;

public class Book {
    private final String Name;
    private final Author author;
    private int yearPublication;

    public Book(String name, Author author, Integer yearPublication) {
        Name = name;
        this.author = author;
        this.yearPublication = yearPublication;
    }
    public String getName() {
        return Name;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYearPublication() {
        return yearPublication;
    }
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(Name, book.Name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, author, yearPublication);
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", author=" + author +
                ", yearPublication=" + yearPublication +
                '}';
    }
}


