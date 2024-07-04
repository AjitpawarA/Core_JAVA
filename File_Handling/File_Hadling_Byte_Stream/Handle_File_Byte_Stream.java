package File_Hadling_Byte_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Handle_File_Byte_Stream {
	public static void main(String[] args) throws ClassNotFoundException {

		try {
			File f = new File("C:\\Users\\ABC\\Desktop\\FILE_HANDELING\\byte1.txt");
			f.createNewFile();

			ArrayList<Student> students = new ArrayList();
			students.add(new Student("Ajit", 21, 98));
			students.add(new Student("Sandeep", 21, 8));
			students.add(new Student("Neha", 21, -8));
			students.add(new Student("rahul", 21, 8));

			// writing data to the file
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(students);

			System.out.println("Object written to the file sucessfully");
			out.close();
			
			
			//reading data from the file 
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);

			ArrayList<Student> s = (ArrayList<Student>) ois.readObject();
			System.out.println(s.toString());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

//		

	}
}
