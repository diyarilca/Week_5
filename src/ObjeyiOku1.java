import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOku1 {

	public static void main(String[] args) {
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("Ogrenciler.bin"))){
				
				Ogrenci1[] ogrenci_array = (Ogrenci1[])in.readObject();
				ArrayList<Ogrenci1> ogrenci_list = (ArrayList<Ogrenci1>) in.readObject();
		
				System.out.println("******************************");
				for(Ogrenci1 o : ogrenci_array) {
					System.out.println(o);
					System.out.println("---------------------------");
				}
				System.out.println("******************************");
				for(Ogrenci1 o : ogrenci_list) {
					System.out.println(o);
					System.out.println("---------------------------");
				}
				System.out.println("******************************");
				
				
				} catch (FileNotFoundException e) {
					System.out.println("Dosya bulunamadı...");
				} catch (IOException e) {
					System.out.println("Dosya açılırken IOException oluştu...");
				} catch (ClassNotFoundException e) {
					System.out.println("Sınıf bulunamadı...");
				}
	}
}