package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val fred = Gerente(nome = "Fred", cpf = "123.123.123-11", 5000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(fred)

    TesteAutenticacao().autentica(fred)
}

