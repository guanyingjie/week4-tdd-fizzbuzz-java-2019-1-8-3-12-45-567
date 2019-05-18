package com.thoughtworks.tdd;

public class Fizz implements SpecialNumber {
    @Override
    public boolean isSpecialNumber(int number){
        return number%3==0;
    }
    @Override
    public String getSpecialName(){
        return "Fizz";
    }
}
