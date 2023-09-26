package functional_interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
                .limit(3)
                .toList();

        listaSaudacoes.forEach(System.out::println);

    }
}
