import java.util.Random;

public class Reader {
    Random random = new Random();

    public Book choiceBook(Book[] books) {
        return books[random.nextInt(books.length)];
    }

    void readerBook(Book book) {
        System.out.println(book.toString());
    }

    void rating(Book book) {
        int nameBook = (book.name.replaceAll("\\[^А-Яа-яёЁ]", "").length()) / 2;
        int authorBook = (book.author.length()) / 2;
        int volumeBook = book.volume;
        int pagesBook = book.pages;

        if (volumeBook == 0) {
            volumeBook = random.nextInt(10);
        }
        if (pagesBook == 0) {
            pagesBook = random.nextInt(500);
        }

        int myRating = nameBook + authorBook - volumeBook + pagesBook;

        System.out.println("Мой рейтинг книге: " + myRating);

    }
}
