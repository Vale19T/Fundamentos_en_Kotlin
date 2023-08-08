package com.vale19t.fundamentos_kotlin.Reto5

class Reto5_Nequi {
}

fun main() {
    var res=1
    var i=0
    println("¡Vamos a ingresar a Nequi!")
    val saldo_inicial:Int=4500
    println("Es necesario diligenciar el campo de teléfono y contraseña")
    do {
        println("Por favor ingrese su número de telefono (3223969114)")
        var telefono= readLine()!!.toString()
        println("Por favor ingrese su contraseña de 4 digitos (1997)")
        var contrasena = readLine()!!.toInt()

        if(telefono.toLong() == 3223969114 && contrasena == 1997){
            println("Bienvenido a Nequi señorita Valeria, su saldo actual es $saldo_inicial")
            println("Opciones:")
            println("1. Sacar dinero")
            println("2. Enviar dinero")
            println("3. Recargar dinero")
            println("4. Salir de Nequi")
            println("Por favor, seleccione la opción a realizar")
            var opcion = readLine()!!.toInt()
            if (opcion==1){
                println("Existen dos opciones para retirar dinero 1. Cajero y 2.Punto físico, por favor indique con el número de la opción que desea")
                var sacar = readLine()!!.toInt()
                if (sacar==1){
                    println("Por favor digite el valor a sacar")
                    var valor= readLine()!!.toInt()
                    if (valor < 2000){
                        println("No te alcanza el valor para retirar")
                    }else if(valor >=2000){
                        println("Por favor confirme el valor a retirar")
                        var valor_confirmado= readLine()!!.toInt()
                        println("Su código de verificación es 010997")
                    }
                }else if(sacar==2){
                    println("Por favor digite el valor a sacar")
                    var valor= readLine()!!.toInt()
                    if (valor < 2000){
                        println("No te alcanza el valor para retirar")
                    }else if(valor >=2000){
                        println("Por favor confirme el valor a retirar")
                        var valor_confirmado= readLine()!!.toInt()
                        println("Su código de verificación es 010997")
                    }
                }
            }else if(opcion==2){
                println("Por favor digite el número al que desea enviar la plata")
                var numero_envio= readLine()!!.toString()
                println("Por favor digite el valor a enviar")
                var valor_envio= readLine()!!.toInt()
                if (valor_envio>=4500){
                    println("EL valor a enviar supera su saldo, no es posible el envio")
                }else if (valor_envio<4500){
                    var restante= saldo_inicial-valor_envio
                    println("Su envio es exitoso, su salgo actual es $restante")
                }
            }else if(opcion==3){
                println("Por favor, confirme le proceso de recarga (si=si o no=no)")
                var confirmacion = readLine()!!.toString()
                if (confirmacion=="si"){
                    println("Digite el valor a recargar")
                    var recarga= readLine()!!.toInt()
                    var recarga_final = recarga + saldo_inicial
                    println("Su saldo final es $recarga_final")
                }else if (confirmacion=="no"){
                    println("El proceso de recarga finalizó")
                }
            }else if(opcion==4){
                println("Confirme el salir de Nequi (si=si)")
                var salir_confirmacion = readLine()!!.toString()
                if (salir_confirmacion=="si"){
                    println("¡Hasta la próxima!")
                }
            }
        }else if(telefono.toLong() != 3223969114 && contrasena != 1997){
            println("¡UPS! Parece que tus datos de acceso no son correctos, tienes tres intentos más.")
        }else if(telefono.toLong() != 3223969114 && contrasena == 1997){
            println("¡UPS! Parece que tus datos de acceso no son correctos, tienes tres intentos más.")
        }else if(telefono.toLong() == 3223969114 && contrasena!= 1997){
            println("¡UPS! Parece que tus datos de acceso no son correctos, tienes tres intentos más.")
        }else{
            println("Datos erroneos")
        }
        i+=1

        println("¿Desea volver a realizar algún tramite? (si=1 o no=0)")
        var res= readLine()!!.toInt()
    }while(res==1)

}