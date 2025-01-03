package com.sulistyo.mongo.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.sulistyo.util.Constant

@Entity(tableName = Constant.IMAGES_TO_DELETE_TABLE)
data class ImageToDelete(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val remoteImagePath: String
)
