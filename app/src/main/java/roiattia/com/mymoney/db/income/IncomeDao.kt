package roiattia.com.mymoney.db.income

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface IncomeDao {

    @Query("SELECT * from income")
    fun getAllIncome() : LiveData<List<IncomeEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertIncome(incomeEntity: IncomeEntity)

    @Delete
    suspend fun deleteIncome(incomeEntity: IncomeEntity)

}