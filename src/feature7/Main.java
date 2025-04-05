package feature7;

public class Main {
    public static void main(String[] args){

        Library library = new Library();

        Book book1 = new Book("В поисках утраченного времени", "Марсель Пруст");
        Book book2 = new Book("Сто лет одиночества","Габриэль Гарсиа Маркес");
        Book book3 = new Book("Лолита", "Владимир Набоков");
        Book book4 = new Book("1984","Джордж Оруэлл");
        Book book5 = new Book("Анна Каренина", "Лев Толстой");


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);



        for (Book book : library.displayBooks()){
            System.out.println("Название: " + book.getTitle() +". Автор: " + book.getAuthor());
    }

        library.removeBook(book4);

        for (Book book : library.displayBooks()) {
            System.out.println("Название: " + book.getTitle() + ". Автор: " + book.getAuthor());
        }
}
}
