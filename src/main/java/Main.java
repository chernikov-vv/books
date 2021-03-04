public class Main {
    public static void main(String[] args) {
        Book warAndPiece = new Book("Война и мир", "Толстой", 4, 1300);
        Book divineComedy = new Book("Человек - невидимка", "Джордж", 224);
        Book invisibleMan = new Book("Божественная комедия", "Алигьери", 512);
        Book gulliver = new Book("Путешествия Гулливера", "Свифт");
        Book goneWind = new Book("Унесенные ветром", "Митчелл", 1, 640);
        Book sonOfAmerica = new Book("Сын Америки", "Райт");
        Book frankenstein = new Book("Франкенштейн", "Шелли", 288);

        Reader reader = new Reader();

        Book[] library = {warAndPiece, divineComedy, invisibleMan, gulliver, goneWind, sonOfAmerica, frankenstein};

        Book readBook = reader.choiceBook(library);
        reader.readerBook(readBook);
        reader.rating(readBook);

    }
}
