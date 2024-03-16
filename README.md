# Aplicação Livraria Herói

Esta aplicação é uma API para uma livraria. O projeto foi desenvolvido utilizando a linguagem de programação Java.

## Estrutura do Projeto

O projeto está estruturado da seguinte maneira:

- `src/com/livrariaheroi`: Este é o diretório principal do projeto, onde estão localizados todos os arquivos de código fonte.

    - `config`: Este diretório contém a classe `AdminConfig`, que é responsável por armazenar a senha do administrador.

    - `data`: Este diretório contém a classe `Biblioteca`, que é responsável por armazenar os dados dos usuários e dos livros.

    - `entities`: Este diretório contém as classes que representam as entidades do projeto, como `Adm`, `Cliente`, `Pessoa` e `Aluguel`.

    - `services`: Este diretório contém as classes `UsuarioService`, `LivroService` e `AluguelService`.

        - `AluguelService`: Esta classe contém métodos para alugar um livro, devolver um livro, listar todos os aluguéis e buscar um aluguel específico.

        - `LivroService`: Esta classe contém métodos para listar todos os livros, buscar um livro específico, cadastrar um novo livro, deletar um livro e atualizar as informações de um livro.

        - `UsuarioService`: Esta classe contém métodos para criar um usuário, listar todos os usuários, buscar um usuário específico, deletar um usuário, atualizar as informações de um usuário e validar se um usuário é um administrador.

    - `controller`: Este diretório contém as classes `UsuarioController`, `LivroController` e `AluguelController`, que são responsáveis por gerenciar as interações do usuário com o sistema.

    - `interfaces`: Este diretório contém as interfaces que definem os contratos para os serviços do sistema. A interface `Alugavel` define os métodos `getAlugado` e `setAlugado` que devem ser implementados por qualquer classe que possa ser alugada.

    - `util`: Este diretório contém classes utilitárias, como `IdGenerator` e `ScannerUtil`.

## Funcionalidades

O projeto possui as seguintes funcionalidades:

- Criação de usuários: Através do método `criarUsuario` na classe `UsuarioService`, é possível criar novos usuários, sejam eles administradores ou clientes.

- Listagem de usuários: O método `listarUsuarios` na classe `UsuarioService` permite listar todos os usuários cadastrados.

- Busca de usuários: O método `buscarUsuario` na classe `UsuarioService` permite buscar um usuário pelo seu ID.

- Deleção de usuários: O método `deletarUsuario` na classe `UsuarioService` permite deletar um usuário pelo seu ID.

- Atualização de usuários: O método `atualizarUsuario` na classe `UsuarioService` permite atualizar os dados de um usuário.

- Validação de administradores: O método `validarAdm` na classe `UsuarioService` permite validar se um usuário é um administrador através da senha de administrador.

- Gerenciamento de livros: A classe `LivroService` permite criar, listar, buscar, atualizar e deletar livros.

- Gerenciamento de aluguéis: A classe `AluguelService` permite alugar um livro, devolver um livro, listar todos os aluguéis e buscar um aluguel específico.

## Como Executar

Para executar o projeto, você precisa ter o Java instalado em sua máquina. Em seguida, navegue até o diretório raiz do projeto e execute o comando `java src/com/livrariaheroi/Main.java`.

## Contribuições

Contribuições para o projeto são bem-vindas. Para contribuir, faça um fork do projeto, crie uma nova branch com suas alterações e abra um pull request.