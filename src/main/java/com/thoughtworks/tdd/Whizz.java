package com.thoughtworks.tdd;

public class Whizz implements SpecialNumber{
    @Override
    public boolean isSpecialNumber(int number){
        return number%7==0;
    }
    @Override
    public String getSpecialName(){
        return "Whizz";
    }
}
