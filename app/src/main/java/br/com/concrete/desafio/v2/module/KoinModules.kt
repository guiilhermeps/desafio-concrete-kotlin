package br.com.concrete.desafio.v2.module

import br.com.concrete.desafio.v2.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

class KoinModules {
    val mainModules = module {
        viewModel { MainViewModel() }
    }
}