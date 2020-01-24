package roiattia.com.mymoney.db.expense

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import roiattia.com.mymoney.db.category.CategoryEntity
import java.util.*

@Entity(
    tableName = "expense",
    foreignKeys = [ForeignKey(
        entity = CategoryEntity::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("categoryId"),
        onDelete = CASCADE)])
class ExpenseEntity (

    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val categoryId : Int,
    val name : String,
    val totalAmount : Double,
    val numberOfPayments: Int,
    val chargeDate : Date)