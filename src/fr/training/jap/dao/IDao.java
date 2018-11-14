package fr.training.jap.dao;

import java.sql.Connection;
import java.util.List;

import fr.training.jap.business.Person;

public interface IDao {

	public int addPerson(Person p);
	public Person getPerson(int number);
	public List<Person> listAll();
	public int changePerson(Person p);
	public void deletePerson(Person p);
}
