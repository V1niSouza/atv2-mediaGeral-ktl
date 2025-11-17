package com.fatec.atv2_mediageral_ktl.model

data class Aluno(
    var nomeAluno: String,
    val notas: MutableList<Double> = mutableListOf()
) {
    fun calcularMedia(): Double {
        if (notas.isEmpty()) return 0.0
        return notas.sum() / notas.size
    }

    fun avaliacaoDesempenho(): String {
        val media = calcularMedia()
        return when {
            media < 6.0 -> "Reprovado"
            media <= 9.0 -> "Aprovado"
            else -> "Ótimo Aproveitamento"
        }
    }
}
