Feature: Login no sistema
Scenario: Login com credenciais válidas
Given o usuário informou o nome "admin"
And a senha "admin123"
When ele tenta fazer login
Then o login deve ser realizado com sucesso
Scenario: Login com credenciais inválidas
Given o usuário informou o nome "admin"
And a senha "senhaerrada"
When ele tenta fazer login
Then o login deve falhar