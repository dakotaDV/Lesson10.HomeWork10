package pro.sky.java.course1.lesson10;

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
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", author=" + author +
                ", yearPublication=" + yearPublication +
                '}';
    }
}


