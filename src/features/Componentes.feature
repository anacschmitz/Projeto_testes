#language: pt

Funcionalidade: Acessar vários componentes html

  Contexto:
    Dado que o usuário acessou o arquivo Campo de Treinamento

#    Cenário: Validar campo textfield
#      Quando o usuário digitar a palavra Batatinha
#      Então no campo textfield deve apresentar as palavras Batatinha
#
#    Cenário: Validar campo textfield
#      Quando o usuário digitar Batatinha Batatinha
#      Então no campo textfield deve apresentar as palavras Batatinha Batatinha

#  @validar_campo_textfield_textarea
#  Esquema do Cenário: Validar campo textfield e textarea
#    Quando o usuario digitar <campo>
#    Então no campo <componentes> deve apresentar a palavra <resultado>
#    Exemplos:
#      | campo               | componente | resultado           |
#      | Batatinha           | textfield  | Batatinha           |
#      | Batatinha batatinha | textarea   | Batatinha batatinha |

#    @validar_elemento_radio_button
#    Cenario: Validar elemento Radio Button
#      Quando o usuário clicar no elemento rádio Button
#      Então o elemento rádio button deve aparecer selecionado
#
#    @validar_elemento_checkbox
#    Cenario: Validar elemento checkbox
#      Quando o usuário clicar no elemento checkbox
#      Então o elemento checkbox deve aparecer selecionado

  @validar_elemento_radio_button
  Esquema do Cenário: Validar elemento
    Quando o usuário clicar no elemento <elemento>
    Então o elemento <elemento> deve aparecer <resultado>
    Exemplos:
      | elemento         |
      | checkbox         |
      | rádio Button     |


