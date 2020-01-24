package roiattia.com.mymoney.db.category

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "category")
class CategoryEntity (

    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name :String)