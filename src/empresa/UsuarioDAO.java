package empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private Connection conexao;

    public UsuarioDAO() {
        this.conexao = Conexao.conectar();
    }

    /**
     * Insere um novo usuário no banco de dados.
     */
    public void cadastrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.executeUpdate();
            System.out.println("Usuário cadastrado com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar usuário: " + e.getMessage());
        }
    }

    /**
     * Retorna todos os usuários do banco.
     */
    public List<Usuario> listarUsuarios() {
        String sql = "SELECT * FROM usuarios";
        List<Usuario> lista = new ArrayList<>();
        try (PreparedStatement ps = conexao.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Usuario u = new Usuario(
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("senha")
                );
                lista.add(u);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar usuários: " + e.getMessage());
        }
        return lista;
    }

    /**
     * Verifica as credenciais de login comparando com os dados do banco.
     */
    public boolean validarLogin(String nome, String senha) {
        String sql = "SELECT COUNT(*) FROM usuarios WHERE nome = ? AND senha = ?";
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, nome);
            ps.setString(2, senha);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao validar login: " + e.getMessage());
        }
        return false;
    }
}
