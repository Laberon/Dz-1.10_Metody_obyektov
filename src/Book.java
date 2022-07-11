import java.util.Objects;

public class Book {
    private String titel;
    private int publishingYear;
    public Author author;

    public Book(String titel, int publishingYear, Author author) {
        this.titel = titel;
        this.publishingYear = publishingYear;
        this.author=author;
    }
    public String getTitel(){
        return this.titel;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear=publishingYear;
    }

    @Override
    public String toString() {
        return "Книга: " +
                "Название - \"" + titel + '\"' +
                ", год публикации - \"" + publishingYear + '\"'+
                ", "+ author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return titel.equals(book.titel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel);
    }
}
