import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	final/*����� ���鶧 ���*/ static String SERVER_IP/*����� �������� ������ �빮�� �ܾ�� �ܾ���� ����� �߰�*/ = "127.0.0.1";
	final static int SERVER_PORT =1225;
	final static String MESSAGE_TO_SERVER = "Hi, Server";

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket(SERVER_IP, SERVER_PORT);
			System.out.println("socket ����");
			
			InputStream is = socket.getInputStream();
		    OutputStream os = socket.getOutputStream();
		    
		    os.write(MESSAGE_TO_SERVER.getBytes());
		    os.flush();
		    

		    byte[] data = new byte[16];
		    int n = is.read(data);
		    final String messageFromClient = new String(data, 0, n);
		    System.out.println(messageFromClient);
		    
		    
		    is. close();
		    os. close();
		    
			socket.close();//������ ���� �ݵ��� �ݾ� ��� �Ѵ�.
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
