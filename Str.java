class Str{
	public static void main(String args[]){
		String s ="       Rajdeep Sharma   ";
		String s1 = s.trim();
		System.out.println(s);
		System.out.println(s.length());

		for(int i=1;i<14;i=i+2){
			char ch = s.charAt(i);
		System.out.println(ch);
		}
		System.out.println(s1);
		System.out.println(s.substring(4,12));
		String s2 = s.toUpperCase();
		System.out.println(s2);
		String s3 = s.toLowerCase();
		System.out.println(s3);
		String s4[] = s1.split(" ");
		String s5 = String.valueOf(10);
		System.out.println(s5);
		String s6 = "Good"+10;
		System.out.println(s6);
		

		
	}
}