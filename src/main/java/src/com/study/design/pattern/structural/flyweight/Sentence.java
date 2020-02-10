package src.com.study.design.pattern.structural.flyweight;

import java.util.HashMap;

class Sentence
{
    private String[] words;
    private HashMap<Integer, WordToken> wordTokens;

    public Sentence(String plainText) {
        this.words = plainText.split(" ");
        this.wordTokens = new HashMap<>();
    }

    public WordToken getWord(int index) {

        WordToken wordToken = wordTokens.get(index);

        if(wordToken == null) {
            wordToken = new WordToken(false);
            wordTokens.put(index, wordToken);
        }

        return wordToken;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            WordToken currentWordToken = wordTokens.get(i);
            if(currentWordToken != null && currentWordToken.capitalize) stringBuilder.append(words[i].toUpperCase()); else stringBuilder.append(words[i]);

            if(words.length-1 != i)
                stringBuilder.append(" ");

        }

        return stringBuilder.toString();
    }
}