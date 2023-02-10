public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Elena", "Rezanova");
        Author author2 = new Author("Roger", "Seip");

        Book book1 = new Book("THIS IS NORMAL!", author1, 2020);
        Book book2 = new Book("Master Your Mind", author2, 2020);

        System.out.println(book1.getNameBooK() + " - " + book1.getAuthorBook().getFirstNameAuthor() + " " + book1.getAuthorBook().getLastNameAuthor() + " - " + book1.getPublishingYear());
        System.out.println(book2.getNameBooK() + " - " + book2.getAuthorBook().getFirstNameAuthor() + " " + book2.getAuthorBook().getLastNameAuthor() + " - " + book2.getPublishingYear());

        book2.setPublishingYear(2024);
        System.out.println(book2.getNameBooK() + " - " + book2.getAuthorBook().getFirstNameAuthor() + " " + book2.getAuthorBook().getLastNameAuthor() + " - " + book2.getPublishingYear());

        System.out.println();
        System.out.println("***************************");
        System.out.println();

/*
    Реализовать методы toString, equals и hashCode в классах Author и Book,
    которые были созданы на прошлом уроке. Обратите внимание,
    что toString книги не должен дублировать код из toString автора,
    а должен делегировать (вызывать) его версию метода.
        -- Критерии оценки
    – Метод toString реализован корректно.
    – Метод equals реализован корректно.
    – Метод hashCode реализован корректно.
    – Методы не дублируют друг друга в классах Author и Book.
*/

        System.out.println(author2);
        System.out.println(author2.hashCode());
        System.out.println(author1.hashCode() == author2.hashCode());
        System.out.println(author1.equals(author2));

        System.out.println();

        System.out.println(book1);
        System.out.println(book1.hashCode());
        System.out.println(book1.hashCode() == book2.hashCode());
        System.out.println(book1.equals(book2));
    }
}
