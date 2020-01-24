package roiattia.com.mymoney.db

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import roiattia.com.mymoney.db.category.CategoryDao
import roiattia.com.mymoney.db.expense.ExpenseDao
import roiattia.com.mymoney.db.income.IncomeDao
import roiattia.com.mymoney.db.payment.PaymentDao
import roiattia.com.mymoney.utils.Constants.Companion.DB_NAME

public abstract class AppDatabase : RoomDatabase() {

    abstract fun CategoryDao(): CategoryDao

    abstract fun ExpenseDao(): ExpenseDao

    abstract fun IncomeDao(): IncomeDao

    abstract fun PaymentDao(): PaymentDao

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context:Context): AppDatabase{
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DB_NAME
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}