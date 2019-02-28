package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public class SemDesconto implements Desconto {
	
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOrignal) {
		return precoOrignal;
	}

	@Override
	public String getDescricao() {
		return "Normal";
	}

}
