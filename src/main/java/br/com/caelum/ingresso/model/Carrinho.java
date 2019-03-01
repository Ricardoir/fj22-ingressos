package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Carrinho {
	
	private List<Ingresso> ingressos = new ArrayList<>();
	
	public void add(Ingresso ingresso) {
		ingressos.add(ingresso);
	}

	public List<Ingresso> getIngresso() {
		return ingressos;
	}

	public void setIngresso(List<Ingresso> ingresso) {
		this.ingressos = ingresso;
	}
	
	public boolean isSelecionado(Lugar lugar) {
		
		return ingressos.stream().map(Ingresso::getLugar).anyMatch(l -> l.equals(lugar));
	}
	
	public BigDecimal getTotal( ) {
		return ingressos.parallelStream().map(Ingresso::getPreco).reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
	}
	
	
	public Compra toCompra() {
		
		return new Compra(ingressos);
	}
	

}
