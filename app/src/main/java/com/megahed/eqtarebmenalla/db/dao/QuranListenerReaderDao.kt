package com.megahed.eqtarebmenalla.db.dao

import androidx.room.*
import com.megahed.eqtarebmenalla.db.model.Aya
import com.megahed.eqtarebmenalla.db.model.QuranListenerReader
import kotlinx.coroutines.flow.Flow

@Dao
interface QuranListenerReaderDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertQuranListenerReader(quranListenerReader: QuranListenerReader)

    @Update
    suspend fun updateQuranListenerReader(quranListenerReader: QuranListenerReader)

    @Delete
    suspend fun deleteQuranListenerReader(quranListenerReader: QuranListenerReader)


    @Query("SELECT * FROM quranlistenerreader WHERE id =:id ")
    suspend fun getQuranListenerReaderById(id:String): QuranListenerReader?


    @Query("SELECT * FROM quranlistenerreader WHERE isVaForte=1 ")
    fun getFavoriteQuranListenerReader(): Flow<List<QuranListenerReader>>

    @Query("SELECT * FROM quranlistenerreader ")
    fun getAllQuranListenerReader(): Flow<List<QuranListenerReader>>

}