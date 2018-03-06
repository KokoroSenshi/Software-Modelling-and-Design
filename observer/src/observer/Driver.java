package observer;

public class Driver {
	public static final int NUM_OBSERVERS = 2;
	
	public static void main(String[] args) {
		
		ConcreteObserver obs1 = new ConcreteObserver();
		
		ConcreteSubject sub1 = new ConcreteSubject(NUM_OBSERVERS,"Super_Subject");

		ConcreteSubject sub2 = new ConcreteSubject(NUM_OBSERVERS,"Super_2bject");
		
		sub1.registerObserver(obs1);
		sub2.registerObserver(obs1);
		
		sub1.notifyAllObserver();

		sub2.notifyAllObserver();
		
	}

}
