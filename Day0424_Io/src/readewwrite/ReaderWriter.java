package readewwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {

	public static void main(String[] args) {
		//문자스트림 예제 - 파일복사
		//파일로 부터 데이터를 읽어와서 처리
		//FileReader,FileWriter 사용
		
		FileReader reader =null;
		FileWriter writer =null;
		
		//파일로부터 데이터를 읽어서 복사할 파일에 쓰기
		
		try {
			reader = new FileReader("text.txt");
			writer = new FileWriter("text_copy.txt");
			
			int readChar;
			while((readChar=reader.read())!=-1);{
				//문자열 하나씩 읽어옴, 읽어올 문자열ㅇ이 없으면 -1 반환
				//읽어온 문자열을 복사할 파일에 쓰기
				writer.write((char)readChar);
				writer.close();
			}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
	}finally {
		try {
		if(reader !=null) reader.close();
		if(reader !=null) writer.close();
	}catch(IOException e) {
		e.printStackTrace();
		}
		}
	}
}
