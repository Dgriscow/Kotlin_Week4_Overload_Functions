fun main() {

    //determine the users Type
    println("What Kind Of User Are You?: " +
            "\n1: Residential\n2: Business")

    val userChoice = readln().toInt()

    if (userChoice == 1){
        //RESIDENTIAL
        println("What is your name?")
        val name = readln()

        println("What is your Phone Number?")
        val phoneNumber = readln()

        //call the "search" function using the user parameters
        customerSearch(name, phoneNumber)

    }else if (userChoice == 2){
        //Business
        println("What is the name of the Business?")
        val bisName = readln()

        println("What Is the Contact Number for the Business?")
        val contactNumber = readln()

        println("What is the Name of the Contact?")
        val contactName = readln()
        //use the Business parameters
        customerSearch(contactName, contactNumber, bisName)



    }else{
        println("Invalid User Type")
    }



}

//Residential Parameters
fun customerSearch(name:String, phoneNum:String){
    println("$name\n$phoneNum")
}


//Business Parameters
fun customerSearch(name:String, phoneNum:String, buisName:String){
    println("$buisName\n$name\n$phoneNum")
}
