package student;

public class Result extends Marks {
	int result;
	float per;
	Result(int M1,int M2 ,int M3){
		this.result=(int)M1+(int)M2+(int)M3;
	    this.per=(float)result/(float)3;

		totalMarks();
		percentage();
		grade();
		
		
	}

   public void totalMarks(){
	   System.out.println("Total marks of the student is: "+result);
   }
   public void percentage() {
	   System.out.println("The Percentage of the student is: "+per);
   }
   public void grade() {
	   if(per>=90) {
		   System.out.println("The Grade of the student is A");
	   }
	   else if(per>=80&&per<90) {
		   System.out.println("The Grade of the student is B");
	   }
	   else if(per>=70&&per<80) {
		   System.out.println("The Grade of the student is C");
	   }
	   else if(per>=60&&per<70) {
		   System.out.println("The Grade of the student is D");
	   }
	   else {
		   System.out.println("The Grade of the student is E");
	   }
   }
}
