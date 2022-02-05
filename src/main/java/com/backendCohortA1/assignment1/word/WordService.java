package com.backendCohortA1.assignment1.word;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class WordService {
    public List<Word> words = new ArrayList<>(Arrays.asList(
                new Word("new")
        ));
    public List<Word> getAllWords(){
        return words;
    }

    public void updateWord(Word word) {
        words.set(0, word);
        return;

    }
}
