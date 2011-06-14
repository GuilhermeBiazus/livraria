package br.com.siscon.persistence.dao;

public interface IDao {
	
	public String find();
	public String findByNome(String nome);
	public String findByMatricula(String matricula);
}
