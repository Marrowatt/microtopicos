# MicroTopicos - Estoque

Sistema proposto para trabalho da disciplina de Tópicos Avançados em Computação.

## Rotas

Aqui estão descritas todas as rotas que atualmente estão implementadas.

### Produto
| Verbo | Rota       | Descrição                                        |
|-------|------------|--------------------------------------------------|
|  GET  |/produto    | Retorna todos os produtos cadastrados            |
|  GET  |/produto{id}| Retorna um produto cadastrado                    |
|  POST |/produto    | Ao passar os parâmetros, um produto é cadastrado |

### Estoque
| Verbo | Rota               | Descrição                                        |
|-------|------------        |--------------------------------------------------|
|  GET  |/estoque            | Retorna todas as ocorrências de estoque cadastrados |
|  GET  |/estoque{id}        | Retorna uma ocorrência de estoque cadastrado        |
|  GET  |/estoque{produto_id}| Retorna as ocorrências de estoque de um determinado produto |
|  POST |/estoque            | Ao passar os parâmetros, uma ocorrência de estoque é cadastrada |

Obs.: Quando uma ocorrência de estoque for persistida, a quantidade do produto mencionado será modificada. 