import java.io.Serializable;

public class Ogrenci2 implements Serializable {
	
	private static final long serialVersiounUID = 1000; //güvenlik açısından değişiklik yapıldığında uyarı için 
	
	private String isim;
	private transient int id; // böyle yazarak serileştirme işleminin dışında bırakabiliriz
	private String bolum;
	
	public Ogrenci2(String isim, int id, String bolum) {

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