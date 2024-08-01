fun mayclass(){

    var name="emobilis"
    println("a learn a coding at$name")
}
fun main(args: Array<String>) {
    mayclass()
    students("tom","john",45)
    students("jane","joel",50)
}

fun addtwonumber(){
    var num1=7
    var num2=9
    println("the sum of $num1 and $num2 is ${num1+num2}")
}
fun students(fname:String,lname:String,age:Int){
    println("student name is $fname $lname and he/she is $age years old")
}