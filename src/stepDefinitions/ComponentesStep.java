package stepDefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import utilitaria.Componentes;

public class ComponentesStep {
    Componentes componentes = new Componentes();

    @Dado("que o usuário acessou o arquivo Campo de Treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_Treinamento() {
        componentes.inicializarHtml();
    }

    @Quando("o usuário digitar Batatinha Batatinha")
    public void o_usuário_digitar_Batatinha_Batatinha() {
        componentes.testarTextField();
    }

    @Então("no campo textfield deve apresentar as palavras Batatinha Batatinha")
    public void o_usuário_digitar_a_palavra_Batatinha_Batatinha() {
        componentes.validarTextField();
    }

    @Quando("o usuário clicar no elemento rádio Button")
    public void o_usuário_clicar_no_elemento_rádio_Button() {
        componentes.testarRadioButton();
    }

    @Então("o elemento rádio button deve aparecer selecionado")
    public void o_elemento_rádio_button_deve_aparecer_selecionado() {
        componentes.validarRadioButton();
    }

    @Quando("o usuário clicar no elemento checkbox")
    public void o_usuário_clicar_no_elemento_checkbox() {
        componentes.testarCheckBox();
    }

    @Então("o elemento checkbox deve aparecer selecionado")
    public void o_elemento_check_box_deve_aparecer_selecionado() {
        componentes.validarCheckBox();
    }

}
