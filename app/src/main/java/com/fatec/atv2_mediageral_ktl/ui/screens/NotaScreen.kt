package com.fatec.atv2_mediageral_ktl.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fatec.atv2_mediageral_ktl.model.Aluno
import com.fatec.atv2_mediageral_ktl.ui.components.InputNomeAluno
import com.fatec.atv2_mediageral_ktl.ui.components.InputNotaAluno
import com.fatec.atv2_mediageral_ktl.ui.components.ResultadoNota


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotaScreen() {
    val alunoState = remember {
        mutableStateOf(Aluno(nomeAluno = "", notas = mutableListOf(0.0, 0.0, 0.0)))
    }
    var aluno by alunoState

    var nomeInput by remember { mutableStateOf(aluno.nomeAluno) }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Média Geral",
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                    )
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        }) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
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