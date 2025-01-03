package com.sulistyo.mongo.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sulistyo.mongo.database.entity.ImageToDelete

@Dao
interface ImageToDeleteDao {

    @Query("SELECT * FROM images_to_delete_table ORDER BY id ASC")
    suspend fun getAllImages(): List<ImageToDelete>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addImageToDelete(imageToDelete: ImageToDelete)

    @Query("DELETE FROM images_to_delete_table WHERE id=:imageId")
    suspend fun cleanupImage(imageId: Int)
}