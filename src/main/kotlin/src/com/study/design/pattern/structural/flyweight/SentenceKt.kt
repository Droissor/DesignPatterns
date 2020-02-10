package src.com.study.design.pattern.structural.flyweight

class SentenceKt(plainText: String) {

    private val words = plainText.split(" ")
    private val wordTokens = mutableMapOf<Int, WordTokenKt>()

    fun getWord(index: Int): WordTokenKt {
        wordTokens[index]?.let {
            return it
        } ?: run {
            val wordToken = WordTokenKt(false)
            wordTokens[index] = wordToken
            return wordToken
        }
    }

    override fun toString(): String {
        val stringBuilder = StringBuilder()

        words.forEachIndexed { index, word ->

            wordTokens[index]?.let {
                if (it.capitalize) stringBuilder.append(word.toUpperCase()) else stringBuilder.append(word)
            } ?: run {
                stringBuilder.append(word)
            }

            if (words.size - 1 != index) stringBuilder.append(" ")
        }

        return stringBuilder.toString()
    }

}