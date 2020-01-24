package roiattia.com.mymoney.db.category

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CategoryDao {

    @Query("SELECT * from category")
    fun getAllCategories() : LiveData<List<CategoryEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategory(category : CategoryEntity)

    @Delete
    suspend fun deleteCategory(category: CategoryEntity)
}