# Tipos de Laços de Repetição

1. **For**
2. **While**
3. **Do ... While**

## 1. For

O laço `for` é usado quando o número de repetições é conhecido. Ele geralmente é usado quando há um contador que começa com um valor inicial, é comparado com uma condição e é incrementado ou decrementado após cada iteração.

### Exemplo:

```java
public class Exemplo1_1 {

    public static void main(String[] args) {
        String nome;
        int contador;
        Scanner leia = new Scanner(System.in);

        for (contador = 1; contador < 4; contador++) {
            System.out.println("\nDigite o " + contador + "º nome: ");
            nome = leia.nextLine();
            System.out.println("O " + contador + "º nome é: " + nome);
        }
    }
}
```

# Tipos de Laços de Repetição

Existem três tipos principais de laços de repetição em Java: **For**, **While**, e **Do...While**. Cada um desses laços possui características específicas e pode ser usado em diferentes cenários.

## 2. While

O laço `while` é usado quando o número de repetições não é necessariamente conhecido e depende de uma condição. O laço continua a ser executado enquanto a condição for verdadeira.

### Exemplo:

```java
public static void main(String[] args) {
    String continua = "s";
    int numero1, numero2, resultado;
    Scanner leia = new Scanner(System.in);

    while (!continua.equals("n")) {
        System.out.println("Digite primeiro valor: ");
        numero1 = leia.nextInt();

        System.out.println("Digite segundo valor: ");
        numero2 = leia.nextInt();

        resultado = numero1 + numero2;

        System.out.println("O resultado da soma é: " + resultado);

        System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
        System.out.println("\nDeseja somar dois valores?");
        System.out.println("\nDigite s para sim OU digite n para não: ");
        continua = leia.next();
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
}
```

## 3. Do...While

O laço do...while é semelhante ao while, mas a diferença é que o código dentro do laço é executado pelo menos uma vez, pois a condição é verificada após a execução do bloco de código.

```java
public static void main(String[] args) {

    int numero, resultado, contador = 3;
    Scanner leia = new Scanner(System.in);

    do {
        System.out.println("\nDigite um número inteiro: ");
        numero = leia.nextInt();

        resultado = numero * 5;

        System.out.println("\nO resultado da multiplicação é: " + resultado);

    } while (contador <= 2);
}
```

