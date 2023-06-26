/* 클라이언트 측 소켓을 생성하고, 원격지 IP 주소와 포트 번호를 출력합니다. 또한, 클라이언트 측의 IP 주소와 포트 번호를 출력합니다.*/

package client;

import java.net.InetAddress;
import java.net.Socket;
public class ClientSocketMain {

	public static void main(String[] args) throws Exception{
		/*
		Socket socket=
		new Socket("www.naver.com",80);     // 도메인 이름은 IP 주소에 대한 문자열 표현입니다.
		System.out.println(socket);
		*/
		
		
		Socket socket= new Socket("192.168.15.21",4431);
			//new Socket() 메서드: IP 주소와 4431번 포트 번호를 사용하여 클라이언트 측 소켓을 생성
		
		  
		/*	포트 번호는 컴퓨터 네트워크에서 데이터를 주고받는 데 사용되는 번호입니다. 
			포트 번호는 0~65535 사이의 숫자로 지정됩니다.
			 포트 번호는 컴퓨터의 IP 주소와 함께 사용되어 데이터를 특정 프로그램이나 프로세스에 전달합니다.*/
		 
		System.out.println("client 쪽 socket:"+socket);//클라이언트 측 소켓의 정보를 콘솔에 출력합니다.
	
	/*InetAddress 클래스는 IP 주소를 문자열로 변환하거나 문자열을 IP 주소로 변환하는 데 사용할 수 있습니다.
					또한 IP 주소를 사용하여 다른 컴퓨터에 연결하는 데 사용할 수 있습니다.*/	
	// 원격지 IP 주소와 클라이언트 측 IP 주소를 각각 remoteAddress와 localAddress 변수에 저장
		
		/*
		 * 원격 호스트는 로컬 호스트와 다른 컴퓨터입니다.
		 *  로컬 호스트는 현재 사용하고 있는 컴퓨터를 의미합니다. 
		 *  원격 호스트는 로컬 호스트와 다른 네트워크에 있는 컴퓨터일 수도 있고,
		   	같은 네트워크에 있는 컴퓨터일 수도 있습니다.
		 */
		
		
		InetAddress remoteAddress = socket.getInetAddress();
			// InetAddress 클래스는 Java에서 인터넷 주소를 나타내는 데 사용되는 클래스
			// getInetAddress()메소드는 원격 호스트의 InetAddress 객체를 반환
			// InetAddress 객체는 원격 호스트의 IP 주소와 호스트 이름을 포함합니다.
			
		
		InetAddress localAddress=socket.getLocalAddress(); 
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
		socket.close();
		
	}

}