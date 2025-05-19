	package empresa;
	
	import java.util.Scanner;
	
	public class Usuario {
		private String nome;
		private String email;
		private String senha;
		
		  public static boolean verifyCredentials(String username, String password) {
			    // Aqui você pode verificar as credenciais do usuário
			    // contra um banco de dados, um arquivo de configuração
			    // ou qualquer outra fonte de informação
			    return "nomequetanobanco".equals(username) && "senhaquetanobanco".equals(password);
			  }
		
		
		
		
		
		
		
		
		public Usuario() {
			
		}
		
		public Usuario(String nome, String email, String senha) {
			super();
			this.nome = nome;
			this.email = email;
			this.senha = senha;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		
		
		
		
	
	}
