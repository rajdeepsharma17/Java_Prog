class Thread1 extends Thread
{
	Thread1(String s)
	{
		super(s);
		//start();
	}
	public void run()
	{
for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
			//System.out.println("hello");
			try{
				Thread.sleep(1000);
			}catch(Exception e){ }
}
	
System.out.println("thread1 class  run  completed");	
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

System.out.println("thread2 class run  complete");		
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
System.out.println("thread3 class run  completed");	

	}
}


class   CallRun
{
public static void main(String s[])
{

Thread t1=new Thread1("thread1");
Thread t2=new Thread2("thread2");
Thread  t3=new Thread3("thread3");
t1.run();
t2.run();
t3.run();

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
