package viniciosromano.com.github;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ValidadoraAcessoTeste {
	
	CodigoPessoaFisica cpf = new CodigoPessoaFisica();
	ValidadoraAcesso acesso = new ValidadoraAcesso();
	String cpfAcesso;
	
	@Before
	public void setupAcesso() {
		String[] cpfsAutorizados = {"40180553828"};
		acesso.setCpfsAutorizados(cpfsAutorizados);
	}

	@Test
	public void permiteAcessoTeste1() {
		cpfAcesso = cpf.removeCaracteresEspeciais("156.784.958-01");
		
		if(cpf.validaCPF(cpfAcesso))
			assertEquals(acesso.permiteAcesso(cpfAcesso), false);
	}
	
	@Test
	public void permiteAcessoTeste2() {
		cpfAcesso = cpf.removeCaracteresEspeciais("401.805.538-28");
		
		if(cpf.validaCPF(cpfAcesso))
			assertEquals(acesso.permiteAcesso(cpfAcesso), true);
	}

}
