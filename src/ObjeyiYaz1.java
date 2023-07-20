import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz1 {

	public static void main(String[] args) {
		Ogrenci1 ogrenciler1 = new Ogrenci1("Diyar",12345 , "Yazılım Mühendisliği");
		Ogrenci1 ogrenciler2 = new Ogrenci1("Mirhas",12654 , "Bilgisayar Mühendisliği");
		Ogrenci1 ogrenciler3 = new Ogrenci1("Oğuz",12897 , "Bilgisayar Mühendisliği");
		
		Ogrenci1[] ogrenci_array = {ogrenciler1,ogrenciler2,ogrenciler3};
		ArrayList<Ogrenci1> ogrenci_list = new ArrayList<Ogrenci1>(Arrays.asList(ogrenci_array));
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Ogrenciler.bin"))){
			out.writeObject(ogrenci_array);
			out.writeObject(ogrenci_list);
			

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunmadı...");
		} catch (IOException e) {
			System.out.println("Dosya açılırken IOException oluştu...");
		}

	}

}
