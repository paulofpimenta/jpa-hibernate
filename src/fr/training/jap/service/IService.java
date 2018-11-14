package fr.training.jap.service;

import java.util.List;

import fr.training.jap.business.Person;

public interface IService {
	
	public int addPerson(Person p);
	
	public List<Person> listAll();

	public int changePerson(Person p);
	
	public void deletePerson(Person p);
	public Person getPerson(int number);

}
