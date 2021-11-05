package com.bridgelabz.uc1_frequencyOfWords;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 * Frequency class for calculating the word count in a sentence
 * Hashmap is used for assigning string as key and integer as value
 * String array to store words of the sentence
 */
public class Frequency {
    HashMap<String , Integer> MyMapNode = new HashMap<>();
    private String[] sentenceSplit;

    /**
     * Method for splitting the given string with spaces
     * @param sc input from user
     */
    public void splitString(Scanner sc){
        System.out.println("Enter the sentence to check frequency of words : ");
        String sentence = sc.nextLine();
        String line = sentence.toLowerCase(Locale.ROOT);
        sentenceSplit = line.split(" ");
    }

    /**
     * Method for counting words in the sentence
     * iterating and adding if the same word is repeated else initial value is set to one
     */
    public void countWords(){
        for (String s : sentenceSplit) {
            if (MyMapNode.containsKey(s)) {
                MyMapNode.put(s, MyMapNode.get(s)+1);
            } else {
                MyMapNode.put(s, 1);
            }
        }
        for(Map.Entry<String,Integer> entry : MyMapNode.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        Frequency frequencyObj = new Frequency();
        Scanner sc = new Scanner(System.in);
        frequencyObj.splitString(sc);
        frequencyObj.countWords();
    }
}