package Vector_Array;

public class Boxing_unboxing_wrapper {
	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int) obj;
		
		System.out.println(y);
		
		String [] vect = new String [] {"Lau","Renan","Lau"};
		
		for(String obj1 : vect) {
			System.out.println(obj1);
		}
		
	}

}
