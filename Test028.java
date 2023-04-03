import java.io.*;
public class Test028 {
public static void main(String [] args) throws Exception {
Studentt ob[]=new Studentt[10];
FileInputStream fileIn = 
new FileInputStream("C:\\pavan\\cs2student.ser");
ObjectInputStream in = new ObjectInputStream(fileIn);
ob[0] = (Studentt) in.readObject();
ob[1] = (Studentt) in.readObject();
ob[2] = (Studentt) in.readObject();
ob[3] = (Studentt) in.readObject();
ob[4] = (Studentt) in.readObject();
ob[5] = (Studentt) in.readObject();
ob[6] = (Studentt) in.readObject();
ob[7] = (Studentt) in.readObject();
ob[8] = (Studentt) in.readObject();
ob[9] = (Studentt) in.readObject();
in.close();
fileIn.close();
System.out.println("Deserialized Student...");
for(int i=0;i<10;i++) {
System.out.println("Name: " + ob[i].name);
System.out.println("Regd no: " + ob[i].regdno);
System.out.println("CGPA: " + ob[i].cgpa);
}
}
}