// src/test/java/steps/LoginStep.java
package steps;

import static org.junit.jupiter.api.Assertions.*;

import com.saojudas.sistemalavanderia.Autenticador;

import io.cucumber.java.pt.*;

public class LoginStep {

    private String usuario;
    private String senha;
    private boolean resultadoLogin;

    @Dado("o usuário informou o nome {string}")
    public void o_usuario_informou_o_nome(String nome) {
        this.usuario = nome;
    }

    @E("a senha {string}")
    public void a_senha(String senha) {
        this.senha = senha;
    }

    @Quando("ele tenta fazer login")
    public void ele_tenta_fazer_login() {
        Autenticador auth = new Autenticador();
        resultadoLogin = auth.autenticar(usuario, senha);
    }

    @Entao("o login deve ser realizado com sucesso")
    public void o_login_deve_ser_realizado_com_sucesso() {
        assertTrue(resultadoLogin);
    }

    @Entao("o login deve falhar")
    public void o_login_deve_falhar() {
        assertFalse(resultadoLogin);
    }
}
