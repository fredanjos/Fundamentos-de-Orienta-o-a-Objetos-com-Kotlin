package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val fred = Analista(nome = "Fred", cpf = "123.123.123-11", 2000.0)
    ImprimeRelatorioFuncionario.imprime(fred)


}
