package pl.edu.pbs.pumjetnote.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import pl.edu.pbs.pumjetnote.model.Note
import pl.edu.pbs.pumjetnote.util.UUIDConverter
import pl.edu.pbs.pumjetnote.util.DateConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}
