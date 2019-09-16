package com.company;

/*Cedric is learning Java Programming for the first time. He is having trouble with understanding how to declare variables and wants an example to follow. He started creating a profile for each member of his family  on intellij and needs help finishing the application.
The profile labels he chooses for each member of the family are: Full Name, Age, Relation to Cedric.
Can you assist him with completing a functional application? This is what he has so far:*/

import java.util.Scanner;

public class Complete {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String memberName, related;
        int age;

        System.out.println("Full Name: ");
        memberName = input.nextLine();
        System.out.println("Relation: ");
        related= input.nextLine();
        System.out.println("Age");
        age=input.nextInt();
        System.out.println(memberName +"("+age+")"+ " is Cedric's " + related);





    }
}