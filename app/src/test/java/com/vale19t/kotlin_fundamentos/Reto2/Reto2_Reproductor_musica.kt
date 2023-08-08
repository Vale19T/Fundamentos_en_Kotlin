package com.vale19t.fundamentos_kotlin.Reto2

class Reto2_Reproductor_musica {
}
fun main() {
    var res=1
    var i=0
    val album = arrayOf("Bebe","Rolex","Vida de rico","Manos de tijera","Tuyo y mio","Ropa Cara","Mareado","KESI","Machu pichu","Millones","5 pa las 12")
    println("Música de Camilo Echeverry")
    println("Menú")
    println("1. Saber todas las canciones del álbum")
    println("2. Tipo de música del álbum")
    println("3. Información de cada canción por el álbum")
    println("4. Cantidad de reproducciones del albúm")
    println("5. Canción más popular")
    println("6. Canción menos popular")


    do{
        println("Seleccione la opción a realizar, según el número")
        var eleccion = readLine()!!.toInt()

        if (eleccion==1){
            println("Las canciones del álbum son: ")
            println(album.joinToString())
        }else if(eleccion==2){
            println("EL tipo de música del álbum Mis manos es Urbano latino, pop y bachata")
        }else if(eleccion==3){
            println("El álbum cuenta con 11 canciones, fue lanzado el 4 de marzo de 2021. Con las participaciones de Evaluna Montaner, El Alfa, Mau & Ricky y Los Dos Carnales")
        }else if(eleccion==4){
            println("Número de reproducciones que logro Mis manos fue de 550 millones en Spotify")
        }else if(eleccion==5){
            println("La canción más escuchada de Mis manos fue Millones con un número de reproducciones de 130M")
        }else if(eleccion==6){
            println("La canción menos escuchada de Mis manos fue Manos de tijera con un número de reproducciones de 107M")
        }else{
            println("Usted digito algo erroneo")
        }
        i+=1
        println("¿Desea consultar algo más sobre el álbum?. Digite 1 si si o 0 si no")
        res= readLine()!!.toInt()
    }while(res==1)
}