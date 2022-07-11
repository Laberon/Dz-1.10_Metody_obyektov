import java.util.Objects;

public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName,String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getAuthors(){
        String author = (firstName +" "+ secondName);
        return author;
    }

    @Override
    public String toString() {
        return "Автор: " +
                "Имя - \"" + firstName + '\"' +
                ", Фамилия - '" + secondName + '\"' +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName.equals(author.firstName); // && secondName.equals(author.secondName)
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName); //, secondName
    }
}
