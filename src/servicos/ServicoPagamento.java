package servicos;

public interface ServicoPagamento {
  public Double parcelasPagar(Double totalContrato , Integer numeroMeses, Integer parcela);
  public Double pagamentoSemJuros (Double totalContrato);
}
