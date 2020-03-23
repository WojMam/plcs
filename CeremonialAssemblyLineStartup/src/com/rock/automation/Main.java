package com.rock.automation;

public class Main {
/**
 * RUN mode is indicated as "0"
 * PROGRAM mode is indicated as "1"
 */
    public static void main(String[] args) {
        int plcsNumber = 1100;
        int employeesNumber = 1100;
        int runModeCounter = 0;
        int programModeCounter = 0;
        int[] plcs;
        plcs = new int[plcsNumber];

        for(int i=1;i<=employeesNumber;i++)
        {
            if (i==1) {
                for(int j=1;j<=plcsNumber;j++) {
                    plcs[j-1]=0;
                }
            } else {
                for(int j=1;j<=plcsNumber;j=j+i) {
                    if (plcs[j-1]==0) plcs[j-1]=1;
                    else if (plcs[j-1]==1) plcs[j-1]=0;
                }
            }
        }

        for(int i=1;i<=1100;i++) {
            if (plcs[i-1]==0) runModeCounter++;
            else programModeCounter++;
            System.out.println("Element at index: " + i + " is " + plcs[i-1]);
        }
        System.out.println("There are " + runModeCounter + " PLCs in RUN mode.");
        System.out.println("There are " + programModeCounter + " PLCs in PROGRAM mode.");
    }
}
