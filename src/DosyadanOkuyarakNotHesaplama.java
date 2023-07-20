import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DosyadanOkuyarakNotHesaplama {

	public static String harfnotuHesapla(String isim,int vize1,int vize2,int finalnot) {
		
		String cikti = "";
		double toplamNot = (vize1 * 3/10.0) + (vize2 * 3/10.0) + (finalnot * 4/10.0);
		
		if(toplamNot >= 90) {
			cikti = isim + " bu dersten AA aldı...";
		}
		else if (toplamNot >= 85) {
			cikti = isim + " bu dersten BA aldı...";
		}
		else if (toplamNot >= 80) {
			cikti = isim + " bu dersten BB aldı...";
		}
		else if (toplamNot >= 75) {
			cikti = isim + " bu dersten CB aldı...";
		}
		else if (toplamNot >= 70) {
			cikti = isim + " bu dersten CC aldı...";
		}
		else if (toplamNot >= 65) {
			cikti = isim + " bu dersten DC aldı...";
		}
		else if (toplamNot >= 60) {
			cikti = isim + " bu dersten DD aldı...";
		}
		else if (toplamNot >= 55) {
			cikti = isim + " bu dersten FD aldı...";
		}
		else {
			cikti = isim + " bu dersten FF aldı...";
		}
		return cikti;
	}
	
	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(new FileReader("notlar.txt"));
			FileWriter writer = new FileWriter("harfnotları.txt")){
			
			while(scanner.hasNextLine()) {
				String ogrenciBilgileri = scanner.nextLine();
				
				String[] ogrenciArray = ogrenciBilgileri.split(",");
				int vize1 = Integer.valueOf(ogrenciArray[1]); // Stringden int e dönüştürdük
				int vize2 = Integer.valueOf(ogrenciArray[2]);
				int finalnot = Integer.valueOf(ogrenciArray[3]);
				
				String cikti = harfnotuHesapla(ogrenciArray[0],vize1,vize2,finalnot);
				writer.write(cikti + "\n");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		
	}

}
