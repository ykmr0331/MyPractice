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
		Socket socket=
		new Socket("223.130.195.95",80);//new Socket() 메서드: IP 주소와 80번 포트 번호를 사용하여 클라이언트 측 소켓을 생성
		
		  
		/*	포트 번호는 컴퓨터 네트워크에서 데이터를 주고받는 데 사용되는 번호입니다. 
			포트 번호는 0~65535 사이의 숫자로 지정됩니다.
			 포트 번호는 컴퓨터의 IP 주소와 함께 사용되어 데이터를 특정 프로그램이나 프로세스에 전달합니다.*/
		 
		System.out.println("client 쪽 socket:"+socket);//클라이언트 측 소켓의 정보를 콘솔에 출력합니다.
		
		// 원격지 IP 주소와 클라이언트 측 IP 주소를 각각 remoteAddress와 localAddress 변수에 저장
		InetAddress remoteAddress = socket.getInetAddress();//getInetAddress() 메서드:	 소켓의 원격지 IP 주소를 나타내는 InetAddress 객체를 반환
		InetAddress localAddress=socket.getLocalAddress(); //getLocalAddress() 메서드:  소켓의 클라이언트 측 IP 주소를 나타내는 InetAddress 객체를 반환
		
		System.out.println("remote ip   :"+remoteAddress.getHostAddress());
		System.out.println("remote port :"+socket.getPort());
		System.out.println("local ip   :"+localAddress.getHostAddress());
		System.out.println("remote port :"+socket.getLocalPort());
		//원격지 IP 주소, 포트 번호, 클라이언트 측 IP 주소, 포트 번호를 콘솔에 출력합니다.


		
	}

}