package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] argv) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input sex(boy)(girl) and age");
        String sex=scanner.nextLine();
        age=scanner.nextInt();
        if (sex.equals("boy"))
        {
            if (age>=18)
            {
                System.out.println("it's can marry");
            }
            else
            {
                System.out.println("it's can't marry");
            }
        }
        if (sex.equals("girl"))
        {
            if (age>=16)
            {
                System.out.println("it's can marry");
            }
            else
            {
                System.out.println("it's can't marry");
            }
        }
    }
}
