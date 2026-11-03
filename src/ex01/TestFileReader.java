package ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	
	// 자바의 예외처리 필수 상황, 반드시 throws, try ~ catch 
	// 1. IO (입출력)
	// 2. Conversion
	public static void main(String[] args) throws IOException {
															// 마지막에 \\ 붙어야 경로가 됨 
		String 		   path    =  "D:\\woo\\java\\PrjIO\\src\\ex01\\";
		String   	filename   =  "bts.txt";  
		
		
		FileReader      fr      =  new FileReader(path + filename); //하나의 작은 돌멩이를 옮기는 느낌
		BufferedReader  br      =  new BufferedReader( fr ); 		// 돌멩이가 담긴 바구니를 옮기는 느낌 
		
		// 반복 갯수를 모르는 반복 : while() EOF : End of File 
		
		String        line     = "";
		
		
		
		while((line = br.readLine() ) !=null ) {
			System.out.println(line);
		}
		
		//line = br.readLine();     // while문은 이걸 반복 
		//System.out.println(line);
		
		fr.close();
		br.close();
		// for문은 횟수를 알고있을 때 쓴다. (어느 아이돌인지 알고 있을때)
		// 데이터가 아이브가 될 수 있고 블랙핑크가 될 수 있다 (알 수 없음) 
		
	}

}
