package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDriver {
	public static void main(String[] args) throws Exception {
		Student s = new Student("Ajit", "MAle");
		File f = new File("C:\\Users\\ABC\\Desktop\\IO_operations\\text.txt");
		FileOutputStream fos = new FileOutputStream(f);
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(s);
	}
}
