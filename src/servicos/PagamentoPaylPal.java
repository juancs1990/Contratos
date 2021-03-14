package servicos;

public class PagamentoPaylPal implements ServicoPagamento {
	
	@Override
	public Double parcelasPagar(Double totalContrato , Integer numeroMeses, Integer parcela) {
		 
		double montante=0;
	    double parcelaContrato=totalContrato/numeroMeses;
		montante = parcelaContrato + (parcelaContrato*0.01*parcela) ;
		montante+=montante*0.02;
		return montante;
			
		
	}
	@Override
	public Double pagamentoSemJuros (Double totalContrato) {
		return totalContrato*0.02;
	}

  
}
