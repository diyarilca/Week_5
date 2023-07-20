import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain{
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("dosya.txt",true); // true yazılırsa dosya üstüne ekleme yapılır
														// yazılmazsa her seferinde silinir.baştan yazar	
			fos.write(65);
			fos.write(74);
			
			byte[] array = {101,75,66,68};
			fos.write(array);
			
			String a = "Diyar İlça";
			
			byte[] a_array = a.getBytes(); // yazıları byte dönüştürmek gerekiyor
			fos.write(a_array);
			
		} catch (FileNotFoundException e) {
				System.out.println("File Not Found Exception oluştu");
		} catch (IOException e) {
				System.out.println("Dosyaya yazılırken bir hata oluştu");
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println("Dosya kapatılırken bir hata oluştu");	
			}
		}
		
	}
}

