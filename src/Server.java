import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread/*�����带 ��� �ްڴ�*/ {

	final static int SERVER_PORT =1225;// ������ ��Ʈ�� ���� ��� �Ѵ�.
	final static String MESSAGE_TO_CLIENT = "Hello, Client";

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(SERVER_PORT);
			
			while(true) {
				System.out.println("socket ���� ���");
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
