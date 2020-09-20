package Treinando;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class CarrosTeste {
    public static void main(String[] args) {

        Carros c1 = new Carros ("Peugeot 207", 15900.80, "Peugeot", 5);
        Carros c2 = new Carros ("VW- VOYAGE", 22000.00, "Volkswagen", 5);
        Carros c3 = new Carros ("Doblo", 26000.90, "Fiat", 7);
        Carros c4 = new Carros ("Spin", 35000, "Chevrolet", 7);
        Carros c5 = new Carros ("Zafira", 30000, "Chevrolet", 7);
        Carros c6 = new Carros ("Kwid Life 1.0", 34990.00, "Renault", 5);
        Carros c7 = new Carros ("Mobi Easy", 36990, "Fiat", 5);
        Carros c8 = new Carros ("Gol 1.0", 50000, "Volkswagen", 5);
        Carros c9 = new Carros ("5008 Griffe 1.6", 221590, "Peugeot", 7);
        Carros c10 = new Carros ("Gran Livina", 25300, "Nissan", 7);
        Carros c11 = new Carros ("Carens 2.0 EX", 28950, "Kia", 7);


        List<Carros> carros = Arrays.asList (c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11);

        Predicate<Carros> valor = v -> v.preco <= 30000;
        Predicate<Carros> ocupacao = o -> o.lugares == 7;

        Function<Carros, String> carrosEscolhidos = c -> "Os carros que estão no seu orçamento são "
                + c.nome + " da marca " + c.marca + " e valor R$" + c.preco;

        carros.stream ().filter (valor).filter (ocupacao).map (carrosEscolhidos).forEach (System.out::println);





    }
}
