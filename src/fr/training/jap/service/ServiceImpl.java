package fr.training.jap.service;

import java.util.List;

import fr.training.jap.business.Person;
import fr.training.jap.dao.DaoImpl;
import fr.training.jap.dao.IDao;

public class ServiceImpl implements IService {
	
	private IDao dao = new DaoImpl();
	
	
	@Override
	public int addPerson(Person p) {
		// TODO Auto-generated method stub
		//return 0;
		return dao.addPerson(p);
	}


	@Override
	public List<Person> listAll() {
		// TODO Auto-generated method stub
		return dao.listAll();
	}

	
	@Override
	public int changePerson(Person p) {
		// TODO Auto-generated method stub
		return dao.changePerson(p);
	}


	@Override
	public void deletePerson(Person p) {
		// TODO Auto-generated method stub
		dao.deletePerson(p);
	}


	@Override
	public Person getPerson(int number) {
		// TODO Auto-generated method stub
		return dao.getPerson(number);
	}


}
