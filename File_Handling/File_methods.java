package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File_methods {
	public static void main(String[] args) throws Exception{
		File f = new File("C:\\Users\\ABC\\Desktop\\IO_operations\\demo");
		System.out.println(f.createNewFile());
		
		
		// read data from file ----- file input stream
		FileInputStream fis = new FileInputStream(f);
		int x =0;
		while((x=fis.read())!=-1) {
			System.out.print((char)x);
		}
		System.out.println(" ");
		
		
		//write data to the file
		File f4 = new File("C:\\Users\\ABC\\Desktop\\IO_operations\\demo1");
		System.out.println(f4.createNewFile());
		FileOutputStream fos1 = new FileOutputStream(f4);
		int y =0;
		while((y=fis.read())!=-1) {
			fos1.write(x);
		}
		
//		//create only one folder
//		File f1 = new File("C:\\Users\\ABC\\Desktop\\IO_operations\\dire");
//		System.out.println(f1.mkdir());
//		
//		
//		
//		//creates multiple folders------folder inside folder
//		File f2 = new File("C:\\Users\\ABC\\Desktop\\IO_operations\\dire\\A\\B");
//		System.out.println(f2.mkdirs());
		
		
	}
}
