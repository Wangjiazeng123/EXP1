package pack1;

public class CPU {
private int speed;
private String type;
private double temp;
public CPU(){

}
public CPU(int speed,String type,double temp) {
	setSpeed(speed);
	setType(type);
	setTemp(temp);
}
public int getSpeed() {
	return speed;
}
public String getType() {
	return type;
}
public double getTemp() {
	return temp;
}
public void setSpeed(int m) {
	if(m>1000 && m<3000)
	speed=m;
    else 
    	{System.out.println("CPU speed was wrong!");
    	speed=m;
    	}
}
public void setTemp(double m) {
	if(m>60.00 && m<100.00)
		temp=m;
	    else 
	    	{System.out.println("CPU temp was wrong!");
	    	temp=m;
	    	}
}
public void setType(String m) {
	type=m;
}
}

