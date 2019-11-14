package src.com.study.design.pattern.solid.single.responsibility;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles the responsibility for add and remove entries in journal
 */
class Journal {

    private final List<String> entries = new ArrayList<>();

    void addEntry(String text) {
        entries.add(getIndex() + ": " + text);
    }

    void removeEntry() {
        if (entries.isEmpty())
            return;

        entries.remove(entries.size() - 1);
    }

    private Integer getIndex() {
        return entries.size() + 1;
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    public void save(String filename) throws Exception {

        System.out.println("This method violate the single responsibility principle by adding a new concern to Journal: Persistence. Shouldn't be here!");

        try (PrintStream out = new PrintStream(filename)) {
            out.println(toString());
        }
    }
}

