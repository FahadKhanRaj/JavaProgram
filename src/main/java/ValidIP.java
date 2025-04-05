
public class ValidIP {
    public static void main(String[] args) {
        String[] testIPs = {"192.168.0.1", "172.16.56", "0.0.0.1", "1.12.72.2"};

        for (String ip : testIPs) {
            System.out.println(ip + ": " + (isValidIP(ip) ? "Valid IP" : "Invalid IP"));
        }
    }

    public static boolean isValidIP(String ip) {
        String[] parts = ip.split("\\.");
        if (parts.length != 4) return false;

        try {
            // Check first octet
            int first = Integer.parseInt(parts[0]);
            if (first == 0 || first < 10) return false;

            for (String part : parts) {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) return false;
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

