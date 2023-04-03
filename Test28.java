//student is Deserialization
import java.io.*;
public class Test28 {
	public static void main(String[] args)throws Exception {
		Student ob1 = null;
		FileInputStream fileIn = new FileInputStream("C:\\pavan\\students.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		ob1 = (Student) in.readObject();
		in.close();
		fileIn.close();
		System.out.println("Deserialization Student...");
		System.out.println("Name:" + ob1.name);
		System.out.println("Regno:" + ob1.regno);
		System.out.println("CGPA: + ob1.cgpa");
	}
}
