package student;

public class CommMarks extends Student{
	int C1;
	int C2;
	int C3;
	void readMarks(){
		System.out.println("Marks in Economics: ");
		C1=s.nextInt();
		System.out.println("Marks in Finance: ");
		C2=s.nextInt();
		System.out.println("Marks in English: ");
		C3=s.nextInt();
	}
	void displayMarks() {
		System.out.println("Marks in Economics: "+C1+" ; Marks in Finance: "+C2+" Marks in English: "+C3);
		Result r =new Result(C1,C2,C3);
	}

}
