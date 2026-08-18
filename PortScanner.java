import java.net.Socket;
import java.util.Scanner;

public class PortScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter host to scan (use localhost): ");
        String host = scanner.nextLine();
        System.out.print("Enter start port: ");
        int startPort = scanner.nextInt();
        System.out.print("Enter end port: ");
        int endPort = scanner.nextInt();
        
        System.out.println("\nScanning " + host + " from port " + startPort + " to " + endPort);
        scanner.close();
    }
}

