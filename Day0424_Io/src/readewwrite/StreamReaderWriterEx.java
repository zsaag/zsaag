package readewwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamReaderWriterEx {

	public static void main(String[] args) {
		//InputStreamReader OutputStreamWriter
		//바이트 스트림과 문자 스트림의 중간다리역할을 한다.
		//많은 경우에 데이터를 읽어오기 위해서 InputStream, OutputStream을 많이 사용,
		//바이트 스트림을 문자 스트림으로 바꿔야 되는 경우에 사용한다.
		//System.in(표준입력)  ,System.out(표준출력) 을 문자 스트림으로 처리 해보기 
		//표준 입출력은 바이트 스트림, Reader Writer를 이용해서 사용하기 위해서는
		//InputStreamReader OutputStreamWriter 가 필요하다.
		
		//BufferedReader, BufferedWriter를 사용		
		BufferedReader br =null;
		BufferedWriter bw =null;
		
		//중간다리 역할을 할 reader writer
		InputStreamReader isr =null;
		OutputStreamWriter osw =null;
		
		//표준입출력으로 부터 데이터를 얻어오고, 넣기 위해서 연결
		isr = new InputStreamReader(System.in);
		osw = new OutputStreamWriter(System.out);
		
		br = new BufferedReader(isr);
		bw = new BufferedWriter(osw);
		
		
		try {
			//키보드로 부터 입력이니까 키보드가 엔터를 치면 받아와야 함
			//한줄을 입력 받아야 한다.
			String id=br.readLine();
			bw.write("id: "+id+"\n");
			bw.flush();
			
			String pass = br.readLine();
			bw.write("pass: "+pass+"\n");
			bw.flush();
			
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
