package com.vale19t.fundamentos_kotlin.Reto3

class Reto3_Subasta {
}

fun main() {
    var res=1
    var i=0
    val subasta = arrayOf("Comedor", "Silla", "Televisor", "Almohada", "Reloj", "PLayStation", "Computador", "Licuadora", "AirFryer")
    var producto = subasta.random()
    var precio_casa=(1..1000).random()
    var jugador = (1..1000).random()
    println("¡Empecemos la  subasta!")
    println("¿Desea participar en la subasta?(1=si o 0=no)")
    var decision = readLine()!!.toInt()

    do {
        if (decision==1){
            println("El producto a subastar es $producto y su precio inicial es $precio_casa")
            println("¿Desea ofertar por el producto? (si=si o no=no)")
            var product = readLine()!!.toString()
            if (product=="si"){
                println("El precio del otro ofertante es $jugador")
                println("Ingrese su precio oferta por $producto")
                var oferta= readLine()!!.toInt()
                if(oferta>jugador){
                    println("$producto es suyo")
                }else if(oferta<jugador){
                    println("$producto es del otro ofertante")
                }else if(oferta==jugador){
                    println("$producto es de la casa")
                }
            }
        }else if (decision==0){
            println("Usted no participa en la ronda de la subasta")
        }else{
            println("Usted ingreso una opción erronea")
        }
        i+=1
        println("¿Desea comprar algo mas en la subasta?. Digite 1=si o 0=no")
        res= readLine()!!.toInt()
    }while(res==1)
}