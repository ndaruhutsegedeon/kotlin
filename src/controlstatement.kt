fun main(args: Array<String>) {

    var age=17
    if(age>=18){

        println("you are eligible to vote")

    }else{
        println("sorry you cant vote.")
    }
    var num=3
    if (num%2==0){
        println("$num is even number")

    }else{
        println("$num is an old number")
    }
    val marks=70

    if (marks>=80 && marks<=100){
        println("you are scored an A")

}else if (marks>=60 && marks<=79){
    println("you have a B")

}else if (marks>=40 && marks<=59){
    println("you are scored a C")

    }else if (marks>=0 && marks<=39){
        println("you are fail")
    }else{
        println("wrong in put")
    }
}