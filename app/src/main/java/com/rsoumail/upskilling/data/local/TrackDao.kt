package com.rsoumail.upskilling.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * Interface for database access on trackSearchResult related operations.
 */
@Dao
abstract class TrackDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(result: TrackSearchResult)

    @Query("SELECT * FROM TrackSearchResult WHERE `query`  = :query")
    abstract fun search(query: String): LiveData<TrackSearchResult>

}