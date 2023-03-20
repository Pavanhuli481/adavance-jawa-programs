
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Test20 {

	public static void main(String[] args) throws Exception {
		String essays="multithreading the method by which, many tasks can be performed at a time\nmultithreading is a java feature that allow concurent\nImproved server responsiveness\nProgram structure simplification\n";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name and folder name");
		String filename=sc.next();
		String foldername=sc.next();
		File f=new File("C:\\"+foldername+"\\"+filename+".txt");
		FileWriter out= new FileWriter(f);
		System.out.println("file created");
		out.write(essays);
		System.out.println("file written");
		out.close();
	}
}
