package fr.training.jap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.training.jap.business.Person;

public class DaoImpl implements IDao {
	
	EntityManagerFactory  emf = Persistence.createEntityManagerFactory("person-jee");
	
	@Override
	public int addPerson(Person p) {
		EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(p);
        et.commit();
        em.close();
		return 1;
	}

	@Override
	public Person getPerson(int number) {
		EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Person p = em.find(Person.class, number);
        et.commit();
        em.close();
       return p;
	}

	@Override
	public List<Person> listAll() {
		EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Query query = em.createQuery("SELECT p from Person p");
        List<Person> personAll = query.getResultList();
		return personAll;
	}


	@Override
	public int changePerson(Person p) {
		EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(p);
		et.commit();
		em.close();
		return 1;
	}

	@Override
	public void deletePerson(Person p) {
		EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Person personToDelete = em.find(Person.class, p.getId());
		em.remove(personToDelete);
		et.commit();
		em.close();


	}

}
