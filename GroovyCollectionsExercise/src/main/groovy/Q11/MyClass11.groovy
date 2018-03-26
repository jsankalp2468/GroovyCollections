package Q11

import java.util.Scanner;

class MyClass11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
        println("Enter Number : ")
        int n = scanner.nextInt()
        (1..n).each {
            println(n+" * "+it+" = "+(n*it))
        }
    }
}

//WAP to print the table of a given number
