package br.com.caelum.ingresso.model.descontos;
import java.math.BigDecimal;

public class DescontoParaBancos implements Desconto{
	
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOrignal) {
		return precoOrignal.subtract(trintaPorCentoSobre(precoOrignal));
	}
	
	private BigDecimal trintaPorCentoSobre(BigDecimal precoOriginal) {
		return precoOriginal.multiply(new BigDecimal("0.3"));
	}

}
