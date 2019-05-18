package com.thoughtworks.tdd;

public class main {
    public static void main(String[] args){
        FizzBuzz fizzBuzz = new FizzBuzz(new Fizz(),new Buzz(),new Whizz());
        for(int i=0;i<120;i++)
        {
            fizzBuzz.count(i+1);
        }
    }
}
