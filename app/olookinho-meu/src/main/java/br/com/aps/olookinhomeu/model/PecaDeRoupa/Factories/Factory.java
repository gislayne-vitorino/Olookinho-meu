package br.com.aps.olookinhomeu.model.PecaDeRoupa.Factories;

import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupa;

public interface Factory {
    PecaDeRoupa createPecaDeRoupa(String nome, String tipo, long id); //funcionara como construtor da peca de roupa
}

    




