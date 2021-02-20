package lab8.exercise2;

public class Timer implements Runnable {

	@Override
	public void run() {
		for(int i=9;i>=0;i--) {
			System.out.println("Timer task started");
			completeTask();
			System.out.println("Timer task finished");			
		}		
	}
	private void completeTask() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
}
