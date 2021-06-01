package Milestone1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HeuristicsProcessor implements HeuristicsInterface{

    /**
     *
     * Returns rich vocab calculation.
     * @param map you input a map with data, mostly from returnWordsAsMapWithLineNumber.
     * @param wordCount
     * @return
     */

    public float getRichVocab(Map<String, Integer> map, float wordCount){
        List<Integer> repeatedMoreOne = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                repeatedMoreOne.add(entry.getValue());
            }

        }

        float result = (((float) repeatedMoreOne.size()) / wordCount) * 100;
        return result;
    }

    //Will return true if the article is positive and false if it's negative
    public Boolean comparePositiveNegative(List<String> data){
        ArticleReader ap = new ArticleReader();
        ArticleProcessor a = new ArticleProcessor();
        List<String> positiveWords = new ArrayList<>();
        List<String> negativeWords = new ArrayList<>();
        positiveWords = ap.readFile("positive-words.txt");
        negativeWords = ap.readFile("negative-words.txt");
        String[] wordList = a.returnWords(data);
        Integer positive = 0;
        Integer negative = 0;

        for(String word : wordList){
            if (positiveWords.contains(word)) {
                positive++;
            }else if (negativeWords.contains(word)){
                negative++;
            }
        }

        if (positive > negative){
            return true;
        }else{
            return false;
        }
    }


}
