Feature: Cadastro de Clientes
Scenario: Realizar o cadastro com dados válidos
Given estou na tela de cadastro de clientes
And observo alguns campos vazios e obrigatórios
When preencho nome, telefone e endereço e clico em "Salvar"
Then o cliente é salvo com a mensagem "Cliente cadastrado com sucesso"