package viniciosromano.com.github;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LogCPFTeste {
	
	CodigoPessoaFisica cpf = new CodigoPessoaFisica();
	ValidadoraAcesso acesso = new ValidadoraAcesso();
	LogCPF log = new LogCPF();
	String cpfAcesso;
	
	@Before
	public void setupLog() {
		String[] cpfsAutorizados = {"40180553828"};
		acesso.setCpfsAutorizados(cpfsAutorizados);
	}

	@Test
	public void formataRetorno1() {
		cpfAcesso = cpf.removeCaracteresEspeciais("156.784.958-01");
		
		if(cpf.validaCPF(cpfAcesso))
			assertEquals(log.formataRetorno(acesso.permiteAcesso(cpfAcesso)), "Seu CPF � inv�lido para acesso ao sistema");
	}
	
	@Test
	public void formataRetorno2() {
		cpfAcesso = cpf.removeCaracteresEspeciais("401.805.538-28");
		
		if(cpf.validaCPF(cpfAcesso))
			assertEquals(log.formataRetorno(acesso.permiteAcesso(cpfAcesso)), "Seu CPF � v�lido para acesso ao sistema");
	
	}



}
