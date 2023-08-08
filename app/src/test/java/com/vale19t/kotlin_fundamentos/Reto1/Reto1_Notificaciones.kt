package com.vale19t.fundamentos_kotlin.Reto1

class Reto1_Notificaciones {
}

fun main() {
    println("Averiguemos las notificaciones de tu dispositivo")
    val notificaciones = 1..150
    var notificacion = notificaciones.random()
    if(notificacion<=100){
        println("La cantidad exacta de notificaciones es $notificacion")
    }else if(notificacion>100){
        println("Sus notificaciones son mas de 99+ ($notificacion)")
    }else if(notificacion==0){
        println("No hay notificaciones en el momento.")
    }else{
        println("Datos erroneos")
    }
}