import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class MyClient {
    public static void main(String[] args) {
        List<String> ipAddresses = new ArrayList<>();
        ipAddresses.add("172.26.59.65");
        ipAddresses.add("192.168.223.1");
        ipAddresses.add("172.26.61.66");
        ipAddresses.add("192.168.56.1");
        ipAddresses.add("172.26.59.111");
        ipAddresses.add("172.26.59.85");
        ipAddresses.add("172.26.59.81");
        ipAddresses.add("172.26.59.96");
        ipAddresses.add("172.15.15.1");
        ipAddresses.add("172.26.59.168");
        String message = "Hello all Kirtan this side ";
for (String ipAddress : ipAddresses) {
            try {
                Socket s = new Socket(ipAddress, 6666);
                DataOutputStream dout = new DataOutputStream(s.getOutputStream());
                dout.writeUTF(message);
                dout.flush();
                dout.close();
                s.close();
            } catch (Exception e) {
                System.out.println("Error sending message to " + ipAddress + ": " + e);
            }
 }
}
}