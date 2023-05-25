| Padrão      | Descrição                                | Problema que Resolve                                |
|-------------|------------------------------------------|-----------------------------------------------------|
| Strategy    | Define uma família de algoritmos         | Permite selecionar um algoritmo em tempo de         |
|             | encapsulados e os torna intercambiáveis.  | execução, sem a necessidade de modificar o          |
|             |                                          | código cliente.                                     |
| Observer    | Define uma dependência um-para-muitos    | Permite notificar automaticamente múltiplos        |
|             | entre objetos para que, quando um         | objetos sobre mudanças em um objeto                 |
|             | objeto muda de estado, todos os seus      | observado, mantendo o baixo acoplamento              |
|             | dependentes sejam notificados e           | entre eles.                                         |
|             | atualizados automaticamente.              |                                                     |
| Singleton   | Garante que uma classe tenha apenas uma  | Resolve o problema de acesso único e global         |
|             | instância e fornece um ponto global       | a uma instância de uma classe, evitando a           |
|             | de acesso a ela.                          | criação de múltiplas instâncias que podem           |
|             |                                          | levar a inconsistências e comportamentos indesejados.|
| Facade      | Fornece uma interface unificada para um   | Simplifica a complexidade de um sistema             |
|             | conjunto de interfaces em um subsistema.  | ao fornecer uma interface única e simplificada       |
|             |                                          | para um conjunto de interfaces complexas.           |
| Composite   | Permite tratar objetos individuais e      | Resolve o problema de tratamento uniforme           |
|             | composições de objetos de maneira         | de objetos individuais e compostos,                 |
|             | uniforme.                                | tratando-os da mesma forma.                         |

