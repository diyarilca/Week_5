import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		
	
		try(FileWriter writer = new FileWriter("ornek2.txt")){//finally bloğunu yazmadan dosyanın kapanmasını sağlar
			Scanner scanner = new Scanner(System.in);
			String dil;
			
			while(true) {
				System.out.println("Bir dil giriniz: ");
				dil = scanner.nextLine();
				
				if(dil.equals("-1")) {
					System.out.println("Programdan çıkılıyor....");
					System.out.println("Dosyayı kontrol edin...");
					break;
				}
				writer.write(dil + "\n");
			}
			
		} catch (IOException e) {
			System.out.println("Dosya oluşturulurken hata oluştu...");
		}
	}
}
