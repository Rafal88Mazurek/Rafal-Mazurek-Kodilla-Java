import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Book {
    String author;
    String title;

    public Book (String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    public String getAuthor() {
        return this.author;
    }
    public String getTitle() {
        return this.title;
    }
}
class BookList {
    public static void main(String[] args) {

       List<Book> books = new LinkedList<>();
        for(int i = 0; i < 10000; i++) {
            books.add(new Book("author" + i, "test"));
        }
        Book bookToCheck = new Book("author5000" , "test");
        getSearchTimeInLinkedList(books, bookToCheck);
    }
    public static void getSearchTimeInLinkedList(List<Book> bookList, Book book) {
        long start = System.currentTimeMillis();
        long finish = System.currentTimeMillis();
        for (Book actualBook : bookList) {
          if (actualBook.equals(book)) {
              finish = System.currentTimeMillis();
          }
        }


        System.out.println("search time for book (" + book.getAuthor() + ", " + book.getTitle() + ") is : " + (finish - start));

    }
//    public static void
}

