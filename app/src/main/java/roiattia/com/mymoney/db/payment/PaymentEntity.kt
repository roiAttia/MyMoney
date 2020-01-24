package roiattia.com.mymoney.db.payment

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import roiattia.com.mymoney.db.expense.ExpenseEntity
import java.util.*

@Entity(
    tableName = "payment",
    foreignKeys = [ForeignKey(
        entity = ExpenseEntity::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("expenseId"),
        onDelete = ForeignKey.CASCADE)])
class PaymentEntity (

    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val expenseId : Int,
    val amount : Double,
    val chargeDate : Date)