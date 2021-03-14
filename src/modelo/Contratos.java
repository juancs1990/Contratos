package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contratos {
	private Integer numeroContrato;
	private Date dataContrato;
	private Double totalContrato;
	private List parcelas = new ArrayList<Parcelas>();


 

	public Contratos(Integer numeroContrato, Date dataContrato, Double totalContrato) {

		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.totalContrato = totalContrato;
	 
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getTotalContrato() {
		return totalContrato;
	}

	public void setTotalContrato(Double totalContrato) {
		this.totalContrato = totalContrato;
	}
	
	public void addParcela (Parcelas p) {
		parcelas.add(p);
		
	}
	
	public void removerParcela (Parcelas p) {
		parcelas.add(p);
		
	}
	
	public List <Parcelas> getParcelas() {
		return parcelas;
	}



}
