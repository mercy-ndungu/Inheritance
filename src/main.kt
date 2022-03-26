// Today i am learning inheritance.
fun main(){
    var x =banker("Kiki", 23)
    var y = Farmer("Effence", 22)
    var z = Doctor("Grace", 19)
   y.cultivateLand()
    z.talk("Hey there")
    z.treatPatient("Jsame", "pneumonia")
    y.eat()

}
open class Person(var name: String, var age: Int){
    open fun talk(word:String) {
        println(word)
    }
   open fun eat(){
        println("yumm")
    }
    open fun sleep(){
        println("zzzzzzz")
    }
}
open class banker( name: String,  age:Int): Person(name, age){

    fun countMoney(notes: Array<Int>):Int{
        var sum = 0
        notes.forEach { kes ->
            sum=+kes
        }
        return sum
    }
}
open class Doctor( name: String, age:Int): Person(name, age){
    fun treatPatient(patient:String, disease:String){
        println("Treating $patient for $disease")
    }
}

open class Farmer(name: String, age: Int): Person(name, age){

    fun cultivateLand(){
        println("dig dig dig")
    }

    override fun eat() {
        super.eat()
        println("I am eating all the food that i have grown.")
    }
}

