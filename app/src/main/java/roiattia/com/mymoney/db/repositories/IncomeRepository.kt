package roiattia.com.mymoney.db.repositories

import androidx.lifecycle.LiveData
import roiattia.com.mymoney.db.income.IncomeDao
import roiattia.com.mymoney.db.income.IncomeEntity

class IncomeRepository(private val incomeDao: IncomeDao) {

    val getAllIncome: LiveData<List<IncomeEntity>> = incomeDao.getAllIncome()

    suspend fun insertIncome(incomeEntity: IncomeEntity){
        incomeDao.insertIncome(incomeEntity)
    }
}