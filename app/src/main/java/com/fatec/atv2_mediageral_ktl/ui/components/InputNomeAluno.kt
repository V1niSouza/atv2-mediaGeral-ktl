package com.fatec.atv2_mediageral_ktl.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Composable
fun InputNomeAluno(nome: String, onNomeChange: (String) -> Unit) {
    Text("Nome do aluno:", fontWeight = FontWeight.Medium, fontSize = 18.sp)
    OutlinedTextField(
        value = nome,
        onValueChange = onNomeChange,
        label = { Text("Nome do aluno") },
        modifier = Modifier.fillMaxWidth()
    )
}