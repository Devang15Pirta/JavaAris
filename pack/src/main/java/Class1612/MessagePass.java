package Class1612;
import org.springframework.beans.factory.annotation.Autowired;
public class MessagePass {
	MyMessage ms;

	public MyMessage getMs() {
		return ms;
	}
   @Autowired
    public void setMs(MyMessage ms) {
		this.ms = ms;
	}
	void displayMsg() {
		ms.display();
	}

}
