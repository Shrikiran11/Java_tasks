 class SingletonClass {
	//creating object inside the class
	private static SingletonClass singletonClass;
	//creating private constructor
private SingletonClass() {
	
}
//creating private data members
private int paymentId;
public static SingletonClass getInstance() {
	if(singletonClass==null) {
		singletonClass=new SingletonClass();
	}
	return singletonClass;
}
public void displayStatus() {
	System.out.println("Payment Successful for ");
}

}
class Bank{
	public static void main(String[] args) {
		SingletonClass transaction;
		transaction=SingletonClass.getInstance();
		transaction.displayStatus();
	}
}
