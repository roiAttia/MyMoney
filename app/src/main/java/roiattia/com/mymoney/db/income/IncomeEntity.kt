package roiattia.com.mymoney.db.income

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import roiattia.com.mymoney.db.category.CategoryEntity
import java.util.*

@Entity(
    tableName = "income",
    foreignKeys = [ForeignKey(
        entity = CategoryEntity::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("categoryId"),
        onDelete = ForeignKey.CASCADE)])
class IncomeEntity (

    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val categoryId : Int,
    val name : String,
    val amount : Double,
    val receiveDate : Date)