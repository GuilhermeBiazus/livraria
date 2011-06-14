package br.com.siscon.model.vo;

import br.com.siscon.model.enitity.Colaborador;
import br.com.siscon.model.enitity.Departamento;
import br.com.siscon.model.enitity.Vendas;

public class ColaboradorVO {
	
	private Colaborador colaborador;
	
	private Vendas vendas;
	
	private Departamento departamento;

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Vendas getVendas() {
		return vendas;
	}

	public void setVendas(Vendas vendas) {
		this.vendas = vendas;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
	
}
