import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderMain {

	public static void main(String[] args) {
											// system.in yerine dosya adı
		try(Scanner scanner = new Scanner (new FileReader("ogrenciler.txt"))) {
			while(scanner.hasNextLine()) { // okuyacak satır kalana kadar
				System.out.println("Okunan satır: " + scanner.nextLine());
			} 
			
		}  catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı...");
		} catch (IOException e) {
			System.out.println("Dosya açılırken bir hata oluştu...");
		}
	}

}
