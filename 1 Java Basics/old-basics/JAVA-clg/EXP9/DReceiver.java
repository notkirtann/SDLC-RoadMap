import java.net.*;  
public class DReceiver{  
  public static void main(String[] args) throws Exception { 
    DatagramSocket ds = new DatagramSocket(3300);  
    byte[] buf = new byte[1024];  
    int count  = 0;
    while (count <= 900) {
      count++;
    DatagramPacket dp = new DatagramPacket(buf, 1024);  
    ds.receive(dp);  
    String str = new String(dp.getData(), 0, dp.getLength());  
    System.out.println(str);  
   
    }
    ds.close();  
 
  }  
}