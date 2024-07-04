package File_Handling_new;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Handle {
	public static void main(String[] args){
		File f = new File("C:\\Users\\ABC\\Desktop\\FILE_HANDELING\\file1.txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			System.out.println("Can not create file please check");
			e.printStackTrace();
		}
		
		try {
			FileWriter fw = new FileWriter(f);
			fw.write("This is new File ....");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println("Can not write t this file");
			e.printStackTrace();
		}
		finally {
			
		}
		
		try {
			FileReader fr = new FileReader(f);
			int x = 0;
			try {
				while((x=fr.read())!=-1) {
					System.out.print((char)x);
				}
				System.out.println(" ");
			} catch (IOException e) {
				System.out.println("File can not red...");
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("canexecute :"+f.canExecute());
		System.out.println("canRead: "+f.canRead());
		System.out.println("canWrite: "+f.canWrite());
		System.out.println("exists: "+f.exists());
		System.out.println("getAbsolutePath: "+f.getAbsolutePath());
		System.out.println("getFreeSpace: "+f.getFreeSpace());
		System.out.println("getName: "+f.getName());
		System.out.println("getParent: "+f.getParent());
		System.out.println("getPath "+f.getPath());
		System.out.println("getParentFile: "+f.getParentFile());	
		
		
		try {
			System.out.println("getCanonicalPath: "+f.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println("delete: "+f.delete());
		
		
		
	}
}
