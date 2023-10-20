package exceptionlatest;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File a=new File("C:\\Users\\jana\\Desktop\\jana.txt");
		FileReader b=new FileReader(a);
		int temp=0;
		while((temp=b.read())!=-1) {
			System.out.print((char)(temp));
			System.out.println("changed");
		}
	}

}
