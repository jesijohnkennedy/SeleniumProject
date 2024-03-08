package org.stu;

public class Student {
	
	private void studentid() {
System.out.println("Student id ");
	}
private void studentid (int age) {
	System.out.println("Student age :"+age);
}
private void studentid(String name) {
System.out.println("Student name :"+name);
}
private void studentid(String address,long pincode ) {
System.out.println("Student address is :"+address);
}
private void studentid(float mark) {
System.out.println("Student mark is:"+mark);
}
private void studentid(long phno ) {
System.out.println("Studentphno is:"+phno);
}
public static void main(String[] args) {
Student s=new Student();
s.studentid();
s.studentid(25);
s.studentid("Sandra");
s.studentid("16 new building chennai", 600100l);
s.studentid(79f);
s.studentid(9789960196l);


}
}
