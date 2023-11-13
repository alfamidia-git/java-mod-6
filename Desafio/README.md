## DESAFIO FINAL DO MÓDULO
Após explorar as aulas anteriores, você está pronto para enfrentar um desafio real...

## Sistema de Análise de Dados com Streams
O objetivo principal deste desafio é aplicar o conhecimento adquirido sobre streams no Java, incluindo operações intermediárias e finais, para realizar análises complexas de dados.

### Vamos ao desafio:
1. Crie uma classe **Dado** com os seguintes atributos:
* identificador.
* valor.
* categoria.
* data.
* métodos
* toString()
* Métodos getters e setters.
* Construtor que aceita todos os parâmetros.

2. Crie uma classe **AnaliseDados**:
Implemente métodos que utilizem streams para:
* Filtrar dados por categoria.
* Calcular a soma dos valores de uma categoria.
* Encontrar o valor máximo em uma lista de dados.
* Agrupar dados por categoria.
* Ordenar dados por valor e data.
* Utilize o método collect com coletores adequados para realizar tarefas como agrupamento e sumarização.
* Utilize métodos de operação intermediária como filter, map, sorted, para preparar os streams para operações finais como collect, reduce, forEach.

3. Na classe Principal:
* Crie uma lista de Dado com múltiplos registros.
* Instancie a classe AnaliseDados.
* Realize diversas análises com os dados utilizando o poder dos streams e exiba os resultados.
* Manipule a lista de dados para demonstrar a eficiência das operações em streams em comparação com abordagens imperativas tradicionais.