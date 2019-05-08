
public interface ATM {
	public boolean withdraw( int account , double money);
	public boolean deposit( int account , double money);
	public double queryBalance( int account);
	public boolean login(String username , String password);
	public boolean logout(String username );

}
