package odul_toreni_odul.OdulToreni.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Kategori {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String kategoriAdi;

    public Kategori(Integer id, String kategoriAdi) {
        this.id = id;
        this.kategoriAdi = kategoriAdi;
    }

    public Kategori(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }

}
