# Atividade 1 - Programação com Múltiplas Threads

## 📌 Descrição
Este projeto consiste na implementação de programas concorrentes utilizando **threads**.  
A atividade é dividida em dois exercícios principais e um desafio adicional, que devem ser implementados em **C ou Java** e posteriormente reimplementados em **Go**.

---

## 🚀 Exercícios

### 🔹 Exercício 1: Minha Primeira Thread
Criar e executar duas threads:
- **Thread 1:** imprime os números de **1 a 10** com intervalo de **1 segundo**.
- **Thread 2:** imprime os números de **10 a 1** (ordem decrescente) também com intervalo de **1 segundo**.
- Ambas devem ser executadas simultaneamente, com a `main` aguardando a finalização.

**Objetivos:**
- Praticar a criação de threads.
- Executar processos concorrentes.
- Sincronizar a execução utilizando `join`.

---

### 🔹 Exercício 2: Simulação de Conta Bancária
Simular operações de uma conta bancária em ambiente multithreaded, garantindo a consistência dos dados.

**Especificações:**
1. Criar uma estrutura/classe `ContaBancaria` com campo para **saldo**.
2. Implementar métodos para **depositar**, **sacar** e **consultar saldo**.
3. Instanciar a conta com saldo inicial de **R$ 1000**.
4. Criar duas threads:
   - Uma realiza **100 depósitos** de R$ 200.
   - Outra realiza **100 saques** de R$ 200.
5. Ao final, o saldo esperado deve ser **R$ 1000**.

**Objetivos:**
- Entender condições de corrida.
- Implementar sincronização correta em operações críticas.

---

### 🔹 Desafio Adicional
Após concluir os exercícios em **C ou Java**, reimplemente em **Go**:
- Aumente o número de operações (ex: **100.000 depósitos/saques**) até gerar **condição de corrida**.
- Utilize mecanismos de sincronização como **mutex** ou **synchronized** para garantir **thread-safety**.

---

## 📂 Estrutura do Projeto
```
/Atividade-Threads
│── /java          # Implementação em Java
│── /c             # Implementação em C
│── /go            # Implementação em Go
│── README.md      # Documentação do projeto
```

---

## 🛠️ Tecnologias Utilizadas
- **Java / C** → Implementações iniciais.
- **Go** → Reimplementação com foco em concorrência.
- **Threads, Mutex, Synchronization**.

---

## ▶️ Como Executar
### Java
```bash
cd java
javac Exercicio1.java Exercicio2.java
java Exercicio1
java Exercicio2
```

### C
```bash
cd c
gcc exercicio1.c -o exercicio1 -lpthread
./exercicio1

gcc exercicio2.c -o exercicio2 -lpthread
./exercicio2
```

### Go
```bash
cd go
go run exercicio1.go
go run exercicio2.go
```

---

## 📖 Aprendizados
- Conceitos fundamentais de **concorrência e paralelismo**.
- Diferenças entre execução sequencial e multithread.
- Tratamento de **condições de corrida**.
- Uso de mecanismos de **sincronização** em diferentes linguagens.
