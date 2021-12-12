package domain

class Person(
    private var name: String,
    private var age: Int
) {

    public fun hello() {
        println("========================")
        println("Hello Sub-Domain Person!")
        println("========================")
    }

}