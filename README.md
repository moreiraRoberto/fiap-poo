# Projeto FiapRide - Roberto Marques Moreira

## Informações do Aluno

- **Nome:** Roberto Marques Moreira
- **RM:** 564935
- **Turma:** 2CCPW
- **Curso:** 2º ano de Ciência da Computação
- **GitHub:** https://github.com/moreiraRoberto/poo-fiapride-roberto-marques-moreira.git

---

## Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, onde desenvolvemos o sistema **FiapRide** (aplicativo de mobilidade urbana) e implementamos um ecossistema paralelo voltado ao controle e consumo de água.
Criei como meu objeto do mundo real uma GarrafaAgua, e meu objetivo inicial era simular um sistema que auxilia usuários no controle de sua hidratação diária. 



## Checklist de Implementação

- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces

---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos
**Pergunta:** Por que precisamos criar uma classe `Passageiro`? Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0`? Pense: E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?

**Resposta:**
Criar variáveis soltas não possui escalabilidade arquitetural. Uma classe atua como uma planta (molde) que encapsula dados e comportamentos pertencentes à mesma entidade. Em um cenário com milhões de usuários, a classe garante que todo objeto `Passageiro` instanciado na memória possua rigorosamente a mesma estrutura. Isso permite a criação de listas e o gerenciamento organizado do estado da aplicação, eliminando a redundância e a desorganização de gerenciar milhões de variáveis primitivas e desconexas no escopo global.

---

### Aula 2 - Métodos
**Pergunta:** Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo + 100` diretamente no código principal, por que dá tanto trabalho criar um método específico chamado `adicionarSaldo(valor)` para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?

**Resposta:**
Alterar atributos diretamente anula a integridade dos dados e o controle transacional. O método `adicionarSaldo(valor)` atua como um guardião do estado do objeto. Se o saldo fosse público, qualquer desenvolvedor poderia injetar lógicas arbitrárias ou valores inválidos (como saldos negativos) em qualquer parte do sistema. Ao centralizar a operação em um método, a classe detém o controle total da regra de negócio, permitindo validar entradas, aplicar taxas e garantir a consistência financeira da aplicação de forma padronizada.

---

### Aula 3 - Encapsulamento
**Pergunta:** No nosso código, os atributos são `private`, mas os métodos `getSaldo()` e `getNome()` são `public`. Por que é seguro deixar o `get` público, mas perigoso deixar o atributo original público? Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um documento seu, e entregar o documento ORIGINAL para a pessoa rasurar?

**Resposta:**
O método `get` aplica o princípio do Ocultamento de Informação. Ele concede acesso de leitura (retornando uma cópia do valor), mas bloqueia a alteração de estado. Expor o atributo original permitiria a reatribuição irrestrita do ponteiro na memória (escrita não validada). É a diferença entre permitir que o sistema consulte uma informação de forma segura e abrir brechas para que o estado interno do objeto seja corrompido ou sobrescrito sem validação.

---

### Aula 4 - Construtores
**Pergunta:** Na nossa classe `Veiculo`, nós tomamos duas decisões arquitetônicas muito importantes: 1) Nós não criamos o método `setModelo()`. 2) O `setPlaca()` foi criado como privado, e criamos um método público chamado `atualizarPlaca()` para acessá-lo. Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em 'Gerar Getters e Setters para tudo' automaticamente na sua IDE? Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica?

**Resposta:**
Gerar "Setters" irrestritamente fere a imutabilidade de atributos que definem a identidade de um objeto. O `setModelo()` foi omitido porque, fisicamente, um veículo não muda de modelo após fabricado. Quanto à placa, torná-la privada impede alterações diretas no banco de dados da aplicação. O método `atualizarPlaca()` obriga a execução de um processo sistêmico (como simular um trâmite no Detran ou disparar logs de auditoria), impedindo *bypasses* lógicos e protegendo o sistema contra fraudes.

---

### Aula 5 - Associação
**Pergunta:** No construtor da `Viagem`, nós exigimos o objeto inteiro (`Passageiro solicitante`). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a String do nome no construtor da Viagem (`String nomeDoPassageiro`) em vez do objeto todo? Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa descontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro dela?

**Resposta:**
A String "Ana Silva" é apenas um texto estático sem conexão com a instância real do passageiro. A associação (passagem por referência do objeto inteiro) é obrigatória para que a `Viagem` mantenha o vínculo com o espaço de memória correto. Ao receber o objeto `Passageiro solicitante`, a `Viagem` torna-se capaz de invocar os métodos de negócio desse passageiro, descontando o saldo diretamente da conta original assim que a corrida for finalizada, garantindo o sincronismo dos dados.

---

### Aula 6 - Herança
**Pergunta:** No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `private`. Quando o `Carro` herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de `Carro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super()` ou o `setPlaca()`. Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo?

**Resposta:**
O Java protege o Encapsulamento. O modificador `private` determina que a variável pertence exclusivamente ao escopo léxico da classe onde foi declarada, independentemente de haver uma relação genealógica. Se a classe filha tivesse acesso de escrita direto aos atributos privados da mãe, as validações e regras de negócio construídas na superclasse (dentro dos *setters*) poderiam ser ignoradas sumariamente. O uso obrigatório do `super()` ou dos métodos padronizados mantém a integridade do estado da classe original.

---

### Aula 7 - Polimorfismo
**Pergunta:** No nosso loop `for (Veiculo veiculo : frota)`, a variável `veiculo` é do tipo genérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia()` lá na classe mãe `Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do `Carro` e da `Moto`? Por que o contrato precisa existir na base da hierarquia?

**Resposta:**
Não, não conseguiríamos chamá-lo. No laço for (Veiculo veiculo : frota), a variável veiculo foi declarada explicitamente como pertencente ao tipo Veiculo. Quando você tenta executar veiculo.calcularAutonomia(), o compilador inspeciona única e exclusivamente a classe Veiculo. Se o método não for encontrado na estrutura da classe mãe, ocorrerá um erro.

---

### Aula 8 - Classes Abstratas
**Pergunta:** Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico, sem ser carro, moto, caminhão ou nada disso? Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? Por que ele não deduz isso sozinho? Pense: Se esquecermos de colocar `abstract`, qual o risco que corremos? Alguém pode criar `new Veiculo()` e quebrar a lógica do nosso sistema?

**Resposta:**
No mundo real o ‘Veículo’ não tem forma física, é um agrupamento de características comuns como placa e modelo que temos.
O Java não deduz sozinho porque o compilador não tem esse compreendimento do mundo real sem declararmos.
E acredito que se o abstract for omitido, seria a perda da integridade do sistema, porque em qualquer parte do código se pode por um new Veiculo.


---

### Aula 9 - Interfaces
**Pergunta:** Por que Java permite herança simples (apenas uma mãe), mas múltipla implementação de interfaces (vários contratos)? Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo (herança múltipla), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar()`? Como as interfaces resolvem esse problema?

**Sua Resposta:**
O Java proíbe a herança múltipla de classes para evitar o "Problema do Diamante".
Como colocou no exemplo da TV e do radio, em CarroEletrico herdasse código funcional tanto de Veiculo quanto de Bateria, e ambas possuíssem um método concreto ligar(), o compilador entraria em colapso lógico ao tentar decidir qual dos dois blocos de código deveria ser executado na chamada do método.
As interfaces resolvem esse conflito porque elas transmitem apenas a "assinatura" do método (o contrato a ser cumprido), e não o comportamento (a implementação lógica).


---

## Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)
**Qual foi o domínio que você escolheu para seu projeto pessoal?**

Sistema para Controle de Consumo de Água e Gestão de Utilitários de Consumo. Foi desenvolvida uma hierarquia orientada a objetos (Classe mãe abstrata `GarrafaAgua` com filhas concretas `GarrafaSqueeze` e `GarrafaTermica`), demonstrando herança, polimorfismo, sobrescrita de métodos abstratos baseados na utilidade física dos recipientes, e implementação de uma interface transversal de negócios (`Vendavel`).

O momento mais desafiador foi criar na aula 9 uma interface que conecta-se os projetos, por isso criei a interface vendável porque no meu raciocínio Carro e GarrafaTermica compartilham uma característica comercial no mundo real: ambos são bens de consumo e podem ser anunciados para venda.
