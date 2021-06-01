package project;

public class testHarness {

    public static void main (String[] args) {

        articleReader reader = new articleReader();
        List<String> data = reader.readMe();

        // ArticleProcessor processor = new ArticleProcessor();
        // processor.print(printNumberofLines(data));

    }
}