package com.containment;

public class AccountArrayCon {
	int branchCode;
	String bankName;
	String address;
	AccountArrayCon account[];
	public AccountArrayCon() {
		// TODO Auto-generated constructor stub
	}
	
	public AccountArrayCon(int branchCode, String bankName, String address, AccountArrayCon account[]) {
		
		this.branchCode = branchCode;
		this.bankName = bankName;
		this.address = address;
		this.account = account;
	}
    
	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public AccountArrayCon[] getAccount() {
		return account;
	}

	public void setAccount(AccountArrayCon account[]) {
		this.account = account;
	}
    
	@Override
	public String toString() {
		return "Bank [branchCode=" + branchCode + ", bankName=" + bankName + ", address=" + address ;
				
	}

    public void printAccount()
    {
    	for(AccountArrayCon a:account)
    		System.out.println(a);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array of account object
				Bank_Account accArr[]=new Bank_Account[4];
				accArr[0]=new Bank_Account(1699, "Adarsh", 10000);
				accArr[1]=new Bank_Account(1697, "Abhisekh", 1000);
				accArr[2]=new Bank_Account(1698, "Sunish", 500);
				accArr[3]=new Bank_Account(1700,"Bhakti",100);
				
				for(int i=0; i<accArr.length; i++)
					System.out.println(accArr[i]);
				
				System.out.println();
				System.out.println();
				//or
				
//				for(Bank_Account a:accArr)
//					System.out.println(a);

				double max=0;
				String name=" ";
				for(Bank_Account a1:accArr)
				{
					if(a1.getBalance()>max)
					{
						max=a1.getBalance();
						name=a1.getName();
					}	
				}
				
				System.out.println(name + " is having maximimum balance rs "+ max);

	}

}
