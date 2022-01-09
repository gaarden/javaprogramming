import java.io.Serializable;

public class VIP extends Person implements Serializable {
	private int Id;
	
	public VIP() {
		this(0, "", "");
	}
	
	public VIP(int Id, String firstName, String lastName) {
		super(firstName, lastName);
		this.Id = Id;
	}
	
	public int getId() {
		return Id;
	}
}
