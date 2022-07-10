package nicheTopics;

public class SystemProperties {

	public static void main(String[] args) {
		
		String current = System.getProperty("os.name");
	    String host = System.getenv("HOSTNAME"); 
	    
	    System.out.println(current);
	    System.out.println(host);
	    
	}
}
