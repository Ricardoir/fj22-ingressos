package br.com.caelum.ingresso.model.descontos;
import java.math.BigDecimal;

public class DescontoParaEstudantes implements Desconto {
	
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOrignal) {
		return precoOrignal.divide(new BigDecimal("2.0"));
	}

	@Override
	public String getDescricao() {
		return "Desconto Estudante";
	}

}