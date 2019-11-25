package src.com.study.design.pattern.solid.single.responsibility

import java.io.PrintStream

/**
 * Handles the responsibility of persisting objects
 */
class Persistence {

    fun saveJournal(journal: Journal) = PrintStream(FILE_NAME).use { out -> out.println(journal.toString()) }

    companion object{
        const val FILE_NAME = "MyJournal"
    }
}