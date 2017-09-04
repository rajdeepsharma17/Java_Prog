class Thread1 extends Thread
{
	Thread1(String s)
	{
		super(s);
		start();
	}
	public void run()
	{
        for(int i=1;i<=5;i++)
		{
			System.out.println(getName());
			//System.out.println("hello");
			try{
				Thread.sleep(1000);
			}catch(Exception e){ }
        }
	
System.out.println(getName()+" dead");	
	}
}

class Thread2 extends Thread
{
	Thread2(String s)
	{
		super(s);
		//start();
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName());
//System.out.println("hay");
			try{
				Thread.sleep(1000);
			}catch(Exception e){ }
		}

System.out.println(getName()+" dead");		
}
}
class Thread3 extends Thread
{
	Thread3(String s)
	{
		super(s);
		//start();
	}
	public void run()
	{
		for(int i=1;i<=15;i++)
		{
			System.out.println(Thread.currentThread().getName());
//System.out.println("bye");
			try{
				Thread.sleep(1000);
			}catch(Exception e){ }
		}
System.out.println(getName()+" dead");	

	}
}


class RunThread2
{
public static void main(String s[])
{

Thread1 t1=new Thread1("Rishav");
Thread2  t2=new Thread2("Purushottam");
Thread3  t3=new Thread3("Saxena");
//t1.run();
t2.start();
//t1.start();
t3.start();

for(int i=1;i<=20;i++)
{
			System.out.println(Thread.currentThread().getName());
//System.out.println("tata");
			try{
				Thread.sleep(1000);
			}catch(Exception e){ }
		}
System.out.println(Thread.currentThread().getName()+"dead");


}

}



/*try
{

t1.join();
t2.join();
t3.join();
}catch(Exception e){ }*/
