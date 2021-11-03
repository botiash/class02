package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bank b[] = new bank[4];
    b[0] = new bank(1,2,3,"g","h");
    b[1]=new bank (1,4,5,"hgf","sdfgh");
        b[2]=new bank (2,7,6,"hdfghj","dbftjuyk");
        b[3]=new bank (12,456,545,"hdfgh","sdryfgh");
int i,j; // intervalga kazhet ainimalilar
        System.out.println("interval engiz");
i=sc.nextInt();
        j=sc.nextInt();
        for (int k=0; k<4;k++) {
            if (b[k].getCredit()>i && b[k].getCredit()<j) {
                String h = b[k].toString();
                System.out.println(h);
            }
        }

    }
}
