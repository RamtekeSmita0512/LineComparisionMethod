package com.Bridgelabz.LineComparisionProblem;
import java.text.DecimalFormat;
import java.util.Scanner;
public class GeometryLength {


            public static void main(String[] args)

        {
            double x1=0;
            double y1=0;
            double x2=0;
            double y2=0;
            double length=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Entet x1: ");
            x1=sc.nextInt();
            System.out.println("Entet x2: ");
            x2=sc.nextInt();
            System.out.println("Entet y1: ");
            y1=sc.nextInt();
            System.out.println("Entet y2: ");
            y2=sc.nextInt();
            sc.close();
            length=Math.sqrt(Math.pow(x2-x1, 2) + (Math.pow(y2-y1,2)));
            System.out.println("The length:"+length);


        }

    }
