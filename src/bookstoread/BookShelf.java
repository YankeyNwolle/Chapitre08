package bookstoread;
import java.util.*;

public class BookShelf {

    private final List<String> books = new ArrayList<>();

    public List<String> books() {
        return Collections.unmodifiableList(books);
    }

    // Ajout de plusieurs livres à la fois
    public void add(String... booksToAdd) {
        books.addAll(Arrays.asList(booksToAdd));
    }

    public List<String> arrange() {
        books.sort(Comparator.naturalOrder());
        return books;
    }
}