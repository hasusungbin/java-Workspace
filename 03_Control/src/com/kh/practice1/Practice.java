package com.kh.practice1;

import java.util.Scanner;

public class Practice {
   
   public void practice1() {
      
      Scanner sc = new Scanner(System.in);
      System.out.print("1 이상의 숫자를 입력하세요. : ");
      int num = sc.nextInt();
         if(num >=1) {
         for(int i = 1; i <= num; i++) {
         System.out.print(i+" ");
      }
      } else {
         System.out.println("1 이상의 숫자를 입력 해주세요.");
      }   
   }
   
   public void practice2() {
      
      Scanner sc = new Scanner(System.in);
      System.out.print("1 이상의 숫자를 입력하세요 : ");
      int num = sc.nextInt();
         if(num >= 1) {
            for(int i = num; i > 0; i--) {
            System.out.print(i+" ");
            }
            } else {
               System.out.println("1 이상의 숫자를 입력 해주세요.");
            }
      
   }
   
   public void practice3() {
      
      Scanner sc = new Scanner(System.in);
      System.out.print("정수를 하나 입력하세요. : ");
      
      int num = sc.nextInt();
         int sum = 0;
         for(int i = 1; i <= num; i++) {
            sum += i;
            System.out.print(i+"+");
         }
         System.out.printf("= %d" ,sum);
      
   }
   public void practice4() {
      Scanner sc = new Scanner(System.in);
      System.out.print("첫 번째 숫자를 입력하세요. : ");
      int num = sc.nextInt();
      
      System.out.print("두 번째 숫자를 입력하세요. : ");
      int num2 = sc.nextInt();
      if( num >= 1) {
         for(int i = num; i >= num && i <= num2; i++) {
            System.out.print(i+" ");
         }
      } else {
         System.out.print("1이상의 숫자를 입력해주세요.");
      }
      if (num > num2) {
         for(int i = num2; i >= num2 && i <= num; i++) {
            System.out.print(i+" ");
         }
      } 
      
   }
   public void practice5() {
      
      Scanner sc = new Scanner(System.in);
      System.out.print("1이상의 숫자를 입력해주세요 : ");
      
      int num = sc.nextInt();
      if(num>2 && num<9) {
      for(int j = num; j < 9; j++) {
         for(int i = num; i >= num && i <= 9; i++) {
            System.out.printf("%d X %d = %d \n" , j , i , (num * j));
      }
      }
      }
      else {
         System.out.println("9 이하의 숫자를 입력해주세요.");
      }
      
   }
   public void practice6() {
      
      Scanner sc = new Scanner(System.in);
      System.out.print("숫자를 입력하세요. : ");
      int num = sc.nextInt();
      
      System.out.print("공차를 입력하세요 : ");
      int num2 = sc.nextInt();
      
      System.out.print(num);
      for(int i = 0; i < 9; i++) {
         int sum = 0;
         sum = num+=num2;
            System.out.print(" "+sum);
         }

      }

   
   public void practice8() {
      
      Scanner sc = new Scanner(System.in);
      System.out.print("정수를 입력하세요. : ");
      int num = sc.nextInt();
      
      for(int i = 0; i < num; i++) {
         for(int j = 0; j < num; j++) {
            if(i == j) {
               System.out.print("*");               
            }
         } 
      }
      
   }
   
}