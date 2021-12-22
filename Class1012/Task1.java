package Class1012;
import java.util.*;

public class Task1 {
public static void main(String a[]) {
	HashMap<String,String> c = new HashMap<>();
	c.put("Color 1","RED");
	c.put("Color 2","Black");
	c.put("Color 3","Pink");
	for(Map.Entry<String,String> me: c.entrySet()) {
		System.out.println("The "+me.getKey()+" is "+me.getValue());
	}
	HashMap<String,String> cd = new HashMap<>();
	cd.put("Java","88");
	cd.put("Python","63");
	cd.put("Js","91");
	for(Map.Entry<String,String> me: cd.entrySet()) {
		System.out.println("The "+me.getKey()+" is "+me.getValue());
	}
	HashMap<String,String> ck = new HashMap<>();
	ck.put("Color 1","RED");
	ck.put("Color 2","Black");
	ck.put("Color 3","Pink");
	for(Map.Entry<String,String> me: ck.entrySet()) {
		System.out.println("The "+me.getKey()+" is "+me.getValue());
	}
	
}
}
