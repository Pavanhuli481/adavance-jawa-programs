//synchronization
public class Test16 {
	class Resource {
		String str;
		synchronized public void setString(String s) {
	    str=s;
	    try {
	    	System.out.print("[");
	    	Thread.sleep(2000);
	    	System.out.print(str+"]");
	    }catch(Exception e) {}	
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
