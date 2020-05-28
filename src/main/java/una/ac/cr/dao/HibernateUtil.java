package una.ac.cr.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import una.ac.cr.exception.DAOException;
import una.ac.cr.model.DoctorOffice;
import una.ac.cr.model.Patient;

import java.util.Properties;

/**
 * Class utils for connetion to the database using Hibernate
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() throws DAOException {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                // Hibernate settings equivalent to hibernate.cfg.xml's properties
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://127.0.0.1:3306/proyecto-dao");
                settings.put(Environment.USER, "proyecto-dao");
                settings.put(Environment.PASS, "1234$una");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
                settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                settings.put(Environment.HBM2DDL_AUTO, "none");
                // IMPORTANT HBM2DDL_AUTO +++++++++++++
                // validate: validate the schema, makes no changes to the database.
                // update: update the schema.
                // create: creates the schema, destroying previous data.
                // create-drop: drop the schema when the SessionFactory is closed explicitly, typically when the application is stopped.
                // none: does nothing with the schema, makes no changes to the database
                configuration.setProperties(settings);
                configuration.addAnnotatedClass(Patient.class);
                configuration.addAnnotatedClass(DoctorOffice.class);
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (HibernateException hibernateEx) {
                throw new DAOException("Error con la base de datos", hibernateEx.getCause());
            }

        }
        return sessionFactory;
    }
}
