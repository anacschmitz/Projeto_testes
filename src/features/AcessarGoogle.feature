#language: pt
  Funcionalidade: Acessar Google

    Contexto:
      Dado que o usuário instanciou o chrome-driver

      @basico
      Cenário: Acessar Google
        Dado que o usuário digitou o endereço do Google no navegador
        E que o usuário digitou SENAC Palhoça
        Quando clicar em Enter
        Então deve aparecer a lista de pesquisa com SENAC Palhoça