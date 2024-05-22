import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {

        try {
            System.out.println("Waiting for client");
            ServerSocket ss = new ServerSocket(9999);
            Socket      soc = ss.accept();
            System.out.println("Connection established");
            //Input Stream
            BufferedReader input = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String inputStr = input.readLine();
            //Out Put Stream
            PrintWriter output = new PrintWriter(soc.getOutputStream(),true);
            output.println("Input string is: " + inputStr);

        }catch(Exception e){
            System.out.println(e);
        }

    }
}
