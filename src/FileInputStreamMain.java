import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamMain {
	public static void main(String[] args ) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("dyr1.txt");
			
			int deger;
			String s ="";
			
			int say = 0; 
			fis.skip(5); // Belirli bir yerden başlayıp belirli bir karakter kadara okuma yapmamızı sağlar.
			
			while((deger = fis.read()) != -1) {
				say += (char) deger;
				say++;
				
				if(say == 10) {
					break;
				}
			}
			System.out.println("Dosyanın 5.yerinden itibaren 10 karakter: ");
			
			/* while((deger = fis.read()) != -1) { // dosyadaki tüm karakterleri okumamızı sağlar
				s += (char) deger;
			}
			System.out.println("Dosya İçeriği: " + s); */
			// -----------------------------------------------
			
			/*fis.skip(5); // belirli karakterden sonra okuma yapmamızı sağlar
			System.out.println("İlk karakter: " +(char)(fis.read()));
			System.out.println("İkinci karakter: " +(char)(fis.read()));*/
			//--------------------------------------------------
			
			/*System.out.println("Birinci Karakter: " +(char)(fis.read())); //en baştan okuma yapmamızı sağlar
			System.out.println("İkinci Karakter: " +(char)(fis.read()));
			System.out.println("Üçüncü Karakter: " +(char)(fis.read())); */
			
		} catch (Exception e) {
			System.out.println("File bulunamadı");
		}
		
		finally {
			try {
				if(fis != null) {
					
					fis.close();
				}
			} catch (IOException e) {
				System.out.println("Dosya kapatılırken bir hata oluştu...");
			}
		}
		
	}

}
