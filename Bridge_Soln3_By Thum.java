import java.util.concurrent.*;
import java.util.*;

public class Bridge
{
	Semaphore s;
	boolean left = true;
	
	public Bridge()
	{
		s = new Semaphore(2);
	}
	
	synchronized boolean request(boolean left)
	{
		if (s.availablePermits() == 2)
			this.left = !this.left;
		if (left == this.left)
			return s.tryAcquire();
		else
			return false;
	}
	
	void release()
	{
		s.release();
	}
	
	public static void main(String[] args)
	{
		Bridge b = new Bridge();
		Car[] car = new Car[10];
		for (int i = 0; i < car.length; i++)
			car[i] = new Car(i, b);
		for (Car c : car)
			c.start();
	}
}

class Car extends Thread
{
	int id;
	Bridge b;
	boolean left;
	public Car(int id, Bridge b)
	{
		this.id = id;
		this.b = b;
		if (new Random().nextInt(10 + id) % 2 == 0)
			left = true;
		else
			left = false;
	}
	
	public void run()
	{
		while (!b.request(left))
		{
			try
			{
				Thread.sleep(new Random().nextInt(500));
			}
			catch (Exception ex){}
		}
		if (left)
			System.out.println("Car " + id + " passing the bridge from left lane");
		else
			System.out.println("Car " + id + " passing the bridge from right lane");
		try
		{
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("Car " + id + " crossed the bridge");
			b.release();
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		
	}
}