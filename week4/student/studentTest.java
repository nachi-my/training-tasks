package week4.student;

public class studentTest {
    public static void main(String[] args) {
		
		
		student studentObj1=new student();
		student studentObj2=new student();
		student studentObj3=new student();
		student studentObj4=new student();
		student studentObj5=new student();
		
		studentObj1.setRollNumber(1);
		studentObj1.setName("Arjun");
		studentObj1.setCourse("Java");
		studentObj1.setMarks1(10);
		studentObj1.setMarks2(20);
		studentObj1.setMarks3(30);
		System.out.println(studentObj1);
		System.out.println(studentObj1.getName()+" grade "+studentObj1.getMarks1()+" : "+studentObj1.getMarks2()+" : "+studentObj1.getMarks3()+" ; ");
		
		studentObj2.setRollNumber(2);
		studentObj2.setName("Balram");
		studentObj2.setCourse("C++");
		studentObj2.setMarks1(30);
		studentObj2.setMarks2(20);
		studentObj2.setMarks3(40);
		System.out.println(studentObj2);
		System.out.println(studentObj2.getName()+" grade "+studentObj2.getMarks1()+" : "+studentObj2.getMarks2()+" : "+studentObj2.getMarks3()+" ; ");
		
		studentObj3.setRollNumber(3);
		studentObj3.setName("Chetanya");
		studentObj3.setCourse("C");
		studentObj3.setMarks1(50);
		studentObj3.setMarks2(60);
		studentObj3.setMarks3(70);
		System.out.println(studentObj3);
		System.out.println(studentObj3.getName()+" grade "+studentObj3.getMarks1()+" : "+studentObj3.getMarks2()+" : "+studentObj3.getMarks3()+" ; ");
		
		studentObj4.setRollNumber(4);
		studentObj4.setName("Damodar");
		studentObj4.setCourse("Python");
		studentObj4.setMarks1(70);
		studentObj4.setMarks2(80);
		studentObj4.setMarks3(90);
		System.out.println(studentObj4);
		System.out.println(studentObj4.getName()+" grade "+studentObj4.getMarks1()+" : "+studentObj4.getMarks2()+" : "+studentObj4.getMarks3()+" ; ");
		
		studentObj5.setRollNumber(5);
		studentObj5.setName("Eklavya");
		studentObj5.setCourse("Javascript");
		studentObj5.setMarks1(20);
		studentObj5.setMarks2(60);
		studentObj5.setMarks3(30);
		System.out.println(studentObj5);
		System.out.println(studentObj5.getName()+" grade "+studentObj5.getMarks1()+" : "+studentObj5.getMarks2()+" : "+studentObj5.getMarks3()+" ; ");
		
	} 
}
