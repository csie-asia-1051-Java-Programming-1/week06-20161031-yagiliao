package ex;
/*
 * Topic: 輸入一串數字，寫出一數字拆解函數decomp(n)，將其個別數字用空白分開。例如:輸入128917178, 則輸出1 2 8 9 1 7 1 7 8
 * Date: 2016/10/31
 * Author: 105021039 廖野吉
 */
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		decomp(a);
	}
	public static void decomp(int a){
		String b=Integer.toString(a);
		for(int i=0;i<b.length();i++){
			System.out.print(b.charAt(i)+" ");
		}
	}

}
