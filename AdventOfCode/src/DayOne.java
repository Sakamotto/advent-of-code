import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DayOne {

    public static void main(String[] args) {
        System.out.println("coletando informações ... \n");
        List<String> values = getLines("D:\\DevCristian\\Java\\AdventOfCode\\day1\\day1-input.txt");
        double soma = 0;

        for (int i = 0; i < values.size(); i++) {
            soma += calculateFuel(Integer.parseInt(values.get(i)));
        }

        System.out.println("Sum of the fuel requirements is " + soma);
    }

    public static double calculateFuel(int mass) {
        return Math.floor(mass / 3.0) - 2;
    }

    public static List<String> getLines(String path) {
        List<String> resultado = new ArrayList<>();

        try {
            Stream<String> lines = Files.lines(Paths.get(path));
            resultado = lines.collect(Collectors.toList());

        } catch (IOException e) {
            System.out.println("Erro ao obter linhas do arquivo: " + e.getMessage());
        }

        return resultado;
    }
}
