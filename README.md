📍 Consulta de CEP

Aplicativo Android desenvolvido em Kotlin com Android Studio para consultar informações de endereços a partir de um CEP.

O projeto realiza o consumo de uma API de consulta de CEP e apresenta os dados retornados diretamente na tela do aplicativo, facilitando a busca de informações como logradouro, bairro, cidade, UF e DDD.

📱 Sobre o projeto

O Consulta de CEP foi desenvolvido como um projeto para praticar conceitos de desenvolvimento mobile com Android e Kotlin, integração com APIs e manipulação dos dados retornados por uma requisição HTTP.

O usuário informa um CEP no campo de consulta e, ao clicar em "Consultar CEP", o aplicativo realiza a busca e apresenta as informações do endereço encontrado.

✨ Funcionalidades

🔎 Consulta de endereço através do CEP

🌐 Consumo de API externa

📍 Exibição do logradouro

🏘️ Exibição do bairro

🏙️ Exibição da cidade

🗺️ Exibição da UF

☎️ Exibição do DDD

⚠️ Tratamento de consultas inválidas ou sem resultado

📱 Interface desenvolvida para dispositivos Android

🛠️ Tecnologias utilizadas

Kotlin

Android Studio

Android SDK

API ViaCEP

HTTP/REST

Coroutines

AndroidX

🔌 API utilizada

O projeto utiliza a ViaCEP para consultar os dados de endereço a partir do CEP.

Documentação:

https://viacep.com.br/

Exemplo de consulta:

https://viacep.com.br/ws/01001000/json/

A API retorna os dados do endereço em formato JSON, que são utilizados pelo aplicativo para preencher as informações apresentadas na tela.

📲 Interface

Tela inicial

Nesta tela o usuário informa o CEP que deseja consultar.



Tela com os dados do endereço

Após realizar a consulta, os dados retornados pela API são apresentados nos campos de endereço.



Observação: as duas imagens enviadas para este README estão atualmente idênticas. Caso a segunda imagem deva mostrar os campos preenchidos, substitua screenshots/tela-dados.jpeg pela captura correta.

🧩 Estrutura do projeto

Uma estrutura simplificada do projeto:

ConsultaCEP/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── .../
│           │       ├── MainActivity.kt
│           │       └── api/
│           │           └── ViaCepClient.kt
│           │
│           └── res/
│               ├── drawable/
│               ├── layout/
│               ├── mipmap/
│               └── values/
│
├── screenshots/
│   ├── tela-vazia.jpeg
│   └── tela-dados.jpeg
│
├── build.gradle.kts
├── settings.gradle.kts
└── README.md

A estrutura acima é uma representação geral. Os diretórios podem variar de acordo com a configuração do projeto.

⚙️ Como executar o projeto

1. Clone o repositório

git clone URL_DO_SEU_REPOSITORIO

2. Abra o projeto

Abra a pasta do projeto no Android Studio.

3. Aguarde a sincronização

Aguarde o Android Studio concluir a sincronização do Gradle e a instalação das dependências necessárias.

4. Execute o aplicativo

Você pode executar o projeto:

em um dispositivo Android físico; ou

em um emulador configurado no Android Studio.

5. Faça uma consulta

Informe um CEP válido, por exemplo:

01001-000

Depois toque em:

Consultar CEP

O aplicativo realizará a consulta e exibirá os dados encontrados.

🧠 Conceitos praticados

Com este projeto foram praticados conceitos importantes de desenvolvimento Android:

Criação de interfaces para aplicativos Android

Programação em Kotlin

Manipulação de componentes de interface

Gerenciamento de eventos de clique

Entrada e validação de dados

Consumo de APIs REST

Requisições HTTP

Processamento de respostas JSON

Uso de coroutines

Organização do código em diferentes classes

Integração entre interface e camada de comunicação com API

📋 Fluxo da aplicação

Usuário
   │
   ▼
Informa o CEP
   │
   ▼
Clica em "Consultar CEP"
   │
   ▼
Aplicativo realiza a requisição
   │
   ▼
API ViaCEP
   │
   ▼
Retorna os dados em JSON
   │
   ▼
Aplicativo processa os dados
   │
   ▼
Informações do endereço
   │
   ├── Logradouro
   ├── Bairro
   ├── Cidade
   ├── UF
   └── DDD

👩‍💻 Desenvolvedora

Karina Amorim

Projeto desenvolvido para fins acadêmicos e de aprendizado em desenvolvimento de sistemas.

📄 Licença

Este projeto foi desenvolvido para fins educacionais.
