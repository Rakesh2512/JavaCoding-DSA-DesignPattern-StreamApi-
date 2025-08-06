package RateLimiter;

import java.sql.Time;
import java.util.concurrent.locks.ReentrantLock;

public class TokenBucket {
	
	private int capacity; //5
	private double refillRate; //3
	private long lastRefillStamp;
	double availabletokens;
	
	private final ReentrantLock lock = new ReentrantLock();
	
	TokenBucket(int capacity,double refillRate){
		
		this.capacity = capacity;
		this.refillRate = refillRate;
		this.availabletokens = capacity;
		this.lastRefillStamp = System.currentTimeMillis();
	}
	
	public boolean isAllowed() {
		lock.lock();
		
		try{
			
			refill();
			if(availabletokens >=1) {
				availabletokens-=1;
				return true;
			}
			return false;
		}
		finally {
			lock.unlock();
		}
	}
	
	private void refill() {
		
		long now = System.currentTimeMillis();
		long elapsed = now - lastRefillStamp;
		
		
		if(elapsed <= 0) {
			return;
		}
		
		//calculate tokens to add 
		
		
		double tokensToAdd = (elapsed/1000.0) * refillRate;
		
	    availabletokens = Math.min(elapsed, tokensToAdd+availabletokens);
	    
	    lastRefillStamp = now;
		
	}
	
	
	public double getAvailableTokens() {
        return availabletokens;
    }
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		TokenBucket limiter = new TokenBucket(5, 3.0);
		
		for(int i =1;i<=10;i++) {
			boolean allowedlimiter = limiter.isAllowed();
			System.out.printf("Request %2d: %s | Tokens left: %.2f%n", i,
                    (allowedlimiter ? "Allowed ✅" : "Blocked ❌"),
                    limiter.getAvailableTokens());

            Thread.sleep(300); // simulate 1 request every 300ms
		}

	}

}
