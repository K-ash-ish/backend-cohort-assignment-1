package com.backendCohortA1.assignment1.word;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WordController {
    @Autowired
    private WordService wordService;
    @RequestMapping("/word")
    public List<Word> getAllWords(){
        return  wordService.getAllWords();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/word")
    public void updateWord(@RequestBody Word word){
        wordService.updateWord(word);
    }
}
