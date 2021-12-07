package student;

public class Withdrawn extends Transaction{
      Withdrawn(double a){
    	  bal=bal-a;
    	  execute(bal);
    
      }
      void execute(double bal) {

    	  Balance b=new Balance();
    	  b.execute(bal);
      }
}
