import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {

	public static void main(String[] args) {
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter("ornek.txt",true); // true: kaldığımız yerden devam etmemizi sağlar
			
			writer.write("Diyar İlça\n");
			writer.write("Mirhas İlça\n");
			writer.write("Mesut İlça\n");
			
		} catch (IOException e) {
			System.out.println("Dosya açılırken IOEXception oluştu...");
		}
		finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken bir hata oluştu");
				}
			}
		}
		
	}

}
