import java.text.DecimalFormat

var radio = 0.00
var area = 0.00
var circunferecia = 0.00
var areapulg = 0.00
var circunfericapulg = 0.00
val pi = 3.14159265359
fun main()
{


    println("ingrese el radio en centimetros ")
    val radio= readLine()!!.toDouble()
    val formato = "#,###.00"
    funcionarea(radio)
    funcionperimetro(radio)

    println("""
        *** centimetros ***
        Area             |${DecimalFormat(formato).format(area)}
        circunferencia   |${DecimalFormat(formato).format(circunferecia)}
        
          *** pulgadas ***
        Area             |${DecimalFormat(formato).format(areapulg)}
        circunferencia   |${DecimalFormat(formato).format(circunfericapulg)}
        redio ${radio}
        
    """.trimIndent())
}

fun funcionarea(radio : Double)
{
    area =  (pi * radio * radio).toDouble()
    areapulg = (area * 0.155).toDouble()
}

fun funcionperimetro(radio:Double)
{
    circunferecia = (pi * 2 * radio ).toDouble()
    circunfericapulg = (circunferecia * 0.393701).toDouble()

}