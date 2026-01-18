package Level1_18_01_2026;

class Book2 {
    static String libraryName = "City Library";

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    String title;
    String author;
    final String isbn;

    Book2(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void displayBookDetails(Object obj) {
        if (obj instanceof Book2) {
            Book book = (Book2) obj;
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("ISBN: " + book.isbn);
        } else {
            System.out.println("Object is not a Book instance.");
        }
    }

    public static void main(String[] args) {
        Book.displayLibraryName();
        Book book1 = new Book2("Java Programming", "John Doe", "978-3-16-148410-0");
        book1.displayBookDetails(book1);
    }
}
