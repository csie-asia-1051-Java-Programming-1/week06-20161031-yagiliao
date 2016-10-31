package ex;
/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 105021039 廖野吉
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		char a=scn.next().charAt(0);
		square(n,a);
	}
	public static void square (int n,char a){
	for(int line=1;line<=n;line++){
		for(int i=1;i<=n;i++){
		System.out.print(a);
	}
	System.out.println();
	}
 }
}
