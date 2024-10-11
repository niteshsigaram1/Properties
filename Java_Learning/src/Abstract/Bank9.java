package Abstract;

public interface Bank9 {
	String AccountType = "Savings";
	int balance = 50000;
	public void OpenAccount();
	public void DepositMoney();
	public void WithDrawMoney();
	public void TransferMoney();
	public void CloseAccount();
	default void GenerateStatement() {
		System.out.println("Statementgenerated");
	}
	public static void openflexidepositAccount() {
		System.out.println("openflexidepositaccount");
	}

}
