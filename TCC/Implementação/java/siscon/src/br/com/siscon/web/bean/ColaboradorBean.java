package br.com.siscon.web.bean;

import br.com.siscon.model.vo.ColaboradorVO;
import br.com.siscon.service.IService;
import br.com.siscon.service.impl.ServiceImpl;

public class ColaboradorBean {
	
	
	ColaboradorVO colaboradorVO;
	IService iService;

	public IService getiService() {
		if(this.iService == null){
			iService=new ServiceImpl();
		}
		return iService;
	}

	public void setiService(IService iService) {
		this.iService = iService;
	}

	public ColaboradorVO getColaboradorVO() {
		return colaboradorVO;
	}

	public void setColaboradorVO(ColaboradorVO colaboradorVO) {
		this.colaboradorVO = colaboradorVO;
	}
	
	
	public void salvar(String colaborador){
		getColaboradorVO().getDepartamento();
		
		getiService().findByMatricula(colaborador);
		
	}

}
