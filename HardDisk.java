package pack1;

public class HardDisk {

private	 int amount; 
private int rads;
public HardDisk(){
	
}
public HardDisk(int amount,int rads) {
	setAmount(amount);
	setRads(rads);
}
	 public int getAmount() {

	      return amount;

	   }

	   public void setAmount(int amount) {

	      this.amount = amount;

	   }
	   public int getRads() {
			return rads;
		}
	   public void setRads(int rads) {
		   this.rads = rads;

	}
}