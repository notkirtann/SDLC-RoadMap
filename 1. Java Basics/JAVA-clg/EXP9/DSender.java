//DSender.java  
import java.net.*;
import java.util.*;  
public class DSender{  
  public static void main(String[] args) throws Exception { 
    Scanner sc = new Scanner(System.in); 
    DatagramSocket ds = new DatagramSocket();  
    String str = "";  

    while(!str.equals("stop")){
        System.out.print("Enter message: ");
        str = sc.nextLine();
        InetAddress ip = InetAddress.getByName("192.168.137.255");  
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3300);
        
        ds.send(dp);  
    }
     
      
    sc.close();
    
    ds.close();  
  }  
}