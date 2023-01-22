package OdulToreni.repository;

import OdulToreni.entity.Film;
import OdulToreni.entity.Oyuncu;
import OdulToreni.utils.HibernateUtil;
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
