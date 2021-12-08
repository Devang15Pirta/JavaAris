package Class0812;

import java.util.ArrayList;

public class Task1 {
	public static void main(String a[]) {
		ArrayList<LangMarks> l =new ArrayList<>();
		l.add(new LangMarks("Java",59));
		l.add(new LangMarks("Android",87));
		l.add(new LangMarks("Python",79));
		
		for(LangMarks item:l) {
			System.out.println("Language name: "+item.getName()+"\nMarks :"+item.getMarks());
			System.out.println();
		}
	
		System.out.println();
		System.out.println();
		System.out.println();
	
	
	ArrayList<Student2> s =new ArrayList<>();
	s.add(new Student2("Devang",459,371,398));
	s.add(new Student2("Ravi",487,393,468));
	s.add(new Student2("Rama",379,347,498));
	
	for(Student2 item:s) {
		System.out.println("Student name: "+item.getName()+"\nMarksin subject 1 :"+item.getM1()+"\nMarksin subject 2 :"+item.getM2()+"\nMarksin subject 3 :"+item.getM3());
		System.out.println();
	}
	System.out.println();
	System.out.println();
	System.out.println();



ArrayList<Book> b =new ArrayList<>();
b.add(new Book("Immortals of Meluha","00012","RS250","Amish"));
b.add(new Book("Harry Potter vol5","00312","RS500","JK Rowling"));
b.add(new Book("Julius Ceaser","00002","RS450","Shakespeire"));

for(Book item:b) {
	System.out.println("Book name: "+item.getName()+"\nBook ID :"+item.getId()+"\nBook Price:"+item.getPrice()+"\nBook Author:"+item.getAuthor());
	System.out.println();
}

}
}


