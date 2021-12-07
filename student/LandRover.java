package student;

public class LandRover implements Vehicle{
	public double tuneUpCost() {
		double t=15000;
		return t;
	}
	public boolean canCarry(int a) {
		if(a<=7) {
			return true;
		}
		else {
			return false;
		}
	}

}
