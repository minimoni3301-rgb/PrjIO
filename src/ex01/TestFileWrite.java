package ex01;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWrite {
											//파일은 모두 throws IOException 필요함
	public static void main(String[] args) throws IOException {
		
		String []  names      = {"RM","정국","슈가","뷔","제이홉","지민","진"};
		
		// 자바에서는 " " 안에 \를 한개만 넣으면 에러가 발생한다. 
		//            " " 안에 \  ->  \\ 
		// \t : tap,    \n : enter,   \r :enter,   \f: 프린터 용지 변경 (form feed)
		// 특수문자가 아니라, 경로로 표시하려면 "\"   ->   "\\"  or  "/" 로 쓰기 
		
		String     filename   = "D:\\woo\\java\\PrjIO\\src\\ex01\\bts.txt";
		// String     filename   = "D:/woo/java/PrjIO/src//ex01/bts.txt";
		
		// 위 두문장은 같은 결과가 나온다. (실제로 동작하는데 문제가 없음) 
		
		
		// 파일 생성 : open ~close 하면 새로운 파일이 생성된다.
		// 자바는 오픈명령을 new 할 때 실행한다. 
		
		FileWriter      fw     =    new  FileWriter(filename);
		
		
		for (int i = 0; i < names.length; i++) {
			fw.write( (i+1) + "." + names[i] + "\n");
		}
		
		
		fw.close(); 
		
		
		System.out.println(filename + "이 저장되었습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
