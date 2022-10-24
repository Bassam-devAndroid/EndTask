import java.util.Scanner

fun main()
{
    val reader = Scanner(System.`in`)
    print("Enter Your ID : ")
    val idInput = reader.nextInt()
    val id = ID(idInput)
    id.print()

}


class ID(var id:Int):DR()
{
    fun name(id: Int)
    {
        println("Name:")
        when(id){
            1 -> println("Ahmed")
            2 -> println("Amer")
            3 -> println("Anas")
            4 -> println("Belal")
            5 -> println("Hussein")
        }

    }
    fun material(id: Int)
    {
        println("Material:")
        when(id){
            1 -> println("CS")
            2 -> println("Networking")
            3 -> println("Math")
            4 -> println("CS")
            5 -> println("DS")
        }

    }
    fun materialDegrees(id: Int)
    {
        println("Degree :")
        when(id){
            1 -> println("100")
            2 -> println("50")
            3 -> println("20")
            4 -> println("100")
            5 -> println("50")
        }

    }
    fun print()
    {
        name(id)
        material(id)
        materialDegrees(id)
        nameDr(id)
        DaysOfDr(id)
    }

    fun print(function:()->Unit)
    {
        function()
    }

}


open class DR()
{
    fun nameDr(id: Int)
    {
        println("Prof Name:")
        when(id){

            1 -> println("Prof Adel")
            2 -> println("Prof Omar")
            3 -> println("Prof Khaled")
            4 -> println("Prof Adel")
            5 -> println("Prof Ehab")
        }

    }
    fun DaysOfDr(id: Int)
    {
        println("Days:")
        when(id){
            1 ->
            {
                println("Sunday")
                println("Tuesday")
            }
            2 ->
            {
                println("Saturday")
                println("Monday")
            }
            3 ->
            {
                println("Wednesday")
                println("Thursday")
            }
            4 ->
            {
                println("Sunday")
                println("Tuesday")
            }
            5 ->
            {
                println("Monday")
                println("Tuesday")
            }
        }
    }
}






