package com.example.factorypatterndemo

sealed class Environment {
    object Production : Environment()
    object Stage : Environment()
    object Testing : Environment()
}