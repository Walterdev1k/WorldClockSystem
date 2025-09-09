# World Clock System

Sistema de gerenciamento de relógios para diferentes fusos horários e formatos, implementado em Java JDK 21.

## 📋 Descrição

Este projeto implementa uma hierarquia de classes para criação de relógios com diferentes formatos:
- **Relógio Brasileiro**: Formato 24 horas (00:00:00 até 23:59:59)
- **Relógio Americano**: Formato 12 horas AM/PM (01:00:00 AM até 12:59:59 PM)

## 🏗️ Estrutura do Projeto
WorldClockSystem/
├── src/
│ └── worldclocksystem/
│ ├── Clock.java (Classe abstrata base)
│ ├── BrazilianClock.java (Implementação brasileira)
│ ├── AmericanClock.java (Implementação americana)
│ ├── ClockMenu.java (Menu interativo)
│ └── Main.java (Classe principal)
├── README.md
└── .gitignore


## 🚀 Funcionalidades

- ✅ Configuração individual de cada relógio
- ✅ Exibição dos horários atuais
- ✅ Ajuste automático entre relógios
- ✅ Validação de valores (hora, minuto, segundo)
- ✅ Menu interativo amigável
- ✅ Tratamento de exceções

## 🛠️ Tecnologias Utilizadas

- Java JDK 21 (Corretto)
- Paradigma de Orientação a Objetos
- Herança e Polimorfismo
- Tratamento de exceções

## 📦 Como Executar

1. Clone o repositório:
```bash
git clone <url-do-repositorio>

2.Compile o projeto:
javac -d bin src/worldclocksystem/*.java
3. Execute o programa:
java -cp bin worldclocksystem.Main

🎮 Como Usar

Selecione a opção para configurar um relógio

Digite os valores de hora, minuto e segundo

Use as opções de exibição para ver os horários

Use as opções de ajuste para sincronizar os relógios

Digite 6 para sair do sistema

📝 Notas de Implementação
O relógio americano converte automaticamente horas de 24 para 12 horas

Todas as entradas são validadas conforme as regras de cada relógio

O método ajustarRelogio() permite a sincronização entre diferentes implementações

👨‍💻 Autor
Desenvolvido como parte de um sistema de gerenciamento de relógios mundiais.




