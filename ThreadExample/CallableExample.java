package ThreadExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample implements Callable<Integer> {
	
	int value;
	
	CallableExample(int value){
		this.value = value;
	}
	
	
	@Override
	public Integer call() throws Exception {
		
		return value;
		
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService ex = Executors.newFixedThreadPool(1);
		
		CallableExample obj = new CallableExample(25);
		
		Future<Integer>result = ex.submit(obj);
		
		System.out.println(result.get());
		
		ex.shutdown();
		

	}

	

}
