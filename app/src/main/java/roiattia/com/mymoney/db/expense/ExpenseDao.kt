package roiattia.com.mymoney.db.expense

import androidx.lifecycle.LiveData
import androidx.room.*
import roiattia.com.mymoney.db.category.CategoryEntity

@Dao
interface ExpenseDao {

    @Query("SELECT * from expense")
    fun getAllExpenses() : LiveData<List<CategoryEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExpense(expenseEntity: ExpenseEntity)

    @Delete
    suspend fun deleteExpense(expenseEntity: ExpenseEntity)

}