package Treinando;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PapelariaTeste {
    public static void main(String[] args) {


        Papelaria p1 = new Papelaria ("Lápis", 2.90, true);
        Papelaria p2 = new Papelaria ("Caneta", 3.98, true);
        Papelaria p3 = new Papelaria ("Livro: Pequeno Príncipe", 35.60, false);
        Papelaria p4 = new Papelaria ("Apontador", 5.70, true);
        Papelaria p5 = new Papelaria ("Borracha", 3.79, true);
        Papelaria p6 = new Papelaria ("Caneta nanquim", 10.90, true);
        Papelaria p7 = new Papelaria ("Esquadros", 1.10, true);
        Papelaria p8 = new Papelaria ("Compasso", 9.98, true);
        Papelaria p9 = new Papelaria ("Tinta guache", 9.60, false);
        Papelaria p10 = new Papelaria ("Lapis de cor", 23.50, true);
        Papelaria p11 = new Papelaria ("Tesoura", 7.30, true);
        Papelaria p12 = new Papelaria ("Regua", 0.90, false);

        List<Papelaria> papelaria = Arrays.asList (p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);

        Predicate<Papelaria> valor = v -> v.preco <= 10;
        Predicate<Papelaria> necessario = n -> n.estaNaLista == true;
        Function<Papelaria, String> listaEscolar = a -> "Os objetos " + a.objeto + ", de valor R$"
                + a.preco + " estão na lista e já foram comprados.";


        papelaria.stream ().filter (valor).filter (necessario).map (listaEscolar).forEach (System.out::println);
    }
}
