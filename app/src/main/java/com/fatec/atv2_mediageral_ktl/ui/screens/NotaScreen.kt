package com.fatec.atv2_mediageral_ktl.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fatec.atv2_mediageral_ktl.model.Aluno
import com.fatec.atv2_mediageral_ktl.ui.components.InputNomeAluno
import com.fatec.atv2_mediageral_ktl.ui.components.InputNotaAluno
import com.fatec.atv2_mediageral_ktl.ui.components.ResultadoNota


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotaScreen() {
    val alunoState = remember {
        mutableStateOf(Aluno(nomeAluno = "Aluno Exemplo", notas = mutableListOf(0.0, 0.0, 0.0)))
    }
    var aluno by alunoState

    var nomeInput by remember { mutableStateOf(aluno.nomeAluno) }

    Scaffold(topBar = { TopAppBar(title = { Text("📝 Gestão de Notas") }) }) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            InputNomeAluno (
                nome = nomeInput,
                onNomeChange = { novoNome ->
                    nomeInput = novoNome
                    aluno = aluno.copy(nomeAluno = novoNome)
                }
            )

            Spacer(modifier = Modifier.height(20.dp))

            InputNotaAluno(
                notas = aluno.notas,
                onNotaChange = { index, novaNota ->
                    val novasNotas = aluno.notas.toMutableList()
                    novasNotas[index] = novaNota

                    aluno = aluno.copy(notas = novasNotas.toMutableList())
                }
            )

            Spacer(modifier = Modifier.height(30.dp))
            Divider()
            Spacer(modifier = Modifier.height(30.dp))

            ResultadoNota(aluno = aluno)
        }
    }
}