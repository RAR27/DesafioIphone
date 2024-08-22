package Interface;

import Entidade.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.ligar("4002-8922");
        iphone.atender();
        iphone.iniciarVozCorreio();

        iphone.selecionarMusica();
        iphone.tocar("Silvio Santos (Meu coração é Corinthiano)");
        iphone.pausar();

        iphone.mostrarGuia();
        iphone.adicionarGuia();
        iphone.atualizarGuia();

    }
}