package example.com.content

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.Table.Dual.autoIncrement

object ReceipesTable: Table() {

    val id = integer("id").autoIncrement()
    val title = varchar("title", 255)
    val description = text("description")
    val preparationTime = integer("preparation_time")
    val ingridients = text("ingridients")
    val steps = text("steps")
    val imageUrl = varchar("image_url", 255)

}

object DatabaseFactory {
    fun init() {
        Database.connect("jdbc:h2:./recipesdb", driver = "org.h2.Driver")
        transaction {
            SchemaUtils.create(ReceipesTable)
        }
    }
}