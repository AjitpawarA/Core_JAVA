package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentSerialization {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\ABC\\Desktop\\IO_operations\\text.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s = (Student)ois.readObject();
		System.out.println(s.name);
		System.out.println(s.gen);
	}
}
