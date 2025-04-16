# Laços Condicionais 

<h2>1. Tipos de Laços Condicionais</h2>

1. **Estrutura IF**
2. **Estrutura IF / ELSE**
3. **Estrutura SWITCH CASE**

## 🔑**Pontos chave:**


1. O **laço condicional** ou **fluxo de controle** é um recurso essencial na programação, pois permite que os programas tomem decisões com base em condições pré-definidas, tornando a lógica do código mais flexível.
2. O **controle** e o **fluxo** de execução do programa podem ser gerenciados por meio das instruções **`if-else`** ou **`switch`**, que determinam quais ações devem ser realizadas dependendo do valor das condições.
3. Dependendo das **condições** definidas no fluxo de controle, o programa pode gerar **resultados diferentes**, adaptando-se a várias situações.
4. Quando as condições são **numerosas**, é mais indicado utilizar a instrução **`switch`**, pois ela pode tornar o código mais organizado e legível em comparação ao uso de múltiplas instruções **`if-else`**.
5. Você pode **aninha**r condições dentro de um bloco lógico, o que permite verificar várias condições de forma hierárquica e mais organizada.
6. Embora não seja obrigatório, é **aconselhável** incluir um **caso padrão** (usando a cláusula **`default`**) em uma instrução **`switch`**. Isso garante que, caso nenhuma das condições especificadas seja atendida, uma ação padrão seja executada.

<br />

<h1>Classe String</h1>

Cadeias de caracteres ou Strings são objetos, ou seja, instâncias da classe String do pacote java.lang e assim como a classe Math, existem vários métodos para manipularmos Strings.

| Método                                        | Descrição                                                    | Exemplo                                                      |
| --------------------------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| **String.length()**                           | Retorna  o tamanho da String.                                | String texto = "Teste"  <br />texto.length() = 5             |
| **String.charAt(indice)**                     | Retorna  o caractere em uma posição específica de uma String. | String s = "Teste"  <br />texto.charAt(2) = 'S'              |
| **String.valueOf()**                          | Converte  diversos tipos de dados em String.                 | int  numero = 11  <br />String.valueOf(numero) = "11"        |
| **String.substring(inicio)**                  | Retorna  uma cópia de caracteres a partir do índice inicio até o final da String. | String texto = "Teste" <br />texto.substring(2) = "ste"      |
| **String.substring(inicio,  fim)**            | Retorna  uma cópia de caracteres a partir de 2 índices inteiros: índice inicio até o  índice final. | String texto = "Teste" <br /> texto.substring(0, 2)= "Tes"   |
| **String.trim()**                             | Retorna  a String  sem todos os espaços em branco que aparecem no inicio e no final da String. | String texto  =  " Teste trim " <br /> texto.trim()=  "Teste trim" |
| **String.replace(‘caracter’,  ‘substituto’)** | Substitui  caracteres individuais na String.                 | String texto = "Teste"  <br />texto.replace(‘e’,  ‘a’) = "Tasta" |
| **String.concat()**                           | Concatena  2 Strings e retorna um novo objeto String.        | String texto1 = "Olá" <br />String texto2 = "Mundo" <br />texto1.concat(texto2) = "OláMundo" |
| **String.toUpperCase()**                      | Transforma  todas as letras de uma String em maiúsculas.     | String texto = "Teste" <br />texto.toUpperCase() = "TESTE"   |
| **String.toLowerCase()**                      | Transforma  todas as letras de uma String em minúsculas.     | String texto = "Teste" <br />texto.toLowerCase() =  "teste"  |
| **String.equals(String)**                     | Compara  2 Strings verificando se são iguais considerando inclusive se as letras são  maiúsculas ou minúsculas. | String texto1 = "teste" <br />String texto2 = "TESTE" <br />String texto3 = "teste" <br />texto1.equals(texto2) = false  <br />texto1.equals(texto3) = true |
| **String.equalsIgnoreCase(String)**           | Compara  2 Strings verificando se são iguais ignorando se as letras são maiúsculas ou minúsculas. | String texto1 = "teste"<br />String texto2 = "TESTE"<br />String texto3 = "teste"<br />texto1.equalsIgnoreCase(texto2) = true<br />texto1.equalsIgnoreCase(texto3) = true |
| **String.startsWith(String)**                 | Verifica se uma String inicia com a String passada como parâmetro. | String texto = "Teste" <br />texto.startsWith(T) = true      |
| **String.endsWith(String)**                   | Verifica se uma String termina com a String passada como parâmetro. | String texto = "Teste" <br />texto.endsWith(T) = false       |
| **String.contains(String)**                   | Verifica se uma String contém a String passada como parâmetro. | String texto = "Teste" <br />texto.contains(es) = true       |