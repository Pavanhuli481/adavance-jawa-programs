//creating a binary file student.dat
import java.io.*;
import java.util.Scanner;
public class Test25 {
	
     public static void main(String[] args) throws Exception 
     {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter file name");
	String foldername=sc.next();
	FileOutputStream output = new FileOutputStream("c:\\4CSE2\\"+foldername+".dat");
	System.out.println("file created");
    output.close();
	}

}
