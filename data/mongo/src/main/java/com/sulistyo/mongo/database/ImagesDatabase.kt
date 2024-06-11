package com.sulistyo.mongo.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sulistyo.mongo.database.entity.ImageToDelete
import com.sulistyo.mongo.database.entity.ImageToUpload

@Database(
    entities = [ImageToUpload::class, ImageToDelete::class],
    exportSchema = false,
    version = 1
)
abstract class ImagesDatabase : RoomDatabase() {
    abstract fun imagesToUploadDao(): ImageToUploadDao
    abstract fun imagesToDeleteDao(): ImageToDeleteDao
}