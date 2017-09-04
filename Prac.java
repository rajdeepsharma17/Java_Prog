class Prac{
	public static void main(String args[]){
		System.out.println("yo");
		int a,b,c;
		a=23;
		b=75;
		c=a+b;
		System.out.println(c);
		int i;
		for(i=1;i<10;++i){
			System.out.println("i = "+i);
		}
		i=0;
		System.out.println(" ");
		do{
			i++;
			System.out.println("i = "+i);
		}while(i<10);

		Thread t = Thread.currentThread();
	    System.out.println(t.getName());

	}


}