import java.io.*;
import java.util.stream.*;
import java.nio.charset.*;

public class FlipCrypt {
    public static void main(String[] args) throws Exception {
        // Err and Exit If No or Short Password
        if (args.length <= 0) {
            System.err.println("Please Provide a password as an argument");
            return;
        } else if (args[0].length() < 4) {
            System.err.println("Password must be at least 4 characters");
            return;
        }

        // Read Input Message
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[32 * 1024];
        int bytesRead;
        while ((bytesRead = System.in.read(buffer)) > 0) {
            baos.write(buffer, 0, bytesRead);
        }
        byte[] message = baos.toByteArray();

        // Read Password
        byte[] password = args[0].getBytes(StandardCharsets.US_ASCII);

        // XOR
        byte[] result = new byte[message.length];
        for (int messageIndex = 0; messageIndex < message.length; messageIndex++) {
            int passwordIndex = messageIndex % (password.length );
            byte P = message[messageIndex];
            byte K = password[passwordIndex];
            byte C = (byte)(P ^ K);
            result[messageIndex] = C;
        }
        
        // Print
        try {
            DataOutputStream dos = new DataOutputStream(System.out);
            dos.write(result, 0, result.length);
            dos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
