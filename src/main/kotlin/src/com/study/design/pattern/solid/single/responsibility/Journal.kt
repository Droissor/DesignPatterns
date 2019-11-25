package src.com.study.design.pattern.solid.single.responsibility

import java.io.PrintStream

/**
 * Handles the responsibility for add and remove entries in journal
 */
class Journal {

    val entries = mutableListOf<String>()

    fun addEntry(text: String) = entries.add("${entries.size} : $text")

    fun removeEntry() {
        if (entries.isNotEmpty()){
            entries.removeAt(entries.lastIndex)
        }
    }

    private fun save(filename: String) {
        print("This method violate the single responsibility principle by adding a new concern to Journal: Persistence. Shouldn't be here!")
        PrintStream(filename).println(toString())
    }

    override fun toString() = entries.joinToString(System.lineSeparator())
}