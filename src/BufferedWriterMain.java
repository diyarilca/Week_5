import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMain {

	public static void main(String[] args) {
																			// dosyanın sonuna yazmamızı sağlar
		try(BufferedWriter writer = new BufferedWriter (new FileWriter("ogrenciler.txt",true))){
			writer.write("Ali Ozan,İnşaat Mühendisliği\n");
			
		} catch (IOException e) {
			System.out.println("Dosya açılırken hata oluştu");
		}

	}

}
