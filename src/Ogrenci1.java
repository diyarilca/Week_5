import java.io.Serializable;

public class Ogrenci1 implements Serializable {
	
	private static final long serialVersiounUID = 1000; //güvenlik açısından değişiklik yapıldığında uyarı için 
	
	private String isim;
	private int id;
	private String bolum;
	
	public Ogrenci1(String isim, int id, String bolum) {

		this.isim = isim;
		this.id = id;
		this.bolum = bolum;
	}

	@Override
	public String toString() {
		String bilgiler = "Öğrenci İsmi: " + isim + 
							"\nÖğrenci Numarası: " + id +
							"\nÖğrenci Bölüm: " + bolum;
		
		return bilgiler;
	}

}
