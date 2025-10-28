# cadastro-de-alunos-java
Mini projeto em Java para cadastro de alunos (nome, idade e nota) com cálculo da média geral.

# 📘 Mini Projeto: Cadastro de Alunos (Java)

Este projeto foi desenvolvido como exercício prático para fixar os conceitos básicos de entrada de dados, arrays e estruturas condicionais em Java.

---

  🎯 Objetivo
Criar um programa que:
- Cadastre **nome**, **idade** e **nota** de 3 alunos;
- Armazene esses dados em **arrays**;
- Calcule a **média geral da turma**;
- Exiba mensagens personalizadas conforme o desempenho.

---

## 🧠 Tecnologias Utilizadas
- ☕ java version "24.0.2" 2025-07-15
- 💻 VS Code

---

 🧮 Exemplo de Execução

*** Cadastro do aluno 1 ****
Digite o seu nome: Patricia
Qual a sua idade? 20
Qual foi a sua nota? 8.5

*** Cadastro do aluno 2 ****
Digite o seu nome: Guilherme
Qual a sua idade? 21
Qual foi a sua nota? 7.0

*** Cadastro do aluno 3 ****
Digite o seu nome: Gabrielly
Qual a sua idade? 19
Qual foi a sua nota? 9.0

*** Lista de alunos ****
Nome: Ana | Idade: 20 | Nota: 8.5
Nome: Bruno | Idade: 21 | Nota: 7.0
Nome: Carla | Idade: 19 | Nota: 9.0

Média geral da turma: 8.17
Boa, estão em uma média ótima!


---

## 🧾 Código Principal

```java
import java.util.Scanner;

public class AprenderJava {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int i;
        double somaNotas = 0, media;

        String[] nome = new String[3];
        int[] idade = new int[3];
        double[] nota = new double[3];

        for (i = 0; i < 3; i++) {
            System.out.println("\n\t*** Cadastro do aluno " + (i + 1) + " ****");

            System.out.print("Digite o seu nome: ");
            nome[i] = obj.nextLine();

            System.out.print("Qual a sua idade? ");
            idade[i] = obj.nextInt();

            System.out.print("Qual foi a sua nota? ");
            nota[i] = obj.nextDouble();

            somaNotas += nota[i];
            obj.nextLine();
        }

        System.out.println("\n\t*** Lista de alunos ****");
        for (i = 0; i < 3; i++) {
            System.out.println("Nome: " + nome[i] + " | Idade: " + idade[i] + " | Nota: " + nota[i]);
        }

        media = somaNotas / 3;
        System.out.printf("\nMédia geral da turma: %.2f\n", media);

        if (media < 6) {
            System.out.println("**Média bem abaixo do esperado...**");
        } else if (media >= 6 && media < 8) {
            System.out.println("Boa, estão em uma média ótima!");
        } else {
            System.out.println("Me surpreenderam, parabéns!!!!");
        }

        obj.close();
    }
}

