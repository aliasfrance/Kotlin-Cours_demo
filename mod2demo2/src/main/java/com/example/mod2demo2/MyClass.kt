package com.example.mod2demo2

data class BaseballTeam(
    var name: String,
    var nbPlayer: Int = 22,
    var division: String
)

class CookingRecipe(
    private var _name: String,
    var ingredients: List<String>,
    var cookingTime: Int = 0
) {
    var name : String
        get() = this._name
        set(value) {
            this._name = value
        }

    fun displayIngredientsList(){
        println("List des ingrédients : ")
        for (ingredient in this.ingredients){
            println(ingredient)
        }
    }

    override fun toString(): String {
        return "$name se prépare en $cookingTime minutes"
    }
}

fun main() {

    val b1 = BaseballTeam(
        division = "World series",
        name = "Los Angeles Dodgers",
        // nbPlayer = 22
    )

    val c1 = CookingRecipe(
        _name = "Cookies",
        ingredients = listOf("Sucre", "Beurre", "Chocolat", "Farine", "Oeuf")
    )

    //println(b1.toString())

    c1.name = "Hachis parmentier"
    println(c1.toString())
    c1.displayIngredientsList()

}