//either PrintWriter or BufferedWriter
import java.io.*;
public class Test22 {

	public static void main(String[] args) throws Exception {
		File source=new File ("C:\\huli\\multithreading.txt");
		File target=new File ("C:\\huli\\multithreading_copy.txt");
		FileReader fr = new FileReader(source);
		FileWriter fw = new FileWriter(target);
		BufferedReader br = new BufferedReader(fr);
//		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(fw, false);
		String line;
		while((line=br.readLine())!=null) {
			pw.write(line);   //bw.write(line)
			pw.println();     //bw.newLine();
		}
System.out.println("1 file copied");
br.close();
//bw.close();
pw.close();
}
}