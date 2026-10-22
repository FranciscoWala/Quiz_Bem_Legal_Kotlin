package com.example.quizdesafio.respostas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuizViewModel: ViewModel() {
    private val _respostaCorreta = MutableLiveData<String>()
    val respostaCorretaMod: LiveData<String> = _respostaCorreta

    fun onRespostaChanged (novoValor: String) {
        _respostaCorreta.value = novoValor
    }
}