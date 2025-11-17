package com.fatec.atv2_mediageral_ktl.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fatec.atv2_mediageral_ktl.model.Aluno


@Composable
fun ResultadoNota(aluno: Aluno) {
    val media = aluno.calcularMedia()
    val status = aluno.avaliacaoDesempenho()

    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Text(
                text = "Aluno: ${aluno.nomeAluno}",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(10.dp))

            Text("TP1: ${aluno.notas.getOrElse(0) { 0.0 }}")
            Text("TP2: ${aluno.notas.getOrElse(1) { 0.0 }}")
            Text("TP3: ${aluno.notas.getOrElse(2) { 0.0 }}")

            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "Média Geral: ${"%.2f".format(media)}",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "Status Final: $status",
                fontSize = 22.sp,
                fontWeight = FontWeight.ExtraBold,
                color = when (status) {
                    "Reprovado" -> Color.Red
                    "Ótimo Aproveitamento" -> Color(0xFF00C853)
                    else -> Color(0xFF00B0FF)
                }
            )
        }
    }
}