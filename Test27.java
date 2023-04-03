//student is serialization
import java.io.Serializable;
import java.io.*;
class Student implements Serializable {
int regno;
String name;
double cgpa;
public Student(int regno, String name, double cgpa) {
	this.regno=regno;
	this.name=name;
	this.cgpa=cgpa;
}
}
public class Test27 {
	public static void main(String[] args) throws Exception{
	Student ob1=new Student(0032, "pavan", 7.5);
	Student ob2=new Student(0033, "fayaz", 7.4);
	Student ob3=new Student(0034, "akash", 7.7);
	Student ob4=new Student(0035, "anil", 7.1);
	Student ob5=new Student(0036, "kishor", 7.3);

	FileOutputStream fileOut = new FileOutputStream("C:\\pavan\\students.ser");
	ObjectOutputStream out = new ObjectOutputStream(fileOut);
	out.writeObject(ob1);
	out.write('\n');
	out.writeObject(ob2);
	out.write('\n');
	out.writeObject(ob3);
	out.write('\n');
	out.writeObject(ob4);
	out.write('\n');
	out.writeObject(ob5);
	out.write('\n');
	
	out.close();
	System.out.println("Serialized data is saved in //pavan//students.ser");
	}
}
