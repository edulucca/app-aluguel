package br.edu.infnet;

import br.edu.infnet.modelo.entidade.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager manager = emf.createEntityManager();

        manager.getTransaction().begin();

        Cliente cliente = new Cliente("Eduardo de Lucca", "666.666.666-66", "61998607406", true);

        manager.persist(cliente);
        manager.getTransaction().commit();
    }
}
