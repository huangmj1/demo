package app;

import java.util.Random;

public class App2 {
		
	public static void getrRandomNum() {
		int count=10,a=0;
		int[] sb = new int[count];
		Random r = new Random();
		do{
			int num=r.nextInt(count);	
			System.out.println("num="+ num);
			a=0;
			for (int i = 0; i < sb.length; i++) {
				if(num==sb[i]){
					a=1;
				}
			}
			for (int i = 0; i < sb.length-1; i++) {
				if(sb[i+1]==0 && a==0){
					sb[i+1]=num;
					break;
				}
			}
		}while(sb[9]==0);
		for (int aa:sb) {
			System.out.println(aa);
		}
	}
	
 
	
	
	public static void main(String[] args) {
		App2  ap=new App2();
		
		//ap.getrRandomNum();
		System.out.println(2<<3);
		

	}
}
