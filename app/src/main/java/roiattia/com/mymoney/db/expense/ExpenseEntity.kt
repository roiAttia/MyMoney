package roiattia.com.mymoney.db.expense

import androidx.room.*
import androidx.room.ForeignKey.CASCADE
import roiattia.com.mymoney.db.category.CategoryEntity
import java.util.*

@Entity(
    tableName = "expense",
    foreignKeys = [ForeignKey(
        entity = CategoryEntity::class,
        parentColumns = arrayOf("category_id"),
        childColumns = arrayOf("category_id"),
        onDelete = CASCADE)],
    indices = [Index("category_id")])
class ExpenseEntity (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "expense_id")
    val id : Int,
    @ColumnInfo(name = "category_id")
    val categoryId : Int,
    val name : String,
    val totalAmount : Double,
    val numberOfPayments: Int,
    val chargeDate : Date)