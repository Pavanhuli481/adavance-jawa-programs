//creating a folder 4CSE2
import java.io.*;
import java.util.Scanner;
public class Test24 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("enter folder name");
String foldername=sc.next();
File f=new File("c:\\"+foldername);
if(f.exists())
	System.out.println("already exists");
else if(f.mkdir()==true)
	System.out.println("successfully created");
else
	System.out.println("can be created");


	}

}
