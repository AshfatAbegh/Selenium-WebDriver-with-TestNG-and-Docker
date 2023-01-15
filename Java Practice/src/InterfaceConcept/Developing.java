package InterfaceConcept;

public class Developing implements BankingClient, DomainClient{
	//now this class is responsible to implement all method of BankingClient

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Developing d = new Developing();
       
       //For calling a method into class we need to write object.method
       d.paycreditcard();
       d.Transferbalance();
       d.Checkingbalance();
       d.login();
       d.investment();
       
       BankingClient dr = new Developing();//Run Time Polymorphism
	   //dr.login
       DomainClient dc = new Developing();
       dc.investment();
	}
	
	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		 System.out.println("Paycredit Implemented");
	}

	@Override
	public void Transferbalance() {
		// TODO Auto-generated method stub
		 System.out.println("Transferbalance Implemented");
	}

	@Override
	public void Checkingbalance() {
		// TODO Auto-generated method stub
		 System.out.println("Checkingbalance Implemented");
		
	}
	
	public void login()
	{
		 System.out.println("LoggedIn");
	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub
		 System.out.println("Investment Done");
	}

}
