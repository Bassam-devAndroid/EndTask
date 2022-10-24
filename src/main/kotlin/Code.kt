import java.util.Scanner

fun main()
{
    val reader = Scanner(System.`in`)
    print("Enter Your ID : ")
    val idInput = reader.nextInt()
    val id = ID()
    id.print(idInput)
}


class ID():DR()
{
    var listOfName = listOf<String>("Ahmed","Amer","Anas","Belal","Hussein")
    val listOfSubjects = listOf<String>("NetWorking  100","CS  100","Logic Programming 50")

    fun print(id:Int)
    {
        if (id == 1)
        {
            println("Name:"+listOfName[0])
            println("id : 1")
            println("Subjects :")
            for (i in listOfSubjects)
            {
                println(i)
            }
            println("DR And Days: ")
            for (j in listOfDr)
            {
                println("Prof "+ j)
            }

        }
        if (id == 2)
        {
            println("Name:"+listOfName[1])
            println("id : 2")
            println("Subjects :")
            for (i in listOfSubjects)
            {
                println(i)
            }
            println("DR And Days: ")
            for (j in listOfDr)
            {
                println("Prof "+ j)
            }

        }
        if (id == 3)
        {
            println("Name:"+listOfName[2])
            println("id : 3")
            println("Subjects :")
            for (i in listOfSubjects)
            {
                println(i)
            }
            println("DR And Days: ")
            for (j in listOfDr)
            {
                println("Prof "+ j)
            }

        }
        if (id == 4)
        {
            println("Name:"+listOfName[3])
            println("id : 4")
            println("Subjects :")
            for (i in listOfSubjects)
            {
                println(i)
            }
            println("DR And Days: ")
            for (j in listOfDr)
            {
                println("Prof "+ j)
            }

        }
        if (id == 5)
        {
            println("Name:"+listOfName[4])
            println("id : 5")
            println("Subjects :")
            for (i in listOfSubjects)
            {
                println(i)
            }
            println("DR And Days: ")
            for (j in listOfDr)
            {
                println("Prof "+ j)
            }

        }
        
    }

}


open class DR()
{
    val listOfDr = listOf<String>("Adel Saturday","Ebrahim Sunday","Samir Monday","Khaled Tuesday")
}






