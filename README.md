# World Clock System 🌎⏰

Sistema de gerenciamento de relógios para diferentes fusos horários, desenvolvido em Java JDK 21.

## 📋 Descrição

Este projeto implementa uma hierarquia de classes para criação de relógios com diferentes formatos:
- **Relógio Brasileiro**: Formato 24 horas (00:00:00 até 23:59:59)
- **Relógio Americano**: Formato 12 horas AM/PM (01:00:00 AM até 12:59:59 PM) com diferença de 1 hora em relação a Brasília

## 🚀 Funcionalidades

- ✅ Configuração individual de cada relógio
- ✅ Exibição dos horários atuais
- ✅ Ajuste automático entre relógios
- ✅ Validação de valores (hora, minuto, segundo)
- ✅ Menu interativo amigável
- ✅ Tratamento de exceções
- ✅ Diferença de 1 hora entre Brasília e Washington

## 🏗️ Estrutura do Projeto
WorldClockSystem/
├── src/
│ └── worldclocksystem/
│ ├── Clock.java (Classe abstrata base)
│ ├── BrazilianClock.java (Implementação brasileira - 24h)
│ ├── AmericanClock.java (Implementação americana - 12h AM/PM)
│ ├── ClockMenu.java (Menu interativo)
│ ├── Main.java (Classe principal)
│ └── PaisFusoHorario.java (Enum de fusos horários)
├── .gitignore
└── README.md

text

## 🛠️ Tecnologias Utilizadas

- Java JDK 21 (Corretto)
- Paradigma de Orientação a Objetos
- Herança e Polimorfismo
- Tratamento de exceções

## 📦 Como Executar

### Pré-requisitos
- Java JDK 21 instalado
- Git (para clonar o repositório)

### Compilação e Execução
```bash
# Clone o repositório
git clone https://github.com/Walterdev1k/WorldClockSystem.git
cd WorldClockSystem

# Compile o projeto
javac -d bin src/worldclocksystem/*.java

# Execute a aplicação
java -cp bin worldclocksystem.Main
🎮 Como Usar
Configurar Relógio Brasileiro: Define horário no formato 24h

Configurar Relógio Americano: Define horário convertido para 12h AM/PM

Exibir Horários Atuais: Mostra ambos os relógios

Ajustar entre relógios: Sincroniza os relógios automaticamente

Sair: Finaliza a aplicação

Exemplo de Uso
text
Brasil: 18:17:30  →  EUA: 05:17:30 PM
👨‍💻 Autor
Walter Dev

GitHub: @Walterdev1k

Email: walterdev1k81@hotmail.com

📄 Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

🤝 Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para:

Reportar issues

Sugerir novas funcionalidades

Enviar pull requests

