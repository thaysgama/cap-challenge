package br.com.capgemini.questionThree;

import java.util.ArrayList;
import java.util.List;

public class AnagramChallenge {

    public boolean isAnagram(final String input1, final String input2){
        if(input1.trim().length()!=input2.trim().length()){
            return false;
        }
        String word1 = input1.toLowerCase();
        String word2 = input2.toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            int counter=0;
            for (int i = 0; i < word1.length(); i++) {
                if(word1.charAt(i)==letter){
                    counter++;
                }
                if(word2.charAt(i)==letter){
                    counter--;
                }
            }
            if(counter!=0){
                return false;
            }
        }
        return true;

    }

    public List<String> createSubstringList(final String input){
        List<String> substringList = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <= input.length(); j++) {
                substringList.add(input.substring(i,j));
            }
        }
        return substringList;
    }

    public int findSubstringAnagrams(final String input){
        int counter = 0;
        List<String> substringList = createSubstringList(input);
        for (int i = 0; i < substringList.size()-1; i++) {
            for (int j = i+1; j < substringList.size(); j++) {
                if(isAnagram(substringList.get(i), substringList.get(j))){
                    System.out.println(substringList.get(i)+" - "+substringList.get(j));
                    counter++;
                }
            }
        }
        return counter;
    }

}
