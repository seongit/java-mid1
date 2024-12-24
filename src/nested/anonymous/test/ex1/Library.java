package nested.anonymous.test.ex1;

import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private int size;
    private ArrayList<Book> books = new ArrayList<>();

    class Book {
        private String title;
        private String author;
        public Book(){}
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

    }

    Library(int size) {

    }

    void addBook(String title, String author){
        books.add(new Book(title, author));
    }

    void showBooks(){
        for(int i = 0; i < books.size(); i++){
            System.out.println(books.get(i).title);
        }
    }


}
