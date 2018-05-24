package 打车;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int sum,fee;
		sum = input.nextInt();
		fee = input.nextInt();
		int [] p = new int[sum];
		for(int i=0;i<sum;i++){
			p[i] = input.nextInt();
		}
		input.close();
		Arrays.sort(p);
//		for(int a:p){
//			System.out.print(a+" ");
//		}
		int count = 0;
		int ct2 = 0;
		for(int i=0;i<p.length;i++){
			ct2 = ct2 + p[i];
			if(ct2 == fee){
				count = i;
				break;
			}
			if(ct2>fee){
				count = i;
				break;
			}
		}

		for(int i = count; i>0; i--){
			if(ct2 - p[i]>fee){
				ct2 = ct2 - p[i];
				count--;
			}
			if(ct2 - p[i]==fee){
				count--;
				break;
			}
		}
		System.out.println(count+1);
	}
}		
	
