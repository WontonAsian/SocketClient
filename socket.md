# Socket Client

```import java.io.*;
import java.net.*;

public class SocketClient {
    public static void main(String[] args) {
        String hostname = args[0];
        int port = Integer.parseInt(args[1]);
	

        try (Socket sock = new Socket(hostname, port);
             PrintWriter writer = new PrintWriter(sock.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()))) {
            for (int i = 2; i < args.length; i++) {
                writer.println(args[i]);
            }
            reader.lines().forEach(System.out::println);
        } catch (IOException ex) { System.err.println(ex);
        }
    }
}
```

## server djxmmx.net / port 17 (Quote of the Day service)

Results: "When the sun shine, we shine together.
 Told you I'll be here forever, said I'd always be your friend, took an oath, I'ma stick it out till the end.
 Now that it's rainin' more than ever, know that we'll still have each other.
 You can stand under my Umbrella..."
	 - Rihanna (Umbrella)

## server time.nist.gov / port 13 (Date-and-Time service)

Result: 60045 23-04-11 05:08:21 50 0 0 384.9 UTC(NIST) * 

## server tcpbin.com / port 4242 or 34.230.40.69 / port 30000 (Echo service)

java SocketClient.java tcpbin.com 4242 "hello"


Results: hello

