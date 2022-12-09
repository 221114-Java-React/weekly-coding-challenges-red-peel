package com.revature.problem2;

import java.util.*;

public class Solution {
    public List<String> autoComplete(List<String> list) {
        List<String> result = new ArrayList<String>();
        String first = list.get(0);
        List<String> firstAsList = Arrays.asList(first.split(""));
        for (String currentWord: list){
            if(currentWord.equals(first))continue;
            //skip first word

            List<String> currentAsList = Arrays.asList(currentWord.split(""));
            int allLetterCheck = 0;
            for (int i = 0; i < firstAsList.size(); i++){
                if (firstAsList.size() > currentAsList.size())continue;
                if(firstAsList.get(i).equals(currentAsList.get(i))) {
                    allLetterCheck++;
                    if(allLetterCheck == firstAsList.size()){
                        result.add(currentWord);
                    }
                }

            }
            //System.out.println(currentWord);
        }
        Collections.sort(result);
        return result;
    }
}
