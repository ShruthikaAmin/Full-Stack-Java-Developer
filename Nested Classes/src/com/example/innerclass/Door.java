package com.example.innerclass;

public class Door 
{
	private Lock lock;
	
	
	public Door() {
		this.lock = new Lock(true);
	}
	
	
	public void shopStatus()
	{
		if(lock.isLock())
		{
			System.out.println("Please visit later !!!");
		}
		else
		{
			System.out.println("Welcome ");
		}
		
	}
	public Lock getLock() {
		return lock;
	}


	public void setLock(Lock lock) {
		this.lock = lock;
	}
	public class Lock
	{
		private boolean lock;

		public Lock(boolean lock) 
		{
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}
		
	}

}
