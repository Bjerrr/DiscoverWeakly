package com.dw.DW.searchSuggestion;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchSuggestion {

    List<String> list = loadList();

    public static List<String> loadList() {

        List<String> locations = new ArrayList<>();
        String currentLine;

        try {
            File fileDir = new File("DW/src/main/java/com/dw/DW/searchSuggestion/Locations.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF-8"));

            while ((currentLine = reader.readLine()) != null) {
                locations.add(currentLine);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return locations;
    }

    public class TrieNode {
        Map<Character, TrieNode> children;
        char c;
        boolean isWord;

        public TrieNode(char c) {
            this.c = c;
            children = new HashMap<>();
        }

        public TrieNode() {
            children = new HashMap<>();
        }

        public void insert(String word) {
            if (word == null || word.isEmpty())
                return;
            char firstChar = word.charAt(0);
            TrieNode child = children.get(firstChar);
            if (child == null) {
                child = new TrieNode(firstChar);
                children.put(firstChar, child);
            }

            if (word.length() > 1)
                child.insert(word.substring(1));
            else
                child.isWord = true;
        }

    }

    TrieNode root;

    public SearchSuggestion(List<String> words) {
        root = new TrieNode();
        for (String word : words)
            root.insert(word);

    }

    public boolean find(String prefix, boolean exact) {
        TrieNode lastNode = root;
        for (char c : prefix.toCharArray()) {
            lastNode = lastNode.children.get(c);
            if (lastNode == null)
                return false;
        }
        return !exact || lastNode.isWord;
    }

    public boolean find(String prefix) {
        return find(prefix, false);
    }

    public void suggestHelper(TrieNode root, List<String> list, StringBuffer curr) {
        if (root.isWord) {
            list.add(curr.toString());
        }

        if (root.children == null || root.children.isEmpty())
            return;

        for (TrieNode child : root.children.values()) {
            suggestHelper(child, list, curr.append(child.c));
            curr.setLength(curr.length() - 1);
        }
    }

    public List<String> suggest(String prefix) {
        List<String> list = new ArrayList<>();
        TrieNode lastNode = root;
        StringBuffer curr = new StringBuffer();
        for (char c : prefix.toCharArray()) {
            lastNode = lastNode.children.get(c);
            if (lastNode == null)
                return list;
            curr.append(c);
        }
        suggestHelper(lastNode, list, curr);
        return list;
    }

    /**
     * Returns traffic stop suggestions for search fields based on query.
     * @param query Current user input in search field.
     * @return String List with suggestions.
     */
    public List<String> getSuggestion(String query) {
        return this.suggest(query);
    }

    public static void main(String[] args) {
        List<String> words = loadList();
        long startTime = System.nanoTime();
        SearchSuggestion searchSuggestion = new SearchSuggestion(words);
        System.out.println(searchSuggestion.suggest("Malmö"));
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time to create 1000K objects in Java in millis: " + elapsedTime/1000000);
    }
}
