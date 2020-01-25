package roiattia.com.mymoney.db.income

import androidx.room.*
import roiattia.com.mymoney.db.category.CategoryEntity
import java.util.*

@Entity(
    tableName = "income",
    foreignKeys = [ForeignKey(
        entity = CategoryEntity::class,
        parentColumns = arrayOf("category_id"),
        childColumns = arrayOf("category_id"),
        onDelete = ForeignKey.CASCADE)],
    indices = [Index("category_id")])
class IncomeEntity (

    @PrimaryKey(autoGenerate = true)
    val id : Int,
    @ColumnInfo(name = "category_id")
    val categoryId : Int,
    val name : String,
    val amount : Double,
    val receiveDate : Date)