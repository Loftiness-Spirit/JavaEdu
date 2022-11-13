package Practice13.Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fileName = reader.readLine();
        String content = Files.readString(Paths.get(fileName));
        String[] words = content.split(" ");

        StringBuilder result = getLine(words);
        System.out.println(result);
    }

    public static StringBuilder getLine(String[] words) {

        StringBuilder result = new StringBuilder();
        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.addAll(Arrays.asList(words));
        while (sorted(wordsList)) {
            Collections.shuffle(wordsList);
        }
        for (String word: wordsList){
            result.append(word+" ");
        }
        result.deleteCharAt(result.length()-1);
        return result;
    }

    public static boolean sorted(ArrayList<String> wordsList) {
        for (int i = 0; i < wordsList.size() - 1; i++) {
            String firstWord = wordsList.get(i).toLowerCase();
            String secondWord = wordsList.get(i + 1).toLowerCase();
            if (firstWord.charAt(firstWord.length() - 1) != secondWord.charAt(0)) return true;
        }
        return false;
    }
}
