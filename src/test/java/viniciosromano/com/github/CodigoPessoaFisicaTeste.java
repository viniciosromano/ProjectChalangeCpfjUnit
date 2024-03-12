package viniciosromano.com.github;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;


public class CodigoPessoaFisicaTeste {

	CodigoPessoaFisica cpf = new CodigoPessoaFisica();
	
	@Test
	public void testeValidaCpfGustavo() {
		assertEquals(cpf.validaCPF("401.805.538-28"), true);
	}
	
	@Test
	public void testeValidaCpfFalso() {
		assertEquals(cpf.validaCPF("111.111.111-11"), false);
	}
	
	@Test
	public void testeRemoveCaracterEspecial() {
		assertEquals(cpf.removeCaracteresEspeciais("111.111.111-11"), "11111111111");
	}

}
