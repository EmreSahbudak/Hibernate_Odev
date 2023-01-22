package odul_toreni_odul.OdulToreni.utils;

import odul_toreni_odul.OdulToreni.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        try{
            if (sessionFactory==null){
                Configuration cfg=new Configuration();
                cfg.addAnnotatedClass(Film.class);
                cfg.addAnnotatedClass(Kategori.class);
                cfg.addAnnotatedClass(Odul.class);
                cfg.addAnnotatedClass(Oyuncu.class);
                cfg.addAnnotatedClass(Yonetmen.class);
                sessionFactory=cfg.configure("hibernate.cfg.xml").buildSessionFactory();
                System.out.println("Success DB Connection");
            }
        }catch (Exception e){
            System.out.println(e.getMessage()+"HATA! HibernateUtil");
        }
        return sessionFactory;
    }
}
