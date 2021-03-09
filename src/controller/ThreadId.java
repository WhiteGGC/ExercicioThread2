package controller;

public class ThreadId extends Thread{
	@Override
	public void run() {
		Id();
	}
	
	public void Id(){
		int id = (int)(getId());
		System.out.println("TID #"+id);
	}
}
