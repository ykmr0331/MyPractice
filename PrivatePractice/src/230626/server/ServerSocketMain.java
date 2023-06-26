package server;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketMain {

	public static void main(String[] args) throws Exception {
		// 소켓 객체를 생성하는 과정에서 예외가 발생할 수 있기 때문입니다
		/*  예를 들어, 소켓 객체를 생성하는 데 사용된 포트 번호가 이미 사용 중이거나, 
			소켓 객체를 생성하는 데 사용된 IP 주소가 유효하지 않은
		 	경우 예외가 발생할 수 있습니다.*/

		/*
		 * ServerSocket 클래스 - 클라이언트의 소켓연결요청신호를 받아서 Socket을 생성하는 클래스 - 서버컴퓨터의
		 * 포트(0~65535)중의 하나를 점유하고 ServerSocket을 생성한다.
		 */
		ServerSocket serverSocket = new ServerSocket(4431);
			// 서버 소켓이 클라이언트 소켓의 연결을 수신할 포트 번호

		/*
		 * public Socket accept() throws IOException; - Listens for a connection to be
		 * made to this socket and accepts it. A. 3333번포트를열고 클라이언트의 소켓연결요청을 무한하게 대기한다.
		 * (쓰레드블록킹) B. 소켓연결요청이오면 소켓을 생성한다.(반환한다) - The method blocks until a connection
		 * is made A. 소켓이생성될때까지 쓰레드블록킹
		 * 
		 */
		while (true) {
			System.out.println("A.3333번 포트를 열고 클라이언트의 소켓연결요청을 처리하기 위해 쓰레드가 무한하게 대기한다.");
			// 서버 소켓은 클라이언트 소켓의 연결을 수신하는 데 사용되는 소켓입니다.
			
			/*
			 * accept() 메소드는 서버 소켓이 클라이언트 소켓의 연결을 수신하는 메서드입니다.
			 *  이 메서드는 클라이언트 소켓의 연결을 수신하면,
			 *		 클라이언트 소켓과 통신할 수 있는 소켓을 생성합니다.
			 *  이 소켓을 사용하여 서버와 클라이언트는 데이터를 주고받을 수 있습니다.
			 */
			Socket socket = serverSocket.accept();
				//서버 소켓이 클라이언트 소켓의 연결을 수신하는 메서드
				//serverSocket은 ServerSocket객체의 참조변수
				//accept는 Socket타입을 반환한다.
			System.out.println("1. 클라이언트의 소켓연결요청을 처리한 후 소켓반환");
			System.out.println("2. 클라이언트와 연결된 서버쪽 socket: " + socket);
				//[addr=/192.168.15.21,port=57755,localport=4431] 이게 나옴
			System.out.println("***********************************************");
			
			InetAddress remoteAddress = socket.getInetAddress();
				// InetAddress 클래스는 Java에서 인터넷 주소를 나타내는 데 사용되는 클래스
				// getInetAddress()메소드는 원격 호스트의 InetAddress 객체를 반환
				// InetAddress 객체는 원격 호스트의 IP 주소와 호스트 이름을 포함합니다.
			InetAddress localAddress = socket.getLocalAddress();
				//getLocalAddress() 메소드는 로컬 호스트의 InetAddress 객체를 반환
				//InetAddress 객체는 로컬 호스트의 IP 주소와 호스트 이름을 포함합니다.
			System.out.println("remote ip   :"+remoteAddress.getHostAddress());
				//getHostAddress()는 주어진 InetAddress 객체의 IP 주소를 반환
				//remoteAddress는 InetAddress타입(로컬 호스트의 IP 주소와 호스트 이름을 포함)임
			
			System.out.println("remote port :"+socket.getPort());				
				//getPort()는 소켓이 연결된 포트 번호를 반환
			System.out.println("local ip   :"+localAddress.getHostAddress());
				//getHostAddress()는 주어진 InetAddress 객체의 IP 주소를 반환
			System.out.println("remote port :"+socket.getLocalPort());
				//getLocalPort()는  소켓이 듣는 포트 번호를 반환
				// 소켓이 80번 포트에 듣고 있다는 것은 소켓이 80번 포트를 통해 들어오는 연결을 수신하고 있다는 것을 의미
			System.out.println("***********************************************");
			System.out.println("3. 클라이언트와 연결된 서버쪽 소켓 닫기");
			socket.close();

			// 192.168.15.21
		}
	}
}
