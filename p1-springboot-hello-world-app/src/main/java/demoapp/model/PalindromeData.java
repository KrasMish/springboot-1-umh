package demoapp.model;

import javax.validation.constraints.NotEmpty;

public class PalindromeData {

    @NotEmpty(message = "Word cannot be empty")
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}