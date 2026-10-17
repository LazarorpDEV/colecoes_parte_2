import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColecoesParte2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        System.out.println("Digite os nomes e os sexos no formato Nome-M ou Nome-F.");
        System.out.println("Separe as pessoas por vírgula.");
        System.out.println("Exemplo: Lazaro-M, Ana-F, Gabriel-M, Maria-F");

        String entrada = scanner.nextLine();

        String[] pessoas = entrada.split(",");

        for (String pessoa : pessoas) {
            String[] dados = pessoa.trim().split("-", 2);

            if (dados.length != 2) {
                System.out.println("Formato inválido: " + pessoa.trim());
                continue;
            }

            String nome = dados[0].trim();
            String sexo = dados[1].trim();

            if (nome.isEmpty()) {
                System.out.println("Registro ignorado: nome vazio.");
                continue;
            }

            if (sexo.equalsIgnoreCase("M")) {
                grupoMasculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                grupoFeminino.add(nome);
            } else {
                System.out.println("Sexo inválido para " + nome + ". Use M ou F.");
            }
        }

        System.out.println("\nGrupo masculino:");
        for (String nome : grupoMasculino) {
            System.out.println("- " + nome);
        }

        System.out.println("\nGrupo feminino:");
        for (String nome : grupoFeminino) {
            System.out.println("- " + nome);
        }

        scanner.close();
    }
}