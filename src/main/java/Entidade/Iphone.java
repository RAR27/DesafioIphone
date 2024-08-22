package Entidade;

import Interface.AparelhoTelefonico;
import Interface.NavegadorInternet;
import Interface.ReprodutorMidia;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMidia {

    @Override
    public void ligar (String cell) {
        System.out.println("Ligando para " + cell);
    }

    @Override
    public void atender() {
        System.out.println("Ligação Recusada");
    }

    @Override
    public void iniciarVozCorreio() {
        System.out.println("Reproduzir correio de voz");
    }

    @Override
    public void mostrarGuia() {
        System.out.println("Exibir Guia");
    }

    @Override
    public void adicionarGuia() {
        System.out.println("Nova Guia");
    }

    @Override
    public void atualizarGuia() {
        System.out.println("Guia Atualizada");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Reproduzindo: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica Selecionada!");
    }
}
