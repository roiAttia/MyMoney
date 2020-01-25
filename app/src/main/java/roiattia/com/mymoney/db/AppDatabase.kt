package roiattia.com.mymoney.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import roiattia.com.mymoney.db.category.CategoryDao
import roiattia.com.mymoney.db.category.CategoryEntity
import roiattia.com.mymoney.db.expense.ExpenseDao
import roiattia.com.mymoney.db.expense.ExpenseEntity
import roiattia.com.mymoney.db.income.IncomeDao
import roiattia.com.mymoney.db.income.IncomeEntity
import roiattia.com.mymoney.db.payment.PaymentDao
import roiattia.com.mymoney.db.payment.PaymentEntity
import roiattia.com.mymoney.utils.Constants.Companion.DB_NAME

@Database(entities = [
    IncomeEntity::class,
    ExpenseEntity::class,
    CategoryEntity::class,
    PaymentEntity::class],
    version = 1, exportSchema = false)
@TypeConverters(Converters::class)
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