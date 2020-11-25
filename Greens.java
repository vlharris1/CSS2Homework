
public class Greens {
	
	String type;
	int ounces;
	boolean cooked;
	
	private Greens() {
		
	}
	
	private Greens(String type, int ounces) {
		this.type = type;
		this.ounces = ounces;
	}
	
	private Greens(String type, int ounces, boolean cooked) {
		this.type = type;
		this.ounces = ounces;
		this.cooked = cooked;
	}
	
	public String getType() {
		return type;
	}
	
	public int getOunces() {
		return ounces;
	}
	
	public boolean getCooked() {
		return true;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setOunces(int ounces) {
		this.ounces = ounces;
	}
	
	public boolean setCooked() {
		return true;
	}
	
	public boolean isCooked() {
		return true;
	}
	
	public String typeOfGreens(String types) {
		return types;
	}
	
}
