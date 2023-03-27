//creating n number of binary file student.dat
package TestCA2 ;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestCA2 {
	
	public static void main(String[] args) throws IOException {
		
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter filename: ");
    String filename=sc.next();
    System.out.println("Enter foldername: ");
    String foldername=sc.next();
    FileOutputStream f=new FileOutputStream("C:\\4CSE2\\"+filename+".dat");
	System.out.println("File created succesfully");
	String header="Name"+"\t"+"Regno"+"\t"+"EssaySubmitted";
	byte[] arrheader=header.getBytes();
	f.write(arrheader);
	for(int i=0;i<5;i++) 
	{
	System.out.println("Enter name of student");
	String name=sc.next();
	System.out.println("Enter reg no:");
	String regno=sc.next();
	System.out.println("Enter yes or no");
	String subb=sc.next();
	String detail="\n"+name+"\t"+regno+"\t"+subb;
	byte [] arraystudent=detail.getBytes();
	f.write(arraystudent);
	System.out.println("File is written");
	}
	f.close();
	}
}