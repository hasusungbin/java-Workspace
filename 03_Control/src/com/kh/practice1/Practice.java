package com.kh.practice1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

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
        	 if(i == num) {
        		 System.out.println(i);
        	 }else {
        		 System.out.print(i+" + ");        		 
        	 }
            sum += i;
         }
            System.out.print("=" +sum); 
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
         int sum = num += num2;
            System.out.print(" "+sum);
         }

      }

   
   public void practice8() {
      
      Scanner sc = new Scanner(System.in);
      System.out.print("정수를 입력하세요. : ");
      int num = sc.nextInt();
      
      for(int i = 1; i <= num; i++) {
              for(int j = 0; j < i; j++) {
            	  System.out.print("*");
              }
              System.out.println();
            }
   }
   
   public void practice9() {
	   
	   Scanner sc = new Scanner(System.in);
	      System.out.print("정수를 입력하세요. : ");
	      int num = sc.nextInt();
	      
	      for(int i = num; i >= 1; i--) {
	    	  for(int j = 1; j <= i; j++) {
		    	  System.out.print("*");
		      }
	      
	      System.out.println();
	      }
   }
   
   public void practice10() {
	   
	   Scanner sc= new Scanner(System.in);
	   System.out.println("정수를 입력하세요. : ");
	   int num = sc.nextInt();
	   
	   for(int i = 0; i < num; i++) {
		   for(int j = 1; j < num - i; j++) {
			   System.out.print(" ");
		   }
		   for(int j = 1; j < 2 + i; j++) {
			   System.out.print("*");
		   }   
		   System.out.println();
	   }
   }
   
   public void practice11() {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.print("정수를 입력하세요. : ");
	   int num = sc.nextInt();
	   
	   for(int i = 0; i <= num; i++) {
		   for(int j = 0; j < num - i ; j++) { // 
			   System.out.print("*");
		   }
		   System.out.println();
		   for(int j = 0; j <= i; j++) {
		   System.out.print(" ");
		   }
	   }
   }
   
   public void practice12() {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.print("정수를 입력하세요. : ");
	   int num = sc.nextInt(); // 4
	   for(int i = 0; i < num - 1; i++){ // 0 1 2 3
		   //   *
		   for(int j = 0; j < num - (1 + i); j++) { // 3 2 1 0
			   System.out.print(" ");
		   }
		   for(int j = 0; j < 1+2*i; j++) { // 1+2*0 1+2*1 1+2*2 1+2*3
				   System.out.print("*");
			   }
		   System.out.println();
	   }
   }
   
   public void practice14() { // *************************************
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.print("숫자를 입력하세요. : ");
	   int num = sc.nextInt();
	   
	   if(num < 2) {
		   System.out.println("잘못 입력하셨습니다. : ");
		   return;
	   }
	   int count = 0;
	   for(int i = 2; i <= num; i++) {
		   boolean isPrime = true;
		   //i 값이 소수인지 아닌지 검사를 함.
		   for(int j = 2; j < i; j++) {
			   if(i % j == 0) {
				   isPrime = false;
			   }
		   }
		   if(isPrime) {
			   System.out.print(i+" ");
			   count++;
		   }
		   //i 값이 소수라면 출력을 하고, 값을 1 증가시킴.
	   }
	   
	   System.out.printf("\n 2부터 %d까지의 소수의 갯수는 %d 개 입니다." , num , count);
   } //****************************************************************
   
   public void practice18() {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.print("정수를 입력하세요. : ");
	   int num = sc.nextInt();
	   for(int i = 0; i < num; i++) {
		   for(int j = 0; j < num - (1+i); j++) {
		   System.out.print(" ");
		   }
		   for(int j = 0; j < 1 + 2 * i; j++) {
		   System.out.print("*");
	   		}
		   System.out.println();
	   		}
	   for(int i = 0; i < num - 1; i++) { // 0 1 2...
	   	   for(int j = 0; j < 1+i; j++) { // 0
		   System.out.print(" "); // ;
		   }
		   for(int j = 0; j < (num - i) * 2 - 3; j++) { // 1 + 2 *(num - 2 - i) -> 1 -> 0
			   							// 1 + 2num -4 -2i -> 1 - 4 + 2(num-i) - 3
		   System.out.print("*");
	   		}
		   System.out.println();
	   }
	   
   }
   
}