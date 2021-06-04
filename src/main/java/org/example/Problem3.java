/*
 *  UCF COP3330 Summer 2021 MotivatedAssignment 3 Solution
 *  Copyright 2021 Sabirah Salau
 */

package org.example;

import java.util.Scanner;

public class Problem3
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the quote?");
        String quote = input.nextLine();

        System.out.println("Who said it?");
        String author = input.nextLine();

        System.out.println(author + " says, " + "\"" + quote + "\"");
    }
}
