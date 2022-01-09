
// Fig. 15.9: Account.java
// Serializable Account class for storing records as objects.
import java.io.Serializable;

public class Account implements Serializable {
	private VIP vip;
	private int account;
	private double balance;

	// initializes an Account with default values
	public Account() {
		this(0, 0, "", "", 0.0); // call other constructor
	}

	// initializes an Account with provided values
	public Account(int Id, int account, String firstName, String lastName, double balance) {
		vip = new VIP(Id, firstName, lastName);
		this.account = account;
		this.balance = balance;
	}

	public VIP getVip() {
		return vip;
	}

	public int getAccount() {
		return account;
	}

	public double getBalance() {
		return balance;
	}

} // end class AccountRecordSerializable

/*************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 *************************************************************************/