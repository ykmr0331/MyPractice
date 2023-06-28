import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*입력 첫번째 라인 숫자만큼  두번째라인에 숫자가 띄어쓰기로 나타난다
 * 
 * 세번째 줄의 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
        	String input = br.readLine(); 		// 11입력한거 읽어서 Input에 저장함
        	int num = Integer.parseInt(input); 	//문자11 을 숫자로 변환
     
        	String[] numbers = new String[num]; //크기 11인 배열 만들어
            String input3 = br.readLine();
            numbers = input3.split(" ");
            int count=0;

			
            
       

        break;
       }

        bw.flush();
        bw.close();
        br.close();
    }
}
