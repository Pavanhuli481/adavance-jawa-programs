import java.io.*;
public class Test18 {
	public static void main(String[] args) {
	 File ob = new File("C:\\huli");
	 System.out.println("file name" + ob.getName());
	 System.out.println("Path" + ob.getPath());
	 System.out.println("abs path" + ob.getAbsolutePath());

	 System.out.println(ob.exists()?"exists":"does not exists");
	 System.out.println("file last modified" + ob.lastModified());
 System.out.println("file size" + ob.length()+"bytese");
	}

}