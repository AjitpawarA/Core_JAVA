package File_Handling_new;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_handeling {
	public static void main(String[] args) throws IOException {
		
		
		File f = new File("C:\\Users\\ABC\\Desktop\\FILE_HANDELING\\file1.txt");
		System.out.println(f.createNewFile());
		
		
		// writing  to the file fpr character data
		FileWriter fw = new FileWriter(f,true);
		fw.write("Ajit Pawar");
		fw.write("Java defines two types of streams:\r\n-Byte streams provide a convenient means for handling input and output of bytes.\r ");
		fw.write("EXAMPLE : Use a byte stream ex : InputStream etc and type 'ᛞ'. This exceeds the 256 limit of 8-bit characters hence it will show some other");
		fw.flush();

		// reading from the file fpr character data
		FileReader fr = new FileReader(f);
		int x = 0;
		while((x=fr.read())!=-1) {
			System.out.print((char)x);
		}
	}
}
