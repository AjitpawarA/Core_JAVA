package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class File_read_fileReader {
	public static void main(String[] args) throws Exception{
		File file= new File("C:\\\\Users\\\\ABC\\\\Desktop\\\\IO_operations\\\\demo4");
		File f = new File("C:\\Users\\ABC\\Desktop\\IO_operations\\demo3");
//		System.out.println(f.createNewFile());
		
		
		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter(file,true);
		
		int x =-1;
		while((x=fr.read())!=-1) {
			fw.write(x);
		}
		fw.flush();
//		fw.close();
		
		
		int y =-1;
		fw.write("this is new daa");
	fw.flush();
//	fw.close();
	}
}
