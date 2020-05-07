package projetoCarreto;

public class LoginCliente {
	private String nome;
	private String sobrenome;
	private int telefone;
	private String estado;
	private String cidade;
	private String senha;
	
	//Método para validar o nome e sobrenome quando informado no cadastro
	public boolean validar_nome_sobrenome(String nome) {
		String nome_validar = nome;
		if(nome.length() >= 2 && nome.length() <= 20 && Character.isAlphabetic(nome_validar.charAt(0)) && Character.isAlphabetic(nome_validar.charAt(nome_validar.length()))) {
			return true;
		}else{
			return false;
		}
	}
	
	//Validar número de telefone/celular com ou sem o 9 
	public boolean validar_telefone(String numero) {
        return numero.matches(".((10)|([1-9][1-9]).)\\s9?[6-9][0-9]{3}-[0-9]{4}") ||
        		numero.matches(".((10)|([1-9][1-9]).)\\s[2-5][0-9]{3}-[0-9]{4}");
    }
	
	//Verifica se a senha é maior ou igual a 8 caracteres para ser mais seguro
	public String validar_senha(String senha) {
		if(senha.length() >= 8) {
			return "Senha aceitável";
		}else {
			return "Senha inválida, a senha deve ter no mínimo 8 caracteres.";
		}
	}
	
	//Validação de encontrar o estado corretamente
	public boolean validar_estado(String estado){
		String[] estados = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO"};
		boolean confirmacao = false;
		
		for (int i = 0; i < estados.length; i++) {
			if(estado == estados[i]) {
				confirmacao = true;
			}
		}
		
		return confirmacao;
	}
	
	//Verifica se a cidade é válida
	public boolean validar_cidade(String cidade) {
		if(cidade != "") {
			return true;
		}else {
			return false;
		}
	}
	
	//Getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
