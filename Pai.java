/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

    

import static java.lang.Math.pow;
import java.util.Scanner;
import java.util.Scanner;
 
public class Pai {
 

 public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  System.out.println("请输入精度：");

  double sum = 0;
  int a = input.nextInt(); 
  

   for (int i = 1; i <=a; i += 2) {
    sum += 4 * (1.0 / (2 * i - 1) - 1.0 / (2 * i + 1));
   }
   System.out.println("结果是"+sum);
 }
}


 
 
 


 

    

 




