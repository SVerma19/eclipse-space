package Milestone1;

import java.util.*;

/**
 * Implements the ArticleProcessor Class.
 */

public interface ProcessorInterface {

    public void printNumberOfLines(List<String> articleList);

    public void printWords(List<String> data);

    public void filterStopWords(List<String> data);

    public HashMap<String, Integer> getData(List<String> data);

    public String[] returnWords(List<String> data);

    public List<String> returnWordsAsList(List<String> data);

    public Map<String, Integer> returnWordsAsMapWithLineNumber(List<String> data);

    public void topWordCount(List<String> data);

    public void getRichVocab(List<String> data);

    public void comparePositiveNegative(List<String> data);

    public void findWordInArticle(List<String> data, String searchWord);

}
