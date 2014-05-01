
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;

public class DateClient {
  public static void main (String[] args) throws Exception {
	  
    try { 
      Registry registry = LocateRegistry.getRegistry();
      DateServer dateServer = (DateServer) Naming.lookup("rmi://localhost:7689/DateServer");
      Date when = dateServer.getDate ();
      System.out.println ("Datum: " + when);
        
    } catch (Exception e) {
		System.out.println("DateClient: " + e.getMessage());
	    e.printStackTrace();
	}
    
  }
}
