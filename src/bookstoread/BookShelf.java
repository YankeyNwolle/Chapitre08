package bookstoread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookShelf {

    private final List<String> books = new ArrayList<>();

    public List<String> books() {
        return books;
    }

    // Ajout de plusieurs livres à la fois
    public void add(String... booksToAdd) {
        books.addAll(Arrays.asList(booksToAdd));
    }
}