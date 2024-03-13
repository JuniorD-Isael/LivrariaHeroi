# Aplicação Livraria Herói

Esta aplicação é uma API para uma livraria. A estrutura do projeto é a seguinte:

- `src/com/livrariaheroi`: Diretório raiz do código fonte.
  - `controller`: Contém as classes controladoras, que lidam com as solicitações e respostas HTTP.
  - `entities`: Contém as classes que representam as entidades do domínio do problema.
  - `interfaces`: Contém as interfaces que são implementadas pelas classes do domínio.
  - `services`: Contém as classes de serviço, que lidam com a lógica de negócios.

## Classes

- `LivroController`: Controlador para operações relacionadas a livros.
- `UsuarioController`: Controlador para operações relacionadas a usuários.
- `AluguelController`: Controlador para operações relacionadas a aluguéis.
- `Livro`: Classe que representa um livro na livraria.
- `Usuario`: Classe que representa um usuário da livraria.
- `Alugavel`: Interface que define os métodos para alugar e devolver um item.

## Serviços

- `LivroService`: Serviço para lidar com a lógica de negócios relacionada a livros.
- `UsuarioService`: Serviço para lidar com a lógica de negócios relacionada a usuários.
- `AluguelService`: Serviço para lidar com a lógica de negócios relacionada a aluguéis.