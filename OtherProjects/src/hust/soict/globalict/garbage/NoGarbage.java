package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) throws IOException {
		String filename="D:\\oop2\\OOP\\OtherProjects\\src\\hust\\soict\\globalict\\garbage\\garbage.exe";
		byte[] inputBytes= {0};
		long startTime,endTime;
		
		try {
			inputBytes=Files.readAllBytes(Paths.get(filename));
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
		startTime=System.currentTimeMillis();
		StringBuilder outputStringBuilder=new StringBuilder();
		
		for(byte b: inputBytes) {
			outputStringBuilder.append((char)b);
		}
		endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
}
