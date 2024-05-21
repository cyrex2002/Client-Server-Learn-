import java.net.ServerSocket;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        System.out.println("Client started");
        try {
            Socket soc = new Socket("localhost", 9999);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}