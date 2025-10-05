# RELATÓRIO DE PROJETO – Estratégias de Branching em Git
## Identificação
- **Integrantes da equipe**:
- João Miguel
- Lucas Cassiano
- Pedro Vinicius
- **Repositório GitHub**: https://github.com/JoaoFaria-dev/Projeto-Gerencia
## 1. Estrutura Inicial
- Criamos o repositório com a branch principal main.
- Em seguida, criamos a branch develop a partir de main.
- Comandos utilizados
```bash
git init calculadora
cd calculadora
git checkout -b main
git remote add origin https://github.com/JoaoFaria-dev/Projeto-Gerencia
git push -u origin main
git checkout -b develop
git push -u origin develop
```

## 2. Fase 1 – Git Flow
### 2.1 Features
Features criadas por cada integrante:

- Lucas Cassiano:

    - branch ```feature/soma``` → classe ```Soma.java```
    ![Figura 1 – Branch feature/soma](https://github.com/JoaoFaria-dev/Projeto-Gerencia/blob/main/Assets/Soma.jpg?raw=true)

    - branch ```feature/subtracao``` → classe ```Subtracao.java```
    ![Figura 2 – Branch feature/subtração](https://github.com/JoaoFaria-dev/Projeto-Gerencia/blob/main/Assets/Subtra%C3%A7%C3%A3o.jpg?raw=true)

    - branch ```feature/calculadora``` → classe ```Calculadora.java```
    ![Figura 3 – Branch feature/calculadora](https://github.com/JoaoFaria-dev/Projeto-Gerencia/blob/main/Assets/Calculadora.jpg?raw=true)


- João Miguel:

    - branch ```feature/multiplicacao``` → classe ```Multiplicacao.java```
    ![Figura 4 – Branch feature/multiplicação](https://github.com/JoaoFaria-dev/Projeto-Gerencia/blob/main/Assets/Multiplica%C3%A7%C3%A3o.jpg?raw=true)

    - branch ```feature/divisao``` → classe ```Divisao.java```
    ![Figura 5 – Branch feature/divisão](https://github.com/JoaoFaria-dev/Projeto-Gerencia/blob/main/Assets/Divis%C3%A3o.jpg?raw=true)

- Pedro Vinicius:

    - branch ```feature/potencia``` → classe ```Potencia.java```
    ![Figura 6 – Branch feature/potência](https://github.com/JoaoFaria-dev/Projeto-Gerencia/blob/main/Assets/Pot%C3%AAncia.jpg?raw=true)

    - branch ```feature/raiz``` → classe ```Raiz.java```
    ![Figura 7 – Branch feature/raiz](https://github.com/JoaoFaria-dev/Projeto-Gerencia/blob/main/Assets/Raiz.jpg?raw=true)

### 2.2 Conflitos
- Branches que geraram conflito na Calculadora:
    - feature/soma
    - feature/divisao
    - feature/potencia

- Resolvemos unindo as chamadas no arquivo final da calculadora:

``` bash
System.out.println("Soma: " + Soma.somar(2,3));
System.out.println("Divisão: " + Divisao.dividir(10,2));
System.out.println("Potência: " + Potencia.potencia(2,3));
```

- Prints dos conflitos:
![Figura 8 – Conflito 1](https://github.com/JoaoFaria-dev/Projeto-Gerencia/blob/main/Assets/Conflito_1.jpg?raw=true)

![Figura 9 – Conflito 2](https://github.com/JoaoFaria-dev/Projeto-Gerencia/blob/main/Assets/Conflito_2.jpg?raw=true)

### 2.3 Release
- Criamos a branch release/2.0 a partir de develop.
- Merge em main, criação da tag v2.0, e depois merge de volta em develop.
### 2.4 Hotfix
- Criamos hotfix/2.0.1 a partir de main.
- Corrigimos erro de divisão por zero em Divisao.java:
- Código Corrigido: 
```java
if (b == 0) throw new IllegalArgumentException("Não pode dividir por zero");
```
- Como foi feito o merge de `main` e `develop`:
```bash
git add .
git commit -m "fix: corrigir tratamento de divisão por zero"
git checkout main
git merge hotfix/2.0.1
git tag v2.0.1
git push origin main --tags
git checkout develop
git merge hotfix/2.0.1
```
### 2.5 Uso de Rebase
- Aplicamos git rebase na branch `feature/multiplicacao`.
- Limpeza do histórico, condensando commits antes do merge em `develop`.
## 3. Fase 2 – Trunk-Based Development
### 3.1 Branches Curtos
- Cada integrante criou uma branch curta a partir de main:
    - Lucas Cassiano: soma-v2 (1 commit)
    - João Miguel: divisao-v2 (2 commits → merge com squash)
    - Pedro Vinicius: raiz-v2 (1 commit)

### 3.2 Squash
- Usamos squash no merge da branch divisao-v2.
- Motivo: condensar 2 commits em um único commit limpo no histórico.
### 3.3 Tag Final
- Criada a tag `v3.0` após todos os merges na main.
- Prints das tags:
![Figura 10 – Print das tags](https://github.com/JoaoFaria-dev/Projeto-Gerencia/blob/main/Assets/Tags.png?raw=true)
## 4. Histórico de Commits
![Figura 11 – Histórico de commits](https://github.com/JoaoFaria-dev/Projeto-Gerencia/blob/main/Assets/Historico_1.jpg?raw=true)
![Figura 12 – Histórico de commits (continuação 1)](https://github.com/JoaoFaria-dev/Projeto-Gerencia/blob/main/Assets/Historico_2.jpg?raw=true)
![Figura 13 – Histórico de commits (continuação 2)](https://github.com/JoaoFaria-dev/Projeto-Gerencia/blob/main/Assets/Historico_3.jpg?raw=true)
![Figura 14 – Histórico de commits (continuação 3)](https://github.com/JoaoFaria-dev/Projeto-Gerencia/blob/main/Assets/Historico_4.jpg?raw=true)
![Figura 15 – Histórico de commits (continuação 4)](https://github.com/JoaoFaria-dev/Projeto-Gerencia/blob/main/Assets/Historico_5.jpg?raw=true)