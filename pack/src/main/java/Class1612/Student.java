package Class1612;
import org.springframework.beans.factory.annotation.Autowired;
public class Student {
	Address ad;
	String name;
	
	public Student() {
		super();
		this.name = "Devang";
	}
	public Address getAd() {
		return ad;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Autowired
	public void setAd(Address ad) {
		this.ad = ad;
	}
	
	void dispAdd() {
		System.out.println(name+"'s address is :\n");
		ad.display();
	}
	

}
