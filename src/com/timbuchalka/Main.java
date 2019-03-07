package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	   char switchValue = 'a';

	   switch(switchValue){
           case 'a':
               System.out.println("it was an a");
               break;

           case 'b':
               System.out.println("it was a b");
               break;

           case 'c':
               System.out.println("it was an c");
               break;

           case 'd':
               System.out.println("it was a d");
               break;

           case 'e':
               System.out.println("it was an e");
               break;

           default:
               System.out.println("not found");
               break;
       }
    }
}
