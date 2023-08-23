package test;

import java.io.*;
import java.util.Scanner;
 
class GFG {
 
static int countOccurrences(String str, String word)
{
    // split the string by spaces in a
    String a[] = str.split(" ");
 
    // search for pattern in a
    int count = 0;
    for (int i = 0; i < a.length; i++)
    {
    // if match found increase count
    if (word.equals(a[i]))
        count++;
    }
 
    return count;
}
 
// Driver code
public static void main(String args[])
{
    String str ="welcome to bharat and bharat welcome you";
    Scanner sc=new Scanner(System.in);
    while(true) {
    System.out.println("Enter the word:");
    String word = sc.next();
System.out.println("Number of occurance of word:"+countOccurrences(str, word));
    }
}
}