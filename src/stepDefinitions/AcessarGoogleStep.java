package stepDefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import utilitaria.Componentes;

public class AcessarGoogleStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuário instanciou o chrome-driver")
    public void que_o_usuário_instanciou_o_chrome_driver() {
        // Write code here that turns the phrase above into concrete actions
        componentes.inicializar();
    }

    @Dado("que o usuário digitou o endereço do Google no navegador")
    public void que_o_usuário_digitou_o_endereço_do_Google_no_navegador() {
        componentes.acessarGoogle();
    }

    @Quando("clicar em Enter")
    public void clicar_em_Enter() {
        componentes.clicarEnter();
    }

//    @Então("a página do Google deve abrir")
//    public void a_página_do_Google_deve_abrir() {
//        componentes.pesquisarGoogle();
//        componentes.resultadoPesquisa();
//    }

    @Dado("que o usuário digitou SENAC Palhoça")
    public void que_o_usuário_digitou_SENAC_Palhoça() {
        componentes.pesquisarGoogle();
    }

    @Então("deve aparecer a lista de pesquisa com SENAC Palhoça")
    public void deve_aparecer_a_lista_de_pesquisa_com_SENAC_Palhoça() {
        componentes.resultadoPesquisa();
    }

}
