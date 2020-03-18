package For_do_While;

import java.util.Scanner;

public class Intervalo_For {
	public static void main(String[] args) {
		
		int n,x;
		int in = 0;
		int out = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um N inteiro:");
		n = sc.nextInt();
		
		for(int i = 1; i<=n; i++){
			x = sc.nextInt();
			if(n >= 10 && n <=20){
				in +=1;
				System.out.println("in "+in);
			}else {
				out += 1;
				System.out.println("out: " +out);
			}
		}
	}

}
