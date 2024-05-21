# Luiz Felipe Borges de Souza

## Introdução

Olá, seja bem vindo ao meu portifólio universitário. Meu nome é Luiz Felipe e estou cursando Banco de Dados na Fatec Professor Jessen Vidal

Tenho 20 anos e estou atuand no momento, como Desenvolvedor Backend para a IBM no projeto do Itaú, concentro-me em Java (Spring Boot) para micro serviços que também contém Kafka, Redis. Já atuei com integradores financeiros usando Nest.Js e AWS (EC2 e S3). Em projetos anteriores, utilizei Java (Spring Boot), JavaScript (Node, Nest), Python (Django). Essas experiências destacam minha proficiência em tecnologias como Java, Node, Python, e a integração com serviços AWS, evidenciando minha versatilidade em ambientes de desenvolvimento variados.

<img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/eu.jpeg" height="300" width="230"/>


# Projeto 1: 2º semestre de 2021


SPanel

<img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/spanel.png" height="300"/>


### Visão do Projeto
Com intuito de aprimorar e agilizar o acesso aos números da COVID-19 disponibilizados pelo Estado de São Paulo, foi desenvolvido a SPanel, uma plataforma virtual que centraliza os principais dados da pandemia em uma interface fácil de navegar e entender. O principal objetivo do SPanel era reunir e apresentar as informações da pandemia do COVID-19 no estado de São Paulo, de maneira simples e intuítiva, permitindo ao usuário diferentes tipos de visualizações.

### Tecnologias utilizadas
<details>
<summary>Python</summary>

<p>• Python foi escolhido para o projeto devido à sua eficiência e flexibilidade. Utilizamos as bibliotecas Matplotlib para gerar gráficos de forma clara. As operações de manipulação de dados foram realizadas com Pandas e NumPy, garantindo análises detalhadas. A normalização dos dados foi alcançada de maneira eficaz usando as capacidades do NumPy. A linguagem facilitou o desenvolvimento eficiente e a implementação de práticas robustas. O projeto beneficiou-se da versatilidade do Python em visualização, tratamento e normalização de dados.
    
</details>

<details>
<summary>Pandas</summary>

<p>• No projeto, o Pandas foi essencial para manipular, tratar e normalizar dados, proporcionando eficiência na leitura e manipulação de conjuntos de dados. Além de facilitar uma análise detalhada, a biblioteca foi empregada na geração de gráficos visuais representativos. A normalização dos dados foi realizada de maneira eficaz com as funções integradas do Pandas, garantindo uniformidade nos resultados. Sua contribuição simplificou a complexidade associada à manipulação de dados, resultando em análises mais precisas e confiáveis..
    
</details>



<details>
<summary>Plotly</summary>

<p>• O Plotly foi escolhido no projeto para visualização de dados, destacando-se por sua capacidade de criar gráficos interativos e informativos. Embora não seja convencional para normalização, sua aplicação dinâmica na análise proporcionou uma compreensão mais profunda das distribuições. O Plotly contribuiu para o tratamento e exploração dinâmica dos dados, complementando técnicas de normalização e facilitando a identificação de padrões. Sua integração enriqueceu a análise, oferecendo uma perspectiva visual e interativa única..
    
</details>

### Contribuições Pessoais
Desenvolvimento focado na stack de back-end, construção e desenvolvimentos de metodos utilizando Python, Pandas, NumPy e Plotly. Solucionei durante o projeto alguns desafios:

<details>
<summary>Normalização dos dados</summary>
<br>
<br>
<br>
        A normalização dos dados possibilitou a plotagem e manipulação dos dados de forma fácil
<br>
<br>
<br>
        <img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/normalizacao_csv.png?raw=true" height="450" width="850"/>    
    
    
    
<p>• O código utiliza a biblioteca Pandas para ler um arquivo CSV ('docs/df_state.csv') em um DataFrame chamado 'df_state'. Em seguida, algumas colunas específicas são removidas do DataFrame usando o método 'drop'. As colunas removidas incluem informações como datas, casos e óbitos per capita, entre outras. Posteriormente, os nomes dos municípios no DataFrame são convertidos para maiúsculas, e a coluna 'datahora' é convertida para o formato de data utilizando o método 'pd.to_datetime'. O resultado é um DataFrame preparado para análise, com algumas colunas removidas e dados formatados adequadamente.
    
</details>


<details>
<summary>Tratamento dos dados</summary>
<br>
<br>
<br>
       Foi realizado o tratamento dos dados para que seja possível consumir os dados de uma forma fácil
<br>
<br>
<br>
        <img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/tratamento_dados_estado.png?raw=true" height="450" width="600"/>    
    
    
    
<p>• O código cria um novo DataFrame chamado 'df_estadotratado' a partir do DataFrame original 'df_state', removendo a coluna 'nome_munic'. Em seguida, uma nova coluna chamada 'estado' é adicionada com o valor 'SÃO PAULO' para todas as entradas. O DataFrame é ordenado por 'datahora', mas essa operação não é atribuída de volta ao DataFrame. As colunas 'casos', 'casos_novos', 'obitos', 'obitos_novos' e 'pop' são agrupadas e transformadas para representar as somas cumulativas por data. Por fim, são removidas as duplicatas com base na coluna 'datahora', mantendo apenas a primeira ocorrência para cada data no DataFrame resultante 'df_estadotratado'.
    
</details>

<details>
<summary>Construção de gráficos</summary>
<br>
<br>
<br>
        Realizei os gráficos para que exista diferentes tipos de visualizações dos dados.
<br>
<br>
<br>
<img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/grafico_pizza.png?raw=true"/>  
    
<p>• Para realizar a construção dos gráficos utilizei a biblioteca Plotly gerando uma figura e definindo os seus valores que são respectivos as colunas definidas do dataframe.        
    
    
</details>

### Aprendizados Efetivos 

<details>
<summary>Python</summary>

<p>• Desenvolvimento de software
    
<p>• Manipulação de dados
    
<p>• Realizar CRUD com o ecossistema Spring
    
</details>

<details>
<summary>Pandas</summary>
    
<p>• Tratamento de csv's

<p>• Tratamento de dados
    
<p>• Manipulação de csv's
        
    
</details>

<details>
<summary>Plotly</summary>
    
<p>• Construção de gráficos

<p>• Plotagem de gráficos
    
    
</details>

# Projeto 2: 1º semestre de 2022


Dom Rock

<img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/dom_rock_logo.jfif" height="300"/>

A Dom Rock, empresa fundada em 2013, desenvolve tecnologia de inteligência de dados automatizada para melhorar o engajamento de clientes e a eficiência operacional. Seus produtos, como Vox, Sales&Distribution, Marketing&Planning e Pricing, são baseados em modelos matemáticos e algoritmos de aprendizado de máquina, permitindo cenários personalizados em diversas áreas como marketing, vendas, logística e finanças. A automação desde a ingestão até o processamento final dos dados reduz custos e aumenta a produtividade, enquanto os painéis, relatórios e integrações facilitam o acesso e a utilização das informações. A empresa busca oferecer soluções que agilizem a tomada de decisão e impulsionem os resultados dos negócios de seus clientes

### Visão do Projeto
A empresa busca uma solução que seja orientada a entrada de dados de parâmetros e variáveis de cada cliente para alocar recursos na plataforma Dom Rock, entrada de dados e estimativa de consumo de recursos (baseado em volume de dados de cliente, quantidade de usuários e outros) e gere relatórios e consultas, mas, principalmente, tenha a base de dados modelada adequadamente para futuras integrações com outros sistemas. 

### Tecnologias utilizadas
<details>
<summary>Java</summary>

<p>• Java foi escolhido para desenvolver aplicações desktop devido à sua portabilidade, permitindo que o código seja executado em várias plataformas sem necessidade de recompilação. Além disso, sua ampla adoção e comunidade ativa oferecem uma vasta gama de recursos e suporte. A linguagem foi projetada com recursos de segurança robustos, incluindo execução de código em um ambiente sandbox. Com frameworks como JavaFX e Swing, o desenvolvimento de interfaces gráficas de usuário é simplificado. E, por ser suportado por empresas como a Oracle, Java oferece atualizações contínuas e suporte corporativo.
    
</details>

<details>
<summary>JavaFX</summary>

<p>• JavaFX é uma escolha poderosa para projetos desktop devido à sua capacidade de criar interfaces gráficas de usuário modernas e interativas. Com recursos como gráficos 2D e 3D, animações, efeitos visuais e suporte para CSS, JavaFX permite desenvolver aplicações visualmente atraentes. Além disso, sua integração nativa com Java simplifica o desenvolvimento e oferece excelente desempenho em diferentes plataformas.
    
</details>



<details>
<summary>Hibernate</summary>

<p>• O Hibernate é um framework de mapeamento objeto-relacional (ORM) em Java que permite a persistência de objetos Java em bancos de dados relacionais. Ele faz isso mapeando classes Java para tabelas de banco de dados e gerenciando automaticamente as operações de CRUD (Create, Read, Update, Delete). O Hibernate usa mapeamentos XML ou anotações para definir a correspondência entre as classes Java e as tabelas do banco de dados. Isso simplifica o desenvolvimento, evita a escrita manual de SQL e oferece um alto nível de abstração para interagir com o banco de dados.
    
</details>

### Contribuições Pessoais
Desenvolvimento focado na stack de back-end, construção e desenvolvimentos de metodos utilizando Java e Hibernate. Solucionei durante o projeto alguns desafios:

<details>
<summary>Java Connection</summary>
<br>
<br>
<br>
       Foi criada uma classe para poder realizar a conexão com o banco de dados
<br>
<br>
<br>
        <img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/ConexaoDAO.png" height="450" width="850"/>    
    
    
    
<p>• Este código Java define uma classe chamada ConexaoDAO, que tem um método chamado conectaBD(). Dentro deste método, uma string chamada connectionUrl é definida, especificando os detalhes de conexão com um banco de dados SQL Server hospedado na URL fornecida. Em seguida, uma conexão é estabelecida usando o DriverManager do JDBC, utilizando a string de conexão. Finalmente, a conexão é retornada como um objeto Connection. Este código encapsula a lógica de conexão com o banco de dados, facilitando a reutilização em todo o projeto
    
</details>


<details>
<summary>Operação com banco de dados</summary>
<br>
<br>
<br>
       Foi realizado o tratamento dos dados para que seja possível consumir os dados de uma forma fácil
<br>
<br>
<br>
        <img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/CadastrarProdutoDAO.png" height="450" width="600"/>    
    
    
    
<p>• O código cria um novo DataFrame chamado 'df_estadotratado' a partir do DataFrame original 'df_state', removendo a coluna 'nome_munic'. Em seguida, uma nova coluna chamada 'estado' é adicionada com o valor 'SÃO PAULO' para todas as entradas. O DataFrame é ordenado por 'datahora', mas essa operação não é atribuída de volta ao DataFrame. As colunas 'casos', 'casos_novos', 'obitos', 'obitos_novos' e 'pop' são agrupadas e transformadas para representar as somas cumulativas por data. Por fim, são removidas as duplicatas com base na coluna 'datahora', mantendo apenas a primeira ocorrência para cada data no DataFrame resultante 'df_estadotratado'.
    
</details>

<details>
<summary>DTO</summary>
<br>
<br>
<br>
        Realizei os gráficos para que exista diferentes tipos de visualizações dos dados.
<br>
<br>
<br>
<img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/AtributosDTO.png"/> 
<img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/MetodosDTO.png"/> 
    
<p>• Para realizar a construção dos gráficos utilizei a biblioteca Plotly gerando uma figura e definindo os seus valores que são respectivos as colunas definidas do dataframe.        
    
    
</details>

### Aprendizados Efetivos 

<details>
<summary>Python</summary>

<p>• Desenvolvimento de software
    
<p>• Manipulação de dados
    
<p>• Realizar CRUD com o ecossistema Spring
    
</details>

<details>
<summary>Pandas</summary>
    
<p>• Tratamento de csv's

<p>• Tratamento de dados
    
<p>• Manipulação de csv's
        
    
</details>

<details>
<summary>Plotly</summary>
    
<p>• Construção de gráficos

<p>• Plotagem de gráficos
    
    
</details>

# Projeto 3: 2º semestre de 2022


IACIT

<img src="https://user-images.githubusercontent.com/54003876/142727570-6c418f49-5e00-437c-9d9e-5b27131974bb.png" height="300"/>

##### *Figura 06. IACIT (Fonte: https://www.iacit.com.br/)*

Um importante polo da indústria aeroespacial brasileira, fundada em 1986, a IACIT é uma empresa brasileira com sede em São José dos Campos - SP. Com capacitação no desenvolvimento de produtos e sistemas aplicados  para o segmento de navegação aérea, com certificação como Empresa Estratégica de Defesa (EED).

### Visão do Projeto
A Iacit é uma empresa de consultoria meteorológica, e hoje, um dos seus serviços é fornecer aos nossos clientes, relatórios customizados de dados meteorológicos. Como alguns de seus processos necessitam de trabalho manuais, e muitas das vezes é desperdiçado recursos e tempo. Por isso, criamos um sistema web que permite realizar a importação dos dados meteorológicos, bem como armazená-los em um banco de dados relacional, e oferecer diferentes tipos de visualizações de tipos de dados sendo possível  gerar os relatórios customizados de forma que o usuário desejar.


### Tecnologias utilizadas
<details>
<summary>Spring</summary>

<p>• Utilizando se do ecossistema Spring, foi implementado no projeto: Spring-boot, Spring-security e Spring-data. Pela parte do Spring-boot foi possível alimentar o dashboard e cards que apresentavam os dados, através de requisições HTTP utilizando a arquitetura Rest. O Spring-security foi implementado para utilizar se de sua criptografia do pacote "cripto" em dados sensíveis e o Spring-data utilizamos para poder realizar operações com o banco de dados.
    
</details>

<details>
<summary>Thymeleaf</summary>

<p>• O Thymeleaf é um mecanismo de template que permite integrar HTML, CSS e JavaScript com dados dinâmicos em aplicativos web Java. Quando utilizado com Spring Boot, o Thymeleaf é uma ferramenta poderosa para a criação de páginas web dinâmicas e interativas, permitindo a manipulação de dados em tempo de execução, a personalização da aparência da página de acordo com o contexto, e a utilização de recursos avançados de template, como laços, condicionais e internacionalização. Além disso, o Thymeleaf é fácil de usar, com uma sintaxe simples e intuitiva, e é altamente compatível com outras tecnologias de front-end e back-end.
    
</details>



<details>
<summary>Javascript</summary>

<p>• O JavaScript é uma linguagem de programação fundamental para o desenvolvimento de aplicações web modernas. Ele é amplamente utilizado no front-end para criar interfaces dinâmicas e interativas, tornando a experiência do usuário mais agradável e fluida. Com o JavaScript, é possível manipular elementos da página em tempo real, oferecendo recursos como animações, validação de formulários, exibição de conteúdo dinâmico e muito mais. Com isso, a importância do uso de JavaScript no front-end é inegável para a construção de sites eficientes e que atendam às expectativas dos usuários.
    
</details>

<details>
<summary>HTML</summary>

<p>• HTML é a linguagem de marcação padrão para a criação de páginas web. Ela permite a estruturação e organização do conteúdo da página, além de fornecer as informações necessárias para o navegador renderizá-la corretamente. O uso adequado do HTML é fundamental para criar sites acessíveis, bem estruturados e com boa semântica, tornando-os mais fáceis de serem encontrados e utilizados pelos usuários
</details>

<details>
<summary>CSS</summary>

<p>• CSS é uma linguagem de estilo utilizada para definir a aparência e o layout de uma página web. Seu uso é fundamental para criar designs atrativos, responsivos e funcionais, tornando a experiência do usuário mais agradável e eficiente.
    
</details>



### Contribuições Pessoais
Desenvolvimento focado na stack de back-end, construção e desenvolvimentos de metodos utilizando Java com o framework Spring e seu ecossistema. Solucionei durante o projeto alguns desafios:

<details>
<summary>Edição de dados do usuário</summary>
<br>
<br>
<br>
        O método de editor usuário possibilitou a alteração de senha, permissão e 'status' do usuário.
<br>
<br>
<br>
        <img src="https://github.com/luizborges17/portfolio/blob/main/WhatsApp%20Image%202023-03-22%20at%207.26.19%20PM%20(1).jpeg?raw=true" height="850" width="850"/>    
    
    
    
<p>•Utilizando se através de requições HTTP, era recebido os dados que seriam editados do usuario e também quem realizou a edição, utilizando dos métodos do JPA e o Hibernate para realizar a pesquisa de qual usuario realizou a edição e qual usuario seria editado, durante o processo foi realizado a implementação do pacote BCryptPasswordEncoder para poder codificar a senha do usuario atraves da função "encode". Esta função cria um Hash que produz uma saída de 192 bits a qual dificulta a realização de ataques do tipo "Brute Force". Com isso as alterações são salvas no banco de dados e é retornado um objeto do tipo ModelAndView com o nome do template que será carregado e os dados que foram setados previamente no método.
    
</details>


<details>
<summary>Mapeamento de tabelas</summary>
<br>
<br>
<br>
        Foi realizado o mapeamento de tabelas para que possamos utilizando o JPA em seus repositórios, com isso é possível manipular e persistir os dados.
<br>
<br>
<br>
        <img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/TableMap.jpeg?raw=true" height="850" width="600"/>    
    
    
    
<p>• Utilizando se de anotações do "javax-persistence" como o @Entity para definir que a classe é uma entidade, @Table com o parâmetro "name" para poder referenciar a qual tabela é correspondente a esta entidade, @Id para associar aquele campo a uma chave primária. As anotações @Column e @JoinColumn representam colunas de uma tabela, ambas com parâmetro "name" que indentificam o nome da coluna, porém a anotação @JoinColumn representa colunas com chaves estrangeiras juntamente com o parâmetro "referencedColumName" e a anotação @ManyToOne, a coluna que ela é referenciada em sua tabela a qual é referenciada.
    
</details>

<details>
<summary>Documentação do Código</summary>
<br>
<br>
<br>
        Realizei a documentação utilizando o Swagger que auxiliou no desenvolvimento do sistema, podendo identificar os endpoints, métodos e parâmetros existes na aplicação.
<br>
<br>
<br>
<img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/SwaggerConfiguration.jpeg?raw=true"/>    
<p>• Para realizar a documentação do código back-end foi utilizado o Swagger, que para habilitarmos foi realizado uma classe de configuração para ser possível a identificação de todos os endpoints.
    
<br>
<br>
<br>
<img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/endpoint-detalhado.jpeg?raw=true"/>    
<p>• Com o Swagger habilitado, ao acessar a url "localhost:8080/swagger.io.html#" ele listará todos os métodos que a aplicação possuí.
    
                
                
<br>
<br>
<br>               
<img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/SwaggerConfiguration.jpeg?raw=true"/>    
<p>• Ao acessar um dos endpoints, é possível ver os metódos Http disponíveis.
    
                    
<br>
<br>
<br>                                   
<img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/SwaggerConfiguration.jpeg?raw=true"/>    
<p>• Ao selecionar o método Http aparecerá o edpoint escolhido com sua rota, seus parâmetros e com exemplos de request e responses.
    
</details>

### Aprendizados Efetivos 

<details>
<summary>Spring</summary>
    
<p>• Java 8

<p>• Mapear tabelas
    
<p>• Realizar CRUD com o ecossistema Spring
    
<p>• Desenvolver códigos limpos em Java
    
</details>

<details>
<summary>Rest</summary>
    
<p>• Realizar requisições

<p>• Aprendizado a cerca da anatomia da arquitetura Rest
    
<p>• Tipos de status http
        
    
</details>

<details>
<summary>Documentção de Source Code</summary>
    
<p>• Documentar endpoints

<p>• Descrever métodos
    
<p>• Disponibilizar exemplos de "request's" e "responses"
        
    
</details>


# Projeto 4: 1º semestre de 2023


EMBRAER

<img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/embraer-logo-0.png" height="300"/>

##### *Figura 06. Embraer (Fonte: https://www.ficaon.com/)*

A Embraer é uma empresa brasileira de aviação com uma história de destaque no cenário internacional. Fundada em 1969, tornou-se uma das maiores fabricantes de aeronaves comerciais e militares do mundo. Sua relevância se reflete na liderança global em jatos de até 130 assentos, contribuindo significativamente para a economia brasileira e fortalecendo a indústria aeroespacial do país.

### Visão do Projeto
Desenvolvemos um sistema de Controle de Configuração de Aeronaves (ACC) para a Embraer, líder global na fabricação de aeronaves militares, comerciais, executivas e agrícolas. Como terceira maior empresa de aviação executiva do mundo, a Embraer está desafiando a dominância europeia e americana no setor. O ACC permite à Embraer gerenciar eficientemente a configuração de suas aeronaves, garantindo qualidade e eficácia na produção, além de possibilitar que os pilotos verifiquem a configuração e limitações das aeronaves que operam.


### Tecnologias utilizadas
<details>
<summary>Spring</summary>

<p>• Utilizando se do ecossistema Spring, foi implementado no projeto: Spring-boot, Spring-security e Spring-data, principalmente foi utilizado para realizar o controle e a injeção de dependências. Pela parte do Spring-boot foi possível alimentar o dashboard e cards que apresentavam os dados, através de requisições HTTP utilizando a arquitetura Rest. O Spring-security foi implementado para utilizar se de sua criptografia do pacote "cripto" em dados sensíveis e o Spring-data utilizamos para poder realizar operações com o banco de dados.
    
</details>

<details>
<summary>Hibernate</summary>

<p>• O Hibernate é um framework de mapeamento objeto-relacional (ORM) em Java que permite a persistência de objetos Java em bancos de dados relacionais. Ele faz isso mapeando classes Java para tabelas de banco de dados e gerenciando automaticamente as operações de CRUD (Create, Read, Update, Delete). O Hibernate usa mapeamentos XML ou anotações para definir a correspondência entre as classes Java e as tabelas do banco de dados. Isso simplifica o desenvolvimento, evita a escrita manual de SQL e oferece um alto nível de abstração para interagir com o banco de dados.
    
</details>



<details>
<summary>Maven</summary>

<p>• O Maven é uma ferramenta de automação de construção (build) amplamente usada em desenvolvimento de software Java. Ele simplifica a compilação, teste, empacotamento e gerenciamento de dependências de projetos Java. O Maven é essencial para manter projetos organizados, padronizar builds e facilitar a colaboração entre desenvolvedores, garantindo que as bibliotecas e recursos necessários sejam gerenciados de forma eficiente.
    
</details>

<details>
<summary>Swagger-OpenAPI</summary>

<p>• O Swagger, agora conhecido como OpenAPI, é uma ferramenta que permite a documentação e a exposição de APIs de forma padronizada. Ele define um formato de especificação que descreve detalhadamente as operações, parâmetros e respostas de uma API, facilitando sua compreensão e uso. O Swagger/OpenAPI é fundamental para promover a interoperabilidade e facilitar a integração de serviços, além de melhorar a comunicação entre equipes de desenvolvimento e documentação precisa, economizando tempo e esforço na criação e manutenção de APIs.
    
</details>


### Contribuições Pessoais
Desenvolvimento focado na stack de back-end, construção e desenvolvimentos de metodos utilizando Java com o framework Spring e seu ecossistema. Solucionei durante o projeto alguns desafios:

<details>
<summary>Tratamento de excessões</summary>
<br>
<br>
<br>
        <img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/classe_configuracao_erros.png?raw=true" height="450" width="600"/>    
    
    
    
<p>•O método messageSource() neste trecho de código Java configura um bean MessageSource para tratamento de mensagens em uma aplicação Spring. Utilizando a implementação ReloadableResourceBundleMessageSource, o método define o basename como "classpath:messages", indicando que as mensagens serão carregadas a partir de um arquivo chamado "messages" no classpath da aplicação. Além disso, a codificação padrão é configurada como UTF-8 para garantir o suporte adequado a caracteres especiais. O bean MessageSource é crucial para a resolução de mensagens, especialmente em contextos de internacionalização e localização, proporcionando a flexibilidade necessária para adaptar as mensagens de exceção de acordo com diferentes idiomas e culturas. O retorno do método é a instância configurada de ReloadableResourceBundleMessageSource, que será gerenciada pelo contêiner Spring.

<br>
<br>
<br>
        <img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/dto_error_internal.png?raw=true" height="350" width="400"/>    
    
    
    
<p>•A classe possui um campo chamado message, e é anotada com @Getter para gerar automaticamente os métodos de acesso (getters) para esse campo. O construtor da classe recebe uma mensagem como parâmetro e a atribui ao campo message. Essencialmente, essa classe representa um objeto de transferência de dados (DTO) para encapsular mensagens de erro relacionadas a problemas no servidor interno.

<br>
<br>
<br>
        <img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/implementacao_erros.png?raw=true" height="450" width="600"/>    
    
    
    
<p>•O método handle neste trecho de código é anotado com @ExceptionHandler e é designado para lidar com várias exceções, incluindo RuntimeException, StackOverflowError, IllegalArgumentException, ClassCastException, IOException, e InvalidFormatException. Quando uma exceção desse tipo ocorre em qualquer controlador na aplicação, este método é invocado. Ao receber a exceção como parâmetro, o método utiliza o MessageSource para obter uma mensagem personalizada associada à chave "InternalError" no contexto de localização atual. Essa mensagem é, então, encapsulada em um objeto ErrorInternalServerDTO. Finalmente, esse objeto é retornado como resposta, fornecendo detalhes personalizados sobre o erro interno do servidor. Essa abordagem centralizada permite o tratamento consistente de exceções em toda a aplicação, tornando mais fácil fornecer mensagens de erro personalizadas e adaptadas à localização do usuário. O código também define o código de status HTTP como 500 (Internal Server Error), indicando que ocorreu uma falha não esperada no servidor.
    
</details>


<details>
<summary>Método de Login </summary>
<br>
<br>
<br>
        Foi realizado o mapeamento de tabelas para que possamos utilizando o JPA em seus repositórios, com isso é possível manipular e persistir os dados.
<br>
<br>
<br>
        <img src="https://raw.githubusercontent.com/luizborges17/bertoti/9ff3e831c2cdc1ca4c861a97ac0ccf6bda0dbd5e/portifolio/images/loginController.png" height="850" width="800"/>    
    
    
    
<p>• Esse trecho de código em Java é um controlador (controller) que faz parte de uma aplicação utilizando o framework Spring. Vamos analisar cada parte para entender sua funcionalidade. A anotação @RestController identifica a classe como um controlador REST, responsável por lidar com requisições HTTP e gerar respostas no formato apropriado para APIs RESTful. A anotação @CrossOrigin indica que as requisições para este controlador podem originar-se de diferentes domínios. Isso é útil quando a API pode ser acessada por clientes hospedados em locais variados na web. O @RequestMapping(value = "/login") define o mapeamento de URL para este controlador. Neste caso, ele irá processar requisições destinadas à rota "/login". Dentro da classe LoginController, há duas injeções de dependência usando @Autowired. A primeira injeta um objeto do tipo UserRepository, que provavelmente é responsável por interações com o banco de dados relacionadas aos usuários. A segunda injeta um objeto do tipo AuthenticationManager, 
uma interface do Spring Security para autenticar usuários. O método autenticar é mapeado para requisições HTTP do tipo POST para a rota "/login". Ele recebe um objeto do tipo Login no corpo da requisição, que, presumivelmente, contém informações de login, como nome de usuário e senha. Dentro desse método, uma instância de UsernamePasswordAuthenticationToken é criada com as credenciais fornecidas no objeto Login. O AuthenticationManager é então utilizado para autenticar essas credenciais, possivelmente envolvendo processos de validação e verificação de senha. Após a autenticação bem-sucedida, a senha é removida do objeto Login antes de retornar a resposta. Em seguida, um token JWT é gerado usando a classe JwtUtils e é atribuído ao objeto Login. Adicionalmente, a autoridade do usuário autenticado é extraída e também adicionada ao objeto Login. Finalmente, o objeto Login modificado é retornado como resposta à requisição POST, fornecendo ao cliente informações como o token JWT gerado e possíveis detalhes sobre a autorização do usuário. Em resumo, este código parece implementar a lógica de autenticação de usuários, utilizando tokens JWT para gerenciar sessões. É importante garantir que outras partes da aplicação, como configurações de segurança e interações com o banco de dados, estejam devidamente configuradas para garantir o correto funcionamento dessa funcionalidade.
    
</details>

<details>
<summary>Método que lista todos os chassis</summary>
    
<br>
<br>
<br>
<img src="https://github.com/luizborges17/bertoti/blob/main/portifolio/images/metodo_lista_chassis.png?raw=true"/>    
<p>• A classe ListChassisService é um serviço em uma aplicação Spring que lida com a listagem de chassis. No método execute(), ele primeiro obtém a lista de todos os chassis do banco de dados. Se a lista estiver vazia, ele lança uma exceção indicando que o chassi não existe. Caso contrário, cria uma nova lista de objetos ListChassisDto e, para cada chassi na lista original, cria um objeto DTO, configura o ID do chassi e adiciona à lista resultante. Essa lista de DTOs é então retornada como resultado do serviço. Em resumo, o serviço busca e lista chassis, criando objetos DTO para representar as informações dos chassis encontrados. Se nenhum chassi for encontrado, ele sinaliza que o chassi não existe através de uma exceção.
    
</details>

### Aprendizados Efetivos 

<details>
<summary>Spring Security</summary>
    
<p>• Java 11

<p>• Configuração do Security
    
<p>• Implementação do Security
    
</details>

<details>
<summary>Tratamento de excessões com Spring</summary>
    
<p>• Java 11

<p>• Spring Boot
    
<p>• Arquitetura Rest
        
    
</details>

<details>
<summary>Java</summary>
    
<p>• Trabalhar com listas
    
<p>• Realizar operações manipulando dados
        
    
</details>


