package nogeneric;

public class MySuperUltraArrayListMain {

	public static void main(String[] args) {
		Account acc1=new Account(1111,"BING",33000,0.3);
		Account acc2=new Account(2222,"KING",12000,1.2);
		Account acc3=new Account(3333,"YING",89000,5.6);
		Account acc4=new Account(4444,"SING",45000,4.8);
		Account acc5=new Account(5555,"PING",99000,2.9);
		MySuperUltraArrayList accountList=
				new MySuperUltraArrayList();
		int size = accountList.size();
		System.out.println("#size:"+size);
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("#size:"+accountList.size());
		Account getAccount=
				(Account)accountList.get(0);
		System.out.println(getAccount);
	}

}