fun main(){

    one()

    two()

    three()


    var calc1 = Calculator(50,9.2)
    calc1.add()
    calc1.subtract()
    calc1.divide()
    calc1.multiply()


}

//1. Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length. (4 pts)
fun one(x:String,y:String):String{
    var string1 = "x"
    var string2 = "y"
    when("x".length=="y".length) return "x".[0] ,"y".[0]
    while ("x".length >= "y".length)
        return




}


//2. Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements (7 pts)
fun two(j:Int,k:Int):Double{
    var j = arrayOf(1,3,78,95,34,7,10,6)
     j.sort()
    var smallest = j[0]
    var largest = j[8]
    var average =


}


//3. Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output. (3 pts)
fun three(){
    var name = "Susan"
    println("Susan".)
}


//4. Write and call a function that takes in an array of strings, joins them all into
//one string and returns it. (4 pts)
fun four (){

}



//5. Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions
class Calculator(var q:Int,var r:Double ):Double{
    fun add(){
         println(q+r)
    }
    fun subtract(){
        println(q-r)
    }
    fun divide(){
        println(q/r)
    }

    fun multiply(){
        println(q*r)
    }

}