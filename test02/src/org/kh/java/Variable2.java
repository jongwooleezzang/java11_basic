package org.kh.java;

public class Variable2 {

	public static void main(String[] args) {
  byte b = 10 ;
  short s = 20 ;
  int i ; //선언(ㅇ) 초기화(x) >> 그냥 출력시 Null Pointer Error
  long l ;
  i=30; //초기화
  l=40; //초기화
 System.out.println("b="+b);
 System.out.println("s="+s);
 System.out.println("i="+i);
 System.out.println("l="+l);   //null Pointer error
// b =130; Overflow
 //b =-130; Underflow
 
 }

}
