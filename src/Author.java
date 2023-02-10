import java.util.Objects;
public class Author {

    private final String firstNameAuthor;
    private final String lastNameAuthor;

    public Author(String firstNameAuthor, String lastNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getFirstNameAuthor() {
        return firstNameAuthor;
    }

    public String getLastNameAuthor() {
        return lastNameAuthor;
    }

    ////////////////////////////////////////////////////////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstNameAuthor.equals(author.firstNameAuthor) && lastNameAuthor.equals(author.lastNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameAuthor, lastNameAuthor);
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstNameAuthor='" + firstNameAuthor + '\'' +
                ", lastNameAuthor='" + lastNameAuthor + '\'' +
                '}';
    }

////////////////////////////////////////////////////////

//    @Override
//    public String toString() {
//        return "Imya avtora: " + this.firstNameAuthor + " " + this.lastNameAuthor;
//    }
//
//    @Override
//    public int hashCode() {
//        return this.firstNameAuthor.hashCode() + this.lastNameAuthor.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        Author ob = (Author) obj;
//        if (this == obj) {
//            return true;
//        }
//        return this.hashCode() == ob.hashCode();
//    }

}
