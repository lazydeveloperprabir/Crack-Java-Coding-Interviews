/*
:::::::::::::::::::::Problem Statement :::::::::::::::::::::::
Fizz Buzz
﻿﻿﻿﻿﻿Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.


Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]

*/



public class FizzBuzz {
    public static void main(String[] args) {
        printFizzBuzz(15);
    }

    public static void printFizzBuzz(int input){
        StringBuilder sb = new StringBuilder();
        String result = sb.toString();
        for(int i = 1;i<=input;i++){
            if(i % 3 == 0 && input % 5==0 ){
                sb.append("\"");
                sb.append("FIZZBUZZ");
                sb.append("\"");
                sb.append(",");
            } else if(i % 3 ==0) {
                sb.append("\"");
                sb.append("FIZZ");
                sb.append(",");
                sb.append("\"");
            } else if(i % 5 ==0){
                sb.append("\"");
                sb.append("BUZZ");
                sb.append("\"");
                sb.append(",");
            } else{
                sb.append("\"");
                sb.append(i);
                sb.append("\"");
                sb.append(",");
            }
        }
        if(sb.toString().endsWith(",")){
            result = sb.toString().substring(0,sb.toString().length()-1);
        }
        System.out.println(result);
    }
}

/*
Output of the above problem
"1","2","FIZZBUZZ","4","BUZZ","FIZZBUZZ","7","8","FIZZBUZZ","BUZZ","11","FIZZBUZZ","13","14","FIZZBUZZ"
 */
