package student;

public class Marks extends Student{
	int M1;
	int M2;
	int M3;
	
	
	void readMarks(){
		System.out.println("Marks in Subject 1: ");
		M1=s.nextInt();
		System.out.println("Marks in Subject 2: ");
		M2=s.nextInt();
		System.out.println("Marks in Subject 3: ");
		M3=s.nextInt();
		
		
		
		
		
	}
	void displayMarks() {
		System.out.println("Marks in Subject 1: "+M1+" ; Marks in Subject 2: "+M2+" Marks in Subject 3: "+M3);
		Result R=new Result(M1,M2,M3);
	}
}
