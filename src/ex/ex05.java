package ex;
/*
 * Topic: 使用者輸入一個大正整數值，請設計一個函數fun1(n)可以計算該大數字裡的數字總合。例如:輸入: 4832 則輸出 17
 * Date: 2016/10/31
 * Author: 105021039 廖野吉
 */
import java.util.*;
public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		System.out.println(fun1(a));
	}
	public static int fun1(int a){
		int sum=0;
		while(a>0){
			sum+=a%10;
			a/=10;
		}
		return sum;
	}

}
