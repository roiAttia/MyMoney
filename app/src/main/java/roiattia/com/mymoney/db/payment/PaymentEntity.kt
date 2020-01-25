package roiattia.com.mymoney.db.payment

import androidx.room.*
import roiattia.com.mymoney.db.expense.ExpenseEntity
import java.util.*

@Entity(
    tableName = "payment",
    foreignKeys = [ForeignKey(
        entity = ExpenseEntity::class,
        parentColumns = arrayOf("expense_id"),
        childColumns = arrayOf("expense_id"),
        onDelete = ForeignKey.CASCADE)],
    indices = [Index("expense_id")])
class PaymentEntity (

    @PrimaryKey(autoGenerate = true)
    val id : Int,
    @ColumnInfo(name = "expense_id")
    val expenseId : Int,
    val amount : Double,
    val chargeDate : Date)