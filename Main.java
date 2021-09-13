/*
         *  UCF COP3330 Fall 2021 Assignment 1 Solution
         *  Copyright 2021 Kamila Hollerbach
         */

package com.company;
import java.util.Scanner;

import java.util.*;

        public class Main {


            public static void main(String[] args) {

                Scanner keyboardInput = new Scanner(System.in);

                System.out.print("Enter Noun: ");
                String noun = keyboardInput.nextLine();

                System.out.print("Enter a Verb : ");
                String Verb = keyboardInput.nextLine();

                System.out.print("Enter Adjective: ");
                String Adjective = keyboardInput.nextLine();

                System.out.print("Enter Adverb: ");
                String Adverb = keyboardInput.nextLine();

                System.out.println("Do you " +Verb +" your" + Adjective +" "+ noun +" "+ Adverb+" ? That's hilarious");
            }
        }


