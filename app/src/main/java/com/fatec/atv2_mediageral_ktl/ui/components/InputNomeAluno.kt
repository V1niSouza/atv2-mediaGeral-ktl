package com.fatec.atv2_mediageral_ktl.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun InputNomeAluno(nome: String, onNomeChange: (String) -> Unit) {
    OutlinedTextField(
        value = nome,
        onValueChange = onNomeChange,
        label = { Text("Nome Completo do Aluno") },
        modifier = Modifier.fillMaxWidth()
    )
}