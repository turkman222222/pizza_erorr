import kotlin.system.exitProcess

fun nmain() {
    val SPB = SPB;
   println("Добрый день! Выберите город")
   println("1. москва \n2. санктпетербург\n")
   val city = readln()
   if (city == "1") {

   }else if (city == "2")
   {

   }else{
       println("ERROR")
       exitProcess(status = 1)
   }
}