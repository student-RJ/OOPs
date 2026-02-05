package Homework.Constructor;

public class Book {
    int bookId;
    String bookauthor;
    String bookname;

    Book(int BookId){
        this.bookId=BookId;
    }
    Book(String bookauthor,String bookname){
        this.bookauthor=bookauthor;
        this.bookname=bookname;
    }
    void display(){
        System.out.println("Book Id:- "+bookId);
        System.out.println("Book Name:- "+bookname);
        System.out.println("Book Author:- "+bookauthor);
    }

    public static void main(String[] args) {
        Book B1= new Book(121);
        B1.display();

        Book B2 = new Book("Sane Guruji","Shamchi Aai");
        B2.display();
    }
}
