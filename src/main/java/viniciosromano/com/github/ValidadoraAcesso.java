package viniciosromano.com.github;

import java.util.List;

public class ValidadoraAcesso {

	private String[] cpfsAutorizados;
	
	public String[] getCpfsAutorizados() {
		return cpfsAutorizados;
	}

	public void setCpfsAutorizados(String[] cpfsAutorizados) {
		this.cpfsAutorizados = cpfsAutorizados;
	}

	public boolean permiteAcesso(String cpf) {
		
		for (String cpfAutorizado : cpfsAutorizados) {
			if(cpf.equalsIgnoreCase(cpfAutorizado))
				return true;
		}
		
		return false;
		
	}
	
}
