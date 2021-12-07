package student;

public class Audi implements Vehicle{
	public double tuneUpCost() {
		double t=31000;
		return t;
	}
	public boolean canCarry(int a) {
		if(a<=4) {
			return true;
		}
		else {
			return false;
		}
	}


}
