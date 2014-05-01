

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class DateServerImpl extends UnicastRemoteObject implements DateServer {
  public DateServerImpl () throws RemoteException {
	  super();
  }

  public Date getDate () throws RemoteException {
    System.out.println("Aufruf von getDate()");
    return new Date ();
  }

  public static void main (String[] args){

    try {
      LocateRegistry.createRegistry( 7689 );
      DateServerImpl dateServer = new DateServerImpl ();
      Naming.rebind ("rmi://localhost:7689/DateServer", dateServer);
      System.out.println("Server gestartet");
      
    } catch (Exception e) {System.out.println("DateServerImpl: " + e.getMessage());
    		e.printStackTrace();
	}
  }
}
