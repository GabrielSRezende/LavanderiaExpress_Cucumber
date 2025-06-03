Feature: Gerenciar Status da Lavagem
Scenario: Avançar status da lavagem do cliente João
Given cliente "João" está com status "Recebido"
And estou na tela de gerenciamento de status
When clico no input da tabela e no botão "Avançar status"
Then o status muda para "Lavando" com mensagem "Status atualizado com sucesso"