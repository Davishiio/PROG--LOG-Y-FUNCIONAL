class FunFunction {
    var porciento1 = 5
    private var porciento2 = 9
    val porciento3 =13


    /*Es pura por que devuelve un valor que depende de sus argumentos  */
    fun add(a:Int, b:Int): Int = a+b
    /*es una función pura, el hecho de que siempre devuelve el mismo valor hace los argumentos son irrelevantes */
    fun mult(a:Int, b:Int?): Int = 5
    /*no es puro porque generará una excepción si el divisor es 0 */
    fun div(a:Int, b:Int): Int = a/b


    /*Es pura, como usa Double no generará un error al dividir por 0 */
    fun dic(a:Int, b:Int): Double=a/b

    /*No es una funcion pura */
    fun apliPorciento1(a:Int): Int = a/100 * (100 + porciento1)
    /*Es una funcion pura */
    fun apliPorciento2(a:Int): Int = a/100 * (100 + porciento2)
    /*No es pura */
    fun apliPorciento3(a:Int): Int = a/100 * (100 + porciento3)

    /*No es una funcion pura */
    fun agrega(i:Int, list:     MutableList<Int>):List<Int>{
        list.add(i)
        return list
    }
    /*Es pura */
    fun agrega2(i:Int, list : List<Int>) = list +i
}   
