package servicos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import modelo.Contratos;
import modelo.Parcelas;



public class ServicoContrato {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
 
    private ServicoPagamento scv;
	
	 public void processarContrato(Contratos contract, int parcelas){
		 for (int i =1; i<=parcelas; i++) {
			 Date dataparcela = contract.getDataContrato();
			 double valorParcela =0;
	 
			 if (parcelas == 1) valorParcela = scv.pagamentoSemJuros(contract.getTotalContrato());
			 else valorParcela = scv.parcelasPagar(contract.getTotalContrato(), parcelas, i);
			 Parcelas p = new Parcelas (addMes(dataparcela,i),valorParcela);
			 contract.addParcela(p);
			 
		 }
		 
	 }
	 
	 public ServicoContrato(ServicoPagamento scv) {
		this.scv = scv;
	}

	public Date addMes(Date d, int i) {
		 Calendar c = Calendar.getInstance();
		 c.setTime(d);
		 c.add(Calendar.MONTH, i);
		 return c.getTime();
		 
	 }

}
