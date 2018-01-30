/**
 * Created by Kuba on 08/02/2017.
 */

    import java.net.*;

    public class Connection {
        public static boolean connect(String ip) {
            boolean ifup;
            try {
                String ipAddress = ip;
                InetAddress inet = InetAddress.getByName(ipAddress);

                if (inet.isReachable(3000)){
                    ifup=true;
                } else {
                    ifup=false;
                }
            } catch ( Exception e ) {
                ifup=false;
            }
            return ifup;
        }
    }


