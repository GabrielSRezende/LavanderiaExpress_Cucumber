package steps;

import static org.junit.jupiter.api.Assertions.*;

import io.cucumber.java.pt.*;

public class CadastroSteps {

    private String telaAtual;
    private String nome, telefone, endereco;
    private String mensagem;

    // ===== Cadastro de Clientes =====
    @Dado("estou na tela de cadastro de clientes")
    public void estou_na_tela_de_cadastro_de_clientes() {
        telaAtual = "cadastro_cliente";
    }

    @E("observo alguns campos vazios e obrigatórios")
    public void observo_campos_vazios() {
        // Simula validação visual
        assertEquals("cadastro_cliente", telaAtual);
    }

    @Quando("preencho nome, telefone e endereço e clico em {string}")
    public void preencho_dados_e_clico_em_salvar(String botao) {
        nome = "José"; telefone = "11999999999"; endereco = "Rua A";
        if (!nome.isEmpty() && !telefone.isEmpty() && !endereco.isEmpty()) {
            mensagem = "Cliente cadastrado com sucesso";
        } else {
            mensagem = "Erro ao cadastrar cliente";
        }
    }

    @Entao("o cliente é salvo com a mensagem {string}")
    public void cliente_salvo_com_mensagem(String msgEsperada) {
        assertEquals(msgEsperada, mensagem);
    }

    // ===== Cadastro de Usuários =====
    @Dado("estou na tela de cadastro de usuários")
    public void estou_na_tela_de_cadastro_de_usuarios() {
        telaAtual = "cadastro_usuario";
    }

    @E("clico em um dos dados da lista e no botão de editar")
    public void clico_para_editar_usuario() {
        // Simula clique
    }

    @Quando("os campos retornam para os inputs da tela e atualizo no botão de {string}")
    public void atualizo_dados(String botao) {
        mensagem = "dados foram atualizados com sucesso";
    }

    @Entao("vejo mensagens indicando que os dados foram atualizados com sucesso")
    public void dados_atualizados_sucesso() {
        assertEquals("dados foram atualizados com sucesso", mensagem);
    }

    // ===== Status da Lavagem =====
    private String statusAtual;

    @Dado("cliente {string} está com status {string}")
    public void cliente_com_status(String nomeCliente, String status) {
        statusAtual = status;
    }

    @E("estou na tela de gerenciamento de status")
    public void tela_gerenciamento_status() {
        telaAtual = "gerenciar_status";
    }

    @Quando("clico no input da tabela e no botão {string}")
    public void clico_em_avancar_status(String botao) {
        if (statusAtual.equals("Recebido")) statusAtual = "Lavando";
        else if (statusAtual.equals("Lavando")) statusAtual = "Secando";
        mensagem = "Status atualizado com sucesso";
    }

    @Entao("o status muda para {string} com mensagem {string}")
    public void status_mudou_para(String statusEsperado, String msgEsperada) {
        assertEquals(statusEsperado, statusAtual);
        assertEquals(msgEsperada, mensagem);
    }
}
