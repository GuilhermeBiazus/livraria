package br.com.siscon.service.impl;

import br.com.siscon.persistence.DaoImpl;
import br.com.siscon.persistence.dao.IDao;
import br.com.siscon.service.IService;


public class ServiceImpl implements IService{

	public String find() {
		// TODO Auto-generated method stub
		return null;
	}

	public String findByMatricula(String matricula) {
		IDao iDao = new DaoImpl();
		iDao.findByMatricula(matricula);
		return null;
	}

	public String findByNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}
}
