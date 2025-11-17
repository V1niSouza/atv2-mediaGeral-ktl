package com.fatec.atv2_mediageral_ktl.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun InputNotaAluno(notas: MutableList<Double>, onNotaChange: (Int, Double) -> Unit) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text("Lançamento de Notas", fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(10.dp))

        notas.forEachIndexed { index, nota ->
            val nomeNota = "TP${index + 1}"

            OutlinedTextField(
                value = if (nota == 0.0 && notas.size == 3) "" else nota.toString(),
                onValueChange = { novoValor ->
                    val notaParsed = novoValor.toDoubleOrNull() ?: 0.0
                    val notaValidada = notaParsed.coerceIn(0.0, 10.0)
                    onNotaChange(index, notaValidada)
                },
                label = { Text(nomeNota) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            )
        }
    }
}