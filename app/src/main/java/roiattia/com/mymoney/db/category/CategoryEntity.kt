package roiattia.com.mymoney.db.category

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "category")
class CategoryEntity (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "category_id")
    val id : Int,
    val name :String)