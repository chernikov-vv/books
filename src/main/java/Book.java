public class Book {
    String name;
    String author;
    int volume;
    int pages;


    Book(String name, String author, int volume, int pages) {
        this.name = name;
        this.author = author;
        this.volume = volume;
        this.pages = pages;


    }


    Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        String book = "Читаю книгу: " + name + ", автор - " + author;
        if (volume != 0) {
            book += ", " + volume + " том";
        }
        if (pages != 0) {
            book += ", " + "состоящая из " + pages + " стр.";
        }
        return book;
    }

}

