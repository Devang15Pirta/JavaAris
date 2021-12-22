package Class1012;
import java.util.*;

public class Task3{
	public static void main(String a[]) {
		ArrayList<HashMap<String,String>> li=new ArrayList<>();
		Has h1=new Has();
		li.add(h1.HasAdd("2","Har"));
		li.add(h1.HasAdd("1","Devang"));
		li.add(h1.HasAdd("3","Shambho"));
		for(Map.Entry<String,String> me: h1.m.entrySet()) {
			System.out.println("Index: "+me.getKey()+"\nName : "+me.getValue());
			System.out.println();
		}
		ArrayList<HashMap<String,String>> l2=new ArrayList<>();

		Has h2=new Has();
		l2.add(h2.HasAdd("5","Haria"));
		l2.add(h2.HasAdd("4","Shankar"));
		l2.add(h2.HasAdd("6","Shambav"));
		h1.m.putAll(h2.m);
		for(Map.Entry<String,String> me: h1.m.entrySet()) {
			System.out.println("Index: "+me.getKey()+"\nName : "+me.getValue());
			System.out.println();
		}
		h1.m.replace("5", "Rahul");
		for(Map.Entry<String,String> me: h1.m.entrySet()) {
			System.out.println("Index: "+me.getKey()+"\nName : "+me.getValue());
			System.out.println();
		}
		System.out.println("Enter the Index");
		Scanner s = new Scanner(System.in);
		String n = s.next();
		System.out.println("the key "+n+" is present: "+h1.m.containsKey(n));
		System.out.println("the element at key "+n+" is : "+h1.m.get(n));
		
		System.out.println("Enter the Index");
		String n1 = s.next();
		System.out.println("the key "+n1+" is present: "+h1.m.containsKey(n1));
		System.out.println("the element at key "+n1+" is Removed: ");
		h1.m.remove(n1);
		
		
		for(String k :h1.m.keySet()) {
			System.out.println("Index: "+k);
			System.out.println();
		}
		
		System.out.println("Enter the Index");
		String n3 = s.next();
		System.out.println("Enter the Value to be replaced");
		String n4 = s.next();
		
		h1.m.replace(n3, n4);
		for(Map.Entry<String,String> me: h1.m.entrySet()) {
			System.out.println("Index: "+me.getKey()+"\nName : "+me.getValue());
			System.out.println();
		}
		
		System.out.println("Size of the map: "+h1.m.size());
		System.out.println("Is list Empty: "+h1.m.isEmpty());
		System.out.println("Clearing map");
		h1.m.clear();
		System.out.println("Is list Empty: "+h1.m.isEmpty());
	}

}
