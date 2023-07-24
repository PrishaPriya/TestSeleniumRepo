package InheriPractice;

public class AbstractAndInterface {

}

// Abstract class have method with no body and method with body.
// Means abstract is a partial abstract.

abstract class Bank{
	
	public abstract void TransferMoney(); // Method without body
	
	public void WithdrowMoney() {}       // Method with body   
	
}

// interface is a full abstract 
// in interface we can not have method body. 

interface BankSBI{
	
	public void TransferMoney();
	public void WithdrowMoney();
	
}