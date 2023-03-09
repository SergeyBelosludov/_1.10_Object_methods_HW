import java.util.Objects;
public class Book {

    private final String nameBook;
    private final Author authorBook;
    private int publishingYear;

    public Book(String nameBook, Author authorBook, int publishingYear) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.publishingYear = publishingYear;
    }

    public String getNameBooK() {
        return nameBook;
    }

    public Author getAuthorBook() {
        return authorBook;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

//////////////////////////////////////////////////////
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && nameBook.equals(book.nameBook) && authorBook.equals(book.authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, authorBook, publishingYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", authorBook=" + authorBook +
                ", publishingYear=" + publishingYear +
                '}';
    }
*/
    @Override
    public String toString() {
        return "Kniga: " + this.nameBook + " - " + this.authorBook + " - " + this.publishingYear;
    }

    @Override
    public int hashCode() {
        return this.nameBook.hashCode() + this.authorBook.hashCode() + this.publishingYear;
    }

    @Override
    public boolean equals(Object obj) {
        Book ob = (Book) obj;
        if (this == obj) {
            return true;
        } else if (this.nameBook == ob.nameBook && this.authorBook == ob.authorBook && this.publishingYear == ob.publishingYear && this.hashCode() == ob.hashCode()) {
            return true;
        } else {
            return false;
        }
    }

}
