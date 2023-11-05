package com.thread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
	
	/**
	 * It is evident by looking at the output of the program that tasks 4 and 5 are executed only when 
	 * the thread has an idle thread. Until then, the extra tasks are put in the queue.
	 
	 * The takeaway from the above example is when one wants to execute 50 tasks but is not willing to create 
	 * 50 threads. In such a case, one can create a pool of 10 threads. Thus, 10 out of 50 tasks are assigned, 
	 * and the rest are put in the queue. Whenever any thread out of 10 threads becomes idle, it picks up the 
	 * 11th task. The other pending tasks are treated the same way.
	 */
	
	static final int MAX_TH = 3;              
	  
	// main method  
	public static void main(String[] argvs)
	{  
	// Creating five new tasks  
	Runnable rb1 = new Tasks("task 1");  
	Runnable rb2 = new Tasks("task 2");  
	Runnable rb3 = new Tasks("task 3");  
	Runnable rb4 = new Tasks("task 4");  
	Runnable rb5 = new Tasks("task 5");


		// creating a thread pool with MAX_TH number of
	// threads size the pool size is fixed  
	ExecutorService pl = Executors.newFixedThreadPool(MAX_TH);
	
//	thread 1 -> task 1
//	thread 2 -> task 2
//	thread 3 -> task 3
//	
//	ThreadPool -> 0
	
//	task 1 and task 3 is complete -> thread1 and thread3 are idle
//	
//	ThreadPool -> 2
//	ThreadPool -> 1
	
	// get 5 tasks done with 3 threads
	  
	// passes the Task objects to the pool to execute (Step 3)  
	pl.execute(rb1);  
	pl.execute(rb2);  
	pl.execute(rb3);  
	pl.execute(rb4);  
	pl.execute(rb5);
		// ThreadPool -> 3
	// pool is shutdown  
	pl.shutdown();    
	}  
}
