package csce247.assignments.template;

public abstract class Worker {
	/**
	 * Intiates the void methods below
	 */
	public final void dailyRoutine() 
	{
		wakeUp();
		eatBreakfast();
		goToWork();
		work();
		comeHome();
		eat();
		sleep();
	}
	
	public abstract void work();

	public void goToWork()
	{
		System.out.println("It's time to drive to work");
	}
	
	public void wakeUp() {
		System.out.println("It's time to get out of bed sleepyhead");
	}
	
	public void eatBreakfast() {
		System.out.println("It's time to eat some yummy breakfast");
	}
	
	public void comeHome()
	{
		System.out.println("It's time to drive home, YAY");
	}
	
	public void eat()
	{
		System.out.println("It's time to eat, yum yum yum");
	}
	
	public void sleep()
	{
		System.out.println("It's time to go back to bed...zzzzz");
	}

}
