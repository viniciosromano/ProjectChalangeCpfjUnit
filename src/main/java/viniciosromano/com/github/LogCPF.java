package viniciosromano.com.github;

public class LogCPF {

	public String formataRetorno(boolean cpfValido) {
		if (cpfValido)
			return "Seu CPF � v�lido para acesso ao sistema";
		else
			return "Seu CPF � inv�lido para acesso ao sistema";
	}

}
