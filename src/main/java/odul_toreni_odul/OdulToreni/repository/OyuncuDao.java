package odul_toreni_odul.OdulToreni.repository;

import odul_toreni_odul.OdulToreni.entity.Oyuncu;
import odul_toreni_odul.OdulToreni.utils.HibernateUtil;
import org.hibernate.Session;

public class OyuncuDao {
    public void save(Oyuncu oyuncu){
        Session session= HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.save(oyuncu);
            session.getTransaction().commit();
            System.out.println("Save Success OyuncuDao");
            session.close();
        }catch (Exception e){
            System.out.println(e.getMessage()+"HATA OyuncuDao SAVE");
        }
    }
}
