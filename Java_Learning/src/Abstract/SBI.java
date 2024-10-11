package Abstract;

	
class SBI implements Bank9{

		@Override
		public void OpenAccount() {
			// TODO Auto-generated method stub
			System.out.println("OPen the Account");
		}

		@Override
		public void DepositMoney() {
			// TODO Auto-generated method stub
			System.out.println("Money will be Deposited");
		}

		@Override
		public void WithDrawMoney() {
			// TODO Auto-generated method stub
			System.out.println("Money will ne Withdraw");
		}

		@Override
		public void TransferMoney() {
			// TODO Auto-generated method stub
			System.out.println("Money Will be WithDraw");
		}

		@Override
		public void CloseAccount() {
			// TODO Auto-generated method stub
			System.out.println("Close  the Account");
		}
	public static void main(String[] args) {
		System.out.println(Bank9.AccountType);
		System.out.println(Bank9.balance);
		SBI s = new SBI();
		s.CloseAccount();
		s.DepositMoney();
		s.TransferMoney();
		s.WithDrawMoney();
		s.OpenAccount();
		s.GenerateStatement();
		Bank9.openflexidepositAccount();
	}
		
	}


