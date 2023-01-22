package odul_toreni_odul.OdulToreni.repository;

import odul_toreni_odul.OdulToreni.entity.Yonetmen;
import odul_toreni_odul.OdulToreni.utils.HibernateUtil;
import org.hibernate.Session;

public class YonetmenDao {
    public void save(Yonetmen yonetmen){
        Session session= HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.save(yonetmen);
            session.getTransaction().commit();
            System.out.println("Save Success yonetmenDao");
            session.close();
        }catch (Exception e){
            System.out.println(e.getMessage()+"HATA yonetmenDao SAVE");
        }
    }
}
