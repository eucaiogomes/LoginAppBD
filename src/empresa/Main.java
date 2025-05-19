package empresa;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioDAO dao = new UsuarioDAO();

        // 1) Cadastrar um novo usuário
        System.out.println("== Cadastro de Usuário ==");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();
        dao.cadastrarUsuario(new Usuario(nome, email, senha));

        // 2) Listar todos os usuários
        System.out.println("\n== Lista de Usuários ==");
        List<Usuario> usuarios = dao.listarUsuarios();
        for (Usuario u : usuarios) {
            System.out.printf("%s <%s>%n", u.getNome(), u.getEmail());
        }

        // 3) Efetuar login
        System.out.println("\n== Login ==");
        System.out.print("Digite o nome: ");
        String nomeLog = sc.nextLine();
        System.out.print("Digite sua senha: ");
        String senhaLog = sc.nextLine();

        if (dao.validarLogin(nomeLog, senhaLog)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Credenciais inválidas.");
        }

        sc.close();
    }
}
