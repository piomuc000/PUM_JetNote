package pl.edu.pbs.pumjetnote.di

import androidx.room.Room
import pl.edu.pbs.pumjetnote.data.NoteDatabase
import pl.edu.pbs.pumjetnote.data.NoteDatabaseDao


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideNotesDao(noteDatabase: NoteDatabase): NoteDatabaseDao = noteDatabase.noteDao()

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): NoteDatabase = Room.databaseBuilder(
        context,
        NoteDatabase::class.java,
        "notes_db"
    )
        .fallbackToDestructiveMigration()
        .build()
}