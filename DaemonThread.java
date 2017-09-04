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
//System.out.println("hy");
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


class  DaemonThread
{
public static void main(String s[])
{

Thread t1=new Thread1("thread1");
Thread  t2=new Thread2("thread2");
Thread  t3=new Thread3("thread3");
t1.setDaemon(true);
t2.setDaemon(false);
t3.setDaemon(false);
t1.start();
t2.start();
t3.start();

for(int i=1;i<=2;i++)
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
