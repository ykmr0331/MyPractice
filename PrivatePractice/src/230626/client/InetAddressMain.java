package client;

import java.net.InetAddress;

public class InetAddressMain {

	public static void main(String[] args) throws Exception {
		// 로컬 주소(IP) 출력
		System.out.println("----local address(IP)----");
		InetAddress localAddress = InetAddress.getLocalHost();//getLocalHost(): 컴퓨터의 로컬 주소를 나타내는 InetAddress 객체를 반환합니다
		System.out.println("로컬 호스트 이름: " + localAddress.getHostName());// getHostName() : 로컬 주소의 호스트 이름을 반환합니다.
		System.out.println("로컬 호스트 주소: " + localAddress.getHostAddress());// getHostAddress(): 로컬 주소의 IP 주소를 반환합니다.

		// 원격 주소(IP) 출력
		System.out.println("----remote address(IP)----");
		InetAddress remoteAddress = InetAddress.getByName("www.aladin.co.kr");//즉 remoteAddress는 객체다
											// getByName():호스트 이름을 인수로 받아 호스트 이름의 IP 주소를 나타내는 InetAddress 객체를 반환합니다
		System.out.println("원격 호스트 이름: " + remoteAddress.getHostName());//getHostName(): 원격 주소의 호스트 이름을 반환
		
		System.out.println("원격 호스트 주소: " + remoteAddress.getHostAddress());//getHostAddress():원격 주소의 IP 주소를 반환

		// www.naver.com의 모든 IP 주소 출력
		InetAddress[] remoteAddresses = InetAddress.getAllByName("www.naver.com");
											//getAllByName(): 호스트 이름을 인수로 받아 호스트 이름의 IP 주소를 나타내는 InetAddress 객체의 배열을 반환
		for (InetAddress inetAddress : remoteAddresses) {
			System.out.println(inetAddress);
									//InetAddress 객체의 배열을 순회하고 각 객체를 콘솔에 출력합니다.
		}
	}

}