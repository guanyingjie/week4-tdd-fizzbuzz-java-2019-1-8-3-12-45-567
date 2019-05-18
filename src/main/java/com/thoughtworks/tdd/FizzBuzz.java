package com.thoughtworks.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    private List<SpecialNumber>specialNumbers = new ArrayList<>();
    public FizzBuzz(SpecialNumber... special){
        specialNumbers.addAll(Arrays.asList(special));
    }
    public void count(int number){
        StringBuilder result = new StringBuilder();
        specialNumbers.forEach(e ->{
            if(e.isSpecialNumber(number)){
                result.append(e.getSpecialName());
            }
        });
        System.out.println(result.toString().isEmpty()?number:result.toString());
    }
}
