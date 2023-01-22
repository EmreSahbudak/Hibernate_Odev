package odul_toreni_odul.OdulToreni.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Yonetmen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String yonetmenAdi;

    //bir yönetmenin birden fazla ödülü vardır
    //ama bir odul bir yönetmene verilir.
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "yonetmen")
    private List<Odul>  odulList;

    public Yonetmen(String yonetmenAdi) {
        this.yonetmenAdi = yonetmenAdi;
    }

    public Yonetmen(String yonetmenAdi, List<Odul> odulList) {
        this.yonetmenAdi = yonetmenAdi;
        this.odulList = odulList;
    }
}
