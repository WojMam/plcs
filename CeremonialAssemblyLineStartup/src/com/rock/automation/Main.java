package com.rock.automation;

public class Main {
/**
 * RUN mode is indicated as "0"
 * PROGRAM mode is indicated as "1"
 */
    public static void main(String[] args) {
        int counter = 0;
        int[] anArray;
        anArray = new int[1100];
        for(int i=1;i<=1100;i++)
        {
            if (i==1) {
                for(int j=1;j<=1100;j++) {
                    anArray[j-1]=0;
                }
            } else {
                for(int j=1;j<=1100;j=j+i) {
                    if (anArray[j-1]==0) anArray[j-1]=1;
                    else if (anArray[j-1]==1) anArray[j-1]=0;
                }
            }
        }
        for(int i=1;i<=1100;i++) {
            if (anArray[i-1]==0) counter++;
            System.out.println("Element at index: " + i + " is " + anArray[i-1]);
//            System.out.println("There are " + counter + " PLCs in RUN mode.");
        }
        System.out.println("There are " + counter + " PLCs in RUN mode.");
    }
}
