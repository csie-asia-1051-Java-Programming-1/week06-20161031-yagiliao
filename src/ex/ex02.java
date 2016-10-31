package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021039 廖野吉
 */
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		square(m,n);
	}
	public static void square(int m,int n){
		int val1=1;
		int val2=1;
		int val3=1;
		int s=m-n;
		for(int a=1;a<=m;a++){
			val1=val1*a;
		}
		for(int b=1;b<=n;b++){
			val2=val2*b;
		}
		for(int c=1;c<=s;c++){
			val3=val3*c;
		}
		System.out.println("c(m,n)="+val1/(val2*val3));
	}

}
