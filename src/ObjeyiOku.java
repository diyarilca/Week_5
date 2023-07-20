import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {

	public static void main(String[] args) {
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("Ogrenci.bin"))){
				
				Ogrenci ogrenci1 = (Ogrenci)in.readObject(); // dosyayı okuduk
				Ogrenci ogrenci2 = (Ogrenci)in.readObject();
				
				System.out.println("************************");
				System.out.println(ogrenci1);
				System.out.println("************************");
				System.out.println(ogrenci2);
		
		
				} catch (FileNotFoundException e) {
					System.out.println("Dosya bulunamadı...");
				} catch (IOException e) {
					System.out.println("Dosya açılırken IOException oluştu...");
				} catch (ClassNotFoundException e) {
					System.out.println("Sınıf bulunamadı...");
				}

	}

}
