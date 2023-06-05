package com.example.code.arrays;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzArray {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(10));
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(13));
    }
    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for (int i =1;i<=n;i++){
            if(i%3 == 0 && i%5 ==0){
                ans.add("FizzBuzz");
            }else if(i%3 ==0){
                ans.add("Fizz");
            }else if(i%5 ==0){
                ans.add("Buzz");
            }else{
                ans.add(""+i);
            }
        }
        return ans;
    }

    
}
