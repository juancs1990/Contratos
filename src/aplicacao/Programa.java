package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import modelo.Contratos;
import modelo.Parcelas;
import servicos.PagamentoPaylPal;
import servicos.ServicoContrato;
import servicos.ServicoPagamento;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data do Contrato: ");
		Date data = sdf.parse (sc.next());
		System.out.print("Valor do Contrato: ");
		double valor = sc.nextDouble();
		System.out.print("Número de Parcelas: ");
		int parcelas = sc.nextInt();
		
		Contratos cnt = new Contratos(numero,data,valor);
		
		
		ServicoContrato contratoservico = new ServicoContrato(new PagamentoPaylPal());
		
		contratoservico.processarContrato(cnt, parcelas);
		System.out.println("Parcelamento"); 
		  for (Parcelas p : cnt.getParcelas()) {
			  System.out.println(p);
			   
		  }
		
	}

}
