import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread/*쓰레드를 상속 받겠다*/ {

	final static int SERVER_PORT =1225;// 서버랑 포트를 맞춰 줘야 한다.
	final static String MESSAGE_TO_CLIENT = "Hello, Client";

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(SERVER_PORT);
			
			while(true) {
				System.out.println("socket 연결 대기");
				Socket socket = serverSocket.accept();
				System.out.println("host:"+socket.getInetAddress());
				
				InputStream is = socket.getInputStream();
			    OutputStream os = socket.getOutputStream();
			    
			    byte[] data = new byte[16];
			    int n = is.read(data);
			    final String messageFromServer = new String(data, 0, n);
			    System.out.println(messageFromServer);
			    
			    os.write(MESSAGE_TO_CLIENT.getBytes());
			    os.flush();
			    
			    is. close();
			    os. close();
			    
			   
				socket.close();
				
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
