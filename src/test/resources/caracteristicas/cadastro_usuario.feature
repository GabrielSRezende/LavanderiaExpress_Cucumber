Feature: Cadastro de Usuários
Scenario: Cadastro com dados válidos - editar usuário
Given estou na tela de cadastro de usuários
And clico em um dos dados da lista e no botão de editar
When os campos retornam para os inputs da tela e atualizo no botão de "Adicionar"
Then vejo mensagens indicando que os dados foram atualizados com sucesso