# Luiz Felipe Borges de Souza

## Introdução

Olá, seja bem vindo ao meu portifólio universitário. Meu nome é Luiz Felipe e estou cursando Banco de Dados na Fatec Professor Jessen Vidal

Tenho 19 anos atualmente e atuo como Desenvolvedor Jùnior

<img src="https://scontent.fcgh1-1.fna.fbcdn.net/v/t39.30808-6/290179573_5260766934036920_8588898227045354601_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeGz40ymoNWYs_7646ZwPrhGeqmuouOALd16qa6i44At3e1tyzSIo9GmICd6fCpkqwgCp0uELRRhIPhw-Bs4aTkW&_nc_ohc=2CYUEIkAvygAX806Zc8&_nc_zt=23&_nc_ht=scontent.fcgh1-1.fna&oh=00_AfAPu2iBavDqG6YaOfEKPoFLGD30uLsK83Avj73xUX225Q&oe=6403EAF4" height="300" width="300"/>


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
        <img src="https://github.com/luizborges17/portfolio/blob/main/WhatsApp%20Image%202023-03-22%20at%207.26.19%20PM%20(1).jpeg?raw=true" height="850" width="850"/>    
    
    
    
<p>•Utilizando se através de requições HTTP, era recebido os dados que seriam editados do usuario e também quem realizou a edição, utilizando dos métodos do JPA e o Hibernate para realizar a pesquisa de qual usuario realizou a edição e qual usuario seria editado, durante o processo foi realizado a implementação do pacote BCryptPasswordEncoder para poder codificar a senha do usuario atraves da função "encode". Esta função cria um Hash que produz uma saída de 192 bits a qual dificulta a realização de ataques do tipo "Brute Force". Com isso as alterações são salvas no banco de dados e é retornado um objeto do tipo ModelAndView com o nome do template que será carregado e os dados que foram setados previamente no método.
    
</details>
