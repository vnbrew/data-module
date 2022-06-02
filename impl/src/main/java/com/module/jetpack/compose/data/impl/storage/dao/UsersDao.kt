package com.module.jetpack.compose.data.impl.storage.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.module.jetpack.compose.data.impl.storage.entity.StoredUser
import kotlinx.coroutines.flow.Flow

@Dao
interface UsersDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(images: List<StoredUser>)

    @Query("SELECT * FROM user_table")
    fun getImages(): Flow<List<StoredUser>>

    @Query("DELETE FROM user_table WHERE `id` = :userId")
    suspend fun deleteByQuery(userId: String)
}