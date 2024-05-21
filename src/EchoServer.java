import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        System.out.println("Waiting for client");
        try {
            ServerSocket ss = new ServerSocket(9999);
            Socket      soc = ss.accept();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Connection established");
    }
}
