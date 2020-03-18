package String;

public class Funcoes {
	public static void main(String[]args) {
		
		String original = "abcde FGHIJ ABCD abcd DEFG  	";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a','x');
		String s07 = original.replace("abc","xyz");
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		System.out.println("Original: -"+original+ "-");
		System.out.println("Original: -"+s01+ "-");
		System.out.println("Original: -"+s02+ "-");
		System.out.println("Original: -"+s03+ "-");
		System.out.println("Original: -"+s04+ "-");
		System.out.println("Original: -"+s05+ "-");
		System.out.println("Original: -"+s06+ "-");
		System.out.println("Original: -"+s07+ "-");
		System.out.println("Index of 'bc': "+i+ "");
		System.out.println("Last in index of 'bc': "+j+ "");
		
	}

}
