package testeEfraim;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

ArrayList<Pessoa> pessoas = new ArrayList<>();
Scanner scanPessoa = new Scanner(System.in);
Scanner scanString = new Scanner(System.in);
boolean continuar = true;

do {
System.out.println("Você quer inserir mais uma pessoa? Digite qualquer coisa para continuar ou 'N' para parar: ");
String querContinuar = scanString.nextLine();

if (!querContinuar.equalsIgnoreCase("N")) {
System.out.print("Insira o nome da pessoa: ");
String nome = scanString.nextLine();

System.out.print("Insira a idade da pessoa: ");
int idade;
try {
idade = Integer.parseInt(scanString.nextLine());
} catch (NumberFormatException e) {
System.out.println("Idade inválida. Insira um número válido.");
continue;
}

System.out.print("Insira o sexo da pessoa: ");
String sexo = scanString.nextLine();

Pessoa novaPessoa = new Pessoa(nome, idade, sexo);
pessoas.add(novaPessoa);
} else {
continuar = false;
}
} while (continuar);

scanPessoa.close();
scanString.close();

System.out.println("\nPessoas cadastradas:");
for (Pessoa p : pessoas) {
System.out.println(p);
}
}
}