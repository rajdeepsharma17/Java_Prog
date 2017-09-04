class Static{
	static int count=0;
	static void change(){
		String college = "IIT Delhi";
		System.out.println(college);
	}
	Static(){
		count++;
		System.out.println(count);
	}

	public static void main(String args[]){
		Static c1=new Static();
		Static c2=new Static();
		Static c3=new Static();

		String s="Hello is ";

		String s1 = s;
		s.toLowerCase();
		int z=s.indexOf("H");
		System.out.println(s+z);
		change();
	}
}