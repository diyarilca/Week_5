import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderMain2{

	public static void main(String[] args) {
											// system.in yerine dosya adı
		try(Scanner scanner = new Scanner (new FileReader("ogrenciler.txt"))) {
			while(scanner.hasNextLine()) { // okuyacak satır kalana kadar
				String ogrenci_bilgisi = scanner.nextLine();
				
				String[] array = ogrenci_bilgisi.split(",");
				
				if(array[1].equals("Yazılım Mühendisliği")) {
					System.out.println("Öğrenci Bilgisi: " + ogrenci_bilgisi);
				}
			} 
			
		}  catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı...");
		} catch (IOException e) {
			System.out.println("Dosya açılırken bir hata oluştu...");
		}
	}

}
