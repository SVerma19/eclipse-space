package project;

// import javafx.util.Pair;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestHarness {

public static void main(String[] args) {

    ArticleReader articleReader = new ArticleReader();
    List<String> data = articleReader.readMe("article1.txt");
    ArticleParser parser = new ArticleParser(data);

    parser.printResults();


}

}
