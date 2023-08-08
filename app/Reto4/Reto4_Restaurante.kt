package com.vale19t.fundamentos_kotlin.Reto4

class Reto4_Restaurante {
}

fun main() {
    var res=1
    var i=0
    val entradas = mutableListOf("Ceviche cremoso","Nachos al horno","Bastoncitos de polenta")
    val platos_fuertes = mutableListOf("Salmón con salsa hoisin y de ostras","Tofu sellado con quinua bicolor","Lasagna de quesos maduros y vegetales")
    val postres= mutableListOf("Tarta Vianner"," Panna Cotta","Milhojas de fresa")
    val bebidas= mutableListOf("Limonada de coco","Vino blanco", "Mimosa de sandia")
    println("Menú del resturante Santorini Garden")
    println("1. Visualizar todos los platos del menú")
    println("2. Saber las categorias del menú")
    println("3. Agregar un plato a una categoria del menú")
    println("4. Modificar un plato del menú")
    println("5. Eliminar un plato del menú")
    println("Digite el número de la opción a realizar")
    var opcion= readLine()!!.toInt()
    do {
        if (opcion==1){
            println("Las entradas de Santorini Garden son: ")
            println(entradas.joinToString())
            println("Los platos fuertes de Santorini Garden son: ")
            println(platos_fuertes.joinToString())
            println("Los postres de Santorini Garden son: ")
            println(postres.joinToString())
            println("Las bebidas de Santorini Garden son: ")
            println(bebidas.joinToString())
        }else if (opcion==2){
            println("Las categorias del menú son entradas, platos fuertes, postres y bebidas ")
        }else if (opcion==3){
            println("Por favor digite el nombre de la categoria a agregar el nuevo plato (entradas, platos fuertes, postres y bebidas)")
            var cat= readLine()!!.toString()
            if (cat=="entradas"){
                println("Ingrese el nuevo plato")
                var entrada_p= readLine()!!.toString()
                entradas.addAll(listOf(entrada_p))
                println("La categoria con el plato nuevo")
                println(entradas.joinToString())
            }else if (cat=="platos fuertes"){
                println("Ingrese el nuevo plato")
                var fuerte_p= readLine()!!.toString()
                platos_fuertes.addAll(listOf(fuerte_p))
                println("La categoria con el plato nuevo")
                println(platos_fuertes.joinToString())
            }else if (cat=="postres"){
                println("Ingrese el nuevo plato")
                var postres_p= readLine()!!.toString()
                postres.addAll(listOf(postres_p))
                println("La categoria con el plato nuevo")
                println(postres.joinToString())
            }else if (cat=="bebidas"){
                println("Ingrese el nuevo plato")
                var bebidas_p= readLine()!!.toString()
                bebidas.addAll(listOf(bebidas_p))
                println("La categoria con el plato nuevo")
                println(bebidas.joinToString())
            }else{
                println("Categoria errada")
            }
        }else if (opcion==4){
            println("Por favor digite el nombre de la categoria a modificar el plato (entradas, platos fuertes, postres y bebidas)")
            var mod= readLine()!!.toString()
            if (mod=="entradas"){
                println("Ingrese el plato")
                var entrada_p= readLine()!!.toString()
                entradas.set( 0, entrada_p)
                println("La categoria con el plato modificado")
                println(entradas.joinToString())
            }else if (mod=="platos fuertes"){
                println("Ingrese el plato")
                var fuerte_p= readLine()!!.toString()
                platos_fuertes.set(1, fuerte_p)
                println("La categoria con el plato modificado")
                println(platos_fuertes.joinToString())
            }else if (mod=="postres"){
                println("Ingrese el plato")
                var postres_p= readLine()!!.toString()
                postres.set(1, postres_p)
                println("La categoria con el plato modificado")
                println(postres.joinToString())
            }else if (mod=="bebidas"){
                println("Ingrese el plato")
                var bebidas_p= readLine()!!.toString()
                bebidas.set(2, bebidas_p)
                println("La categoria con el plato modificado")
                println(bebidas.joinToString())
            }else{
                println("Categoria errada")
            }
        }else if (opcion==5){
            println("Por favor digite el nombre de la categoria para eliminar el plato (entradas, platos fuertes, postres y bebidas)")
            var mod= readLine()!!.toString()
            if (mod=="entradas"){
                entradas.removeAt( 0)
                println("La categoria con el plato eliminado")
                println(entradas.joinToString())
            }else if (mod=="platos fuertes"){
                platos_fuertes.removeAt(1)
                println("La categoria con el plato eliminado")
                println(platos_fuertes.joinToString())
            }else if (mod=="postres"){
                postres.removeAt(1)
                println("La categoria con el plato eliminado")
                println(postres.joinToString())
            }else if (mod=="bebidas"){
                bebidas.removeAt(2)
                println("La categoria con el plato eliminado")
                println(bebidas.joinToString())
            }else{
                println("Categoria errada")
            }
        }else{
            println("La opción digitada en errada")
        }

        i+=1
        println("¿Desea realizar algo más en el menú?. Digite 1=si o 0=no")
        res= readLine()!!.toInt()
    }while (res==1)
}