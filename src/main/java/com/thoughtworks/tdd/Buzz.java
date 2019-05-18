package com.thoughtworks.tdd;

public class Buzz implements SpecialNumber{
    @Override
    public boolean isSpecialNumber(int number){
        return number%5==0;
    }
    @Override
    public String getSpecialName(){
        return "Buzz";
    }
}
