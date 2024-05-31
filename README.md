## DESAFIO DIO - SANTANDER BACKEND JAVA 2024

## Autor

- [Diogo Misael](https://github.com/misaeldiogo)


Todas as entradas e saída dos algoritmos são utilizados o STDIN e STDOUT de cada linguagem, abaixo tem algumas dicas de como utilizar cada STDIN e STDOUT de cada linguagem.

### JavaScript

Em JavaScript as funções de STDIN e STDOUT respectivamente são gets e console.log, a função gets é implementada internamente para auxiliar a entrada dos dados.

Exemplo:

let line = gets(); // Lê a linha de entrada
console.log(line); // Imprime o dado

### Java

Em Java existe várias formas de implementar o STDIN e STDOUT recomendamos utilizar BufferedReader para o STDIN e o System.out.println para o STDOUT.

Exemplo:

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine()); // Lê a linha de entrada
int a = Integer.parseInt(st.nextToken());
System.out.println(a); // Imprime o dado

### Python

Em Python existe várias formas de implementar o STDIN e STDOUT recomendamos utilizar sys.stdin.readline para o STDIN e o print para o STDOUT.

Exemplo:

import sys
a = int(sys.stdin.readline()) // Lê a linha de entrada
print(a); // Imprime o dado

### Descrição

Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas. A aplicação deve permitir ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.

### Entrada

O programa exibirá um menu com as seguintes opções:

Depositar
Sacar
Consultar Saldo
Encerrar
O usuário escolherá uma dessas opções digitando o número correspondente.

### Saída

Utilizando um switch, o programa realizará a operação escolhida pelo usuário.

### Se o usuário escolher:

#### 1: O programa solicitará o valor a ser depositado e atualizará o saldo. Além disso, deve imprimir o saldo atual com a mensagem "Saldo atual: {saldo com 1 casa decimal}".

#### 2: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente. Sendo assim, deve imprimir "Saldo atual: {saldo com 1 casa decimal}" quando o saldo for suficiente e "Saldo insuficiente."

#### 3: O programa apenas exibirá o saldo atual da conta: "Saldo atual: {saldo com 1 casa decimal}".

#### 0: O programa encerrará, imprimindo "Programa encerrado.".