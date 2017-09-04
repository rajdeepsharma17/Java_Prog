class Temp{
	int age;
	String name;
	void set(int age,String name){
		this.age = age;
		this.name = name;	
	}
	void show(){
		System.out.println(age);
		System.out.println(name);

	}
}


class This{
	public static void main(String[] args){
		Temp t= new Temp();
		t.set(5,"sd");
		t.show();
	}
}