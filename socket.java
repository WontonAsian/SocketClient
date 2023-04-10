# Socket Client


## server djxmmx.net / port 17 (Quote of the Day service)



## server time.nist.gov / port 13 (Date-and-Time service)

import java.net.*; 
import java.io.*;
public class SocketClient {
    public static void main(String... args) {
        try (Socket socket = new Socket("time.nist.gov", 13)) {
            socket.setSoTimeout(15000);
            try (InputStream in = socket.getInputStream()) {
                StringBuilder time = new StringBuilder();
                InputStreamReader reader = new InputStreamReader(in, "ASCII");
                for (int c = reader.read(); c != -1; c = reader.read()) {
                    time.append((char) c);
                }
                System.out.println(time);
            }
        } catch (IOException ex) { System.err.println(ex); }
    }
}

Result: 60044 23-04-10 12:09:01 50 0 0  71.7 UTC(NIST) * 

## server tcpbin.com / port 4242 or 34.230.40.69 / port 30000 (Echo service)
