package constructor;

public class Student {
	static int ab;
	
	public Student() {
		System.out.println("a");
	}
	public Student(int a) {
		ab=a;
	//	System.out.println(ab);
	}
	
public static void main(String[] args) {
	Student st=new Student();
	Student cs=new Student(9);
	System.out.println(ab);
	
	
}
}
