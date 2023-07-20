import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {

	public static void main(String[] args) {
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Ogrenci.bin"))){
			
			Ogrenci ogrenci1 = new Ogrenci("Diyar",12345 , "Yazılım Mühendisliği");
			Ogrenci ogrenci2 = new Ogrenci("Mirhas",12654 , "Finans");
			
			out.writeObject(ogrenci1); // dosyaları yazdırdık ---> Ogrenci.bin adlı dosyaya
			out.writeObject(ogrenci2);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunmadı...");
		} catch (IOException e) {
			System.out.println("Dosya açılırken IOException oluştu...");
		}

	}

}
