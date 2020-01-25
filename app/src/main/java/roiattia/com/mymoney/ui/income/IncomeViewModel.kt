package roiattia.com.mymoney.ui.income

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import roiattia.com.mymoney.db.AppDatabase
import roiattia.com.mymoney.db.income.IncomeDao
import roiattia.com.mymoney.db.income.IncomeEntity
import roiattia.com.mymoney.db.repositories.IncomeRepository

class IncomeViewModel(application: Application) : AndroidViewModel(application) {

    private val incomeRepository: IncomeRepository

    init {
        val incomeDao = AppDatabase.getDatabase(application).IncomeDao()
        incomeRepository = IncomeRepository(incomeDao)
    }

    fun insertIncome(incomeEntity: IncomeEntity) = viewModelScope.launch {
        incomeRepository.insertIncome(incomeEntity)
    }
}
