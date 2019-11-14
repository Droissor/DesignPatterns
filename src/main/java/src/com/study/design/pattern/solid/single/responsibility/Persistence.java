package src.com.study.design.pattern.solid.single.responsibility;

import java.io.PrintStream;

/**
 * Handles the responsibility of persisting objects
 */
class Persistence {
    void saveJournal(Journal journal) throws Exception {

        String filename = "MyJournal";

        try (PrintStream out = new PrintStream(filename)) {
            out.println(journal.toString());
        }
    }
}
