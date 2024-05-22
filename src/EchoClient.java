import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        System.out.println("Client started");
        try {
            Socket soc = new Socket("localhost", 9999);
            //Input Stream
            System.out.println("Enter input");
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));//get input from keyboard
            String str = userInput.readLine();                                              //assign the input
            //Output Stream
            PrintWriter output = new PrintWriter(soc.getOutputStream(),true);
            output.println(str);
            //get server output
            BufferedReader serverOutput = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(serverOutput.readLine());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}