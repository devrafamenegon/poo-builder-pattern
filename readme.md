# Padrão de Projeto: Builder

## Categoria: Criacional

### Objetivo
O padrão Builder é utilizado para construir um objeto complexo passo a passo. Ele permite a criação de diferentes representações do mesmo objeto, isolando o código de construção do código de representação. Dessa forma, é possível criar objetos complexos com partes opcionais ou configuráveis de maneira flexível.

### Participantes Principais

- **Produto:** Representa o objeto complexo que está sendo construído.

- **Builder (Construtor):** Define uma interface para construir partes do produto.

- **ConcreteBuilder (Construtor Concreto):** Implementa a interface do Builder e constrói partes específicas do produto.

- **Director (Diretor):** Controla o processo de construção usando um objeto Builder. O diretor conhece a interface do Builder, mas não necessariamente a implementação concreta.

### Funcionamento

1. **Interface Builder:** Define métodos para construir as partes do produto.

2. **ConcreteBuilder:** Implementa a interface Builder e constrói as partes específicas do produto. Cada construtor concreto pode criar um produto diferente.

3. **Produto:** Representa o objeto complexo que está sendo construído. O Builder constrói e retorna o produto final.

4. **Diretor:** Controla o processo de construção utilizando um objeto Builder. Pode conhecer vários construtores concretos e, com base em alguma lógica, decidir qual construtor usar.

### Exemplo Prático

Vamos considerar a construção de um objeto "Carro". O Builder pode ser usado para construir diferentes tipos de carros, como carros para esportivos, carros populares, etc. O diretor controlaria o processo de construção, enquanto os construtores concretos implementariam a construção específica para cada tipo de carro.

### Vantagens

- **Flexibilidade:** Permite criar diferentes representações do mesmo objeto.

- **Isolamento:** Isola o código de construção do código de representação, facilitando modificações e extensões.

- **Reusabilidade:** Permite reutilizar o mesmo código de construção para criar diferentes produtos.

### Conclusão

O padrão Builder é útil quando o processo de criação de um objeto é complexo e quando você deseja criar diferentes representações desse objeto. Ele oferece flexibilidade na construção de objetos complexos e é particularmente útil quando existem partes opcionais ou configuráveis no objeto final.
