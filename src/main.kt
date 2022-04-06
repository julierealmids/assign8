fun main(){
    odds(1)
    people(arrayOf("julliet","julierealmids","getrude","nakayiza","namusoke"))
    Drinks(10)
    numbers()





}
fun odds(nums: Int) {
    for (nums in 1..100) {
        if ((nums % 2) !== 0) {
            println(nums)

        }
    }

}
fun people(names:Array<String>):Int{
    var sum=0
    names.forEach { name ->
        if (name.length>5)
            sum++
    }
    return sum
}
fun Drinks(personage:Int){

    if ( personage<6){
        println("Takes a glass of milk")
    }
    else if (personage>6 && personage <15){
        println("Takes a bottle of orange fanta ")
    }
    else{
        println("Takes a bottle of coke")
    }
}

fun numbers() {
    for (nums in 1..100)
        if ((nums%3)==0){
            println("fizz")
        }
        else if ((nums%5)==0){
            println("buzz")
        }
        else {
            if (nums%3==0 && nums% 5 ==0){
                println("fizzbuzz")
            }
            else {
                println(nums)
            }
        }
}






