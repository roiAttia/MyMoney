package roiattia.com.mymoney.db.payment

import androidx.lifecycle.LiveData
import androidx.room.*
import roiattia.com.mymoney.db.income.IncomeEntity

@Dao
interface PaymentDao {

    @Query("SELECT * from payment")
    fun getAllPayments() : LiveData<List<PaymentEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPayment(paymentEntity: PaymentEntity)

    @Delete
    suspend fun deletePayment(paymentEntity: PaymentEntity)

}