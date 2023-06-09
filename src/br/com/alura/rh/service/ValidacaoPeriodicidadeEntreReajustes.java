package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste{
	
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		
	
	LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
	LocalDate dataAtual = LocalDate.now();
	long meseDeSeuUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
	if (meseDeSeuUltimoReajuste < 6) {
		throw new ValidacaoException("Intervalo de ser no minimo 6 meses!");
	}
	
	}

}
