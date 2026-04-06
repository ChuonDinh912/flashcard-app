package com.example.flashcardapp.data;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class FlashcardDao_Impl implements FlashcardDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Flashcard> __insertionAdapterOfFlashcard;

  private final EntityDeletionOrUpdateAdapter<Flashcard> __updateAdapterOfFlashcard;

  public FlashcardDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFlashcard = new EntityInsertionAdapter<Flashcard>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `flashcards` (`word`,`definition`,`phonetic`,`partOfSpeech`,`interval`,`repetition`,`easeFactor`,`nextReview`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Flashcard entity) {
        if (entity.getWord() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getWord());
        }
        if (entity.getDefinition() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getDefinition());
        }
        if (entity.getPhonetic() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPhonetic());
        }
        if (entity.getPartOfSpeech() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPartOfSpeech());
        }
        statement.bindLong(5, entity.getInterval());
        statement.bindLong(6, entity.getRepetition());
        statement.bindDouble(7, entity.getEaseFactor());
        statement.bindLong(8, entity.getNextReview());
      }
    };
    this.__updateAdapterOfFlashcard = new EntityDeletionOrUpdateAdapter<Flashcard>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `flashcards` SET `word` = ?,`definition` = ?,`phonetic` = ?,`partOfSpeech` = ?,`interval` = ?,`repetition` = ?,`easeFactor` = ?,`nextReview` = ? WHERE `word` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Flashcard entity) {
        if (entity.getWord() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getWord());
        }
        if (entity.getDefinition() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getDefinition());
        }
        if (entity.getPhonetic() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPhonetic());
        }
        if (entity.getPartOfSpeech() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPartOfSpeech());
        }
        statement.bindLong(5, entity.getInterval());
        statement.bindLong(6, entity.getRepetition());
        statement.bindDouble(7, entity.getEaseFactor());
        statement.bindLong(8, entity.getNextReview());
        if (entity.getWord() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getWord());
        }
      }
    };
  }

  @Override
  public Object insert(final Flashcard flashcard, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFlashcard.insert(flashcard);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final Flashcard flashcard, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfFlashcard.handle(flashcard);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getAll(final Continuation<? super List<Flashcard>> $completion) {
    final String _sql = "SELECT * FROM Flashcards";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Flashcard>>() {
      @Override
      @NonNull
      public List<Flashcard> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfWord = CursorUtil.getColumnIndexOrThrow(_cursor, "word");
          final int _cursorIndexOfDefinition = CursorUtil.getColumnIndexOrThrow(_cursor, "definition");
          final int _cursorIndexOfPhonetic = CursorUtil.getColumnIndexOrThrow(_cursor, "phonetic");
          final int _cursorIndexOfPartOfSpeech = CursorUtil.getColumnIndexOrThrow(_cursor, "partOfSpeech");
          final int _cursorIndexOfInterval = CursorUtil.getColumnIndexOrThrow(_cursor, "interval");
          final int _cursorIndexOfRepetition = CursorUtil.getColumnIndexOrThrow(_cursor, "repetition");
          final int _cursorIndexOfEaseFactor = CursorUtil.getColumnIndexOrThrow(_cursor, "easeFactor");
          final int _cursorIndexOfNextReview = CursorUtil.getColumnIndexOrThrow(_cursor, "nextReview");
          final List<Flashcard> _result = new ArrayList<Flashcard>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Flashcard _item;
            final String _tmpWord;
            if (_cursor.isNull(_cursorIndexOfWord)) {
              _tmpWord = null;
            } else {
              _tmpWord = _cursor.getString(_cursorIndexOfWord);
            }
            final String _tmpDefinition;
            if (_cursor.isNull(_cursorIndexOfDefinition)) {
              _tmpDefinition = null;
            } else {
              _tmpDefinition = _cursor.getString(_cursorIndexOfDefinition);
            }
            final String _tmpPhonetic;
            if (_cursor.isNull(_cursorIndexOfPhonetic)) {
              _tmpPhonetic = null;
            } else {
              _tmpPhonetic = _cursor.getString(_cursorIndexOfPhonetic);
            }
            final String _tmpPartOfSpeech;
            if (_cursor.isNull(_cursorIndexOfPartOfSpeech)) {
              _tmpPartOfSpeech = null;
            } else {
              _tmpPartOfSpeech = _cursor.getString(_cursorIndexOfPartOfSpeech);
            }
            final int _tmpInterval;
            _tmpInterval = _cursor.getInt(_cursorIndexOfInterval);
            final int _tmpRepetition;
            _tmpRepetition = _cursor.getInt(_cursorIndexOfRepetition);
            final double _tmpEaseFactor;
            _tmpEaseFactor = _cursor.getDouble(_cursorIndexOfEaseFactor);
            final long _tmpNextReview;
            _tmpNextReview = _cursor.getLong(_cursorIndexOfNextReview);
            _item = new Flashcard(_tmpWord,_tmpDefinition,_tmpPhonetic,_tmpPartOfSpeech,_tmpInterval,_tmpRepetition,_tmpEaseFactor,_tmpNextReview);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getCardsToReview(final long currentTime,
      final Continuation<? super List<Flashcard>> $completion) {
    final String _sql = "SELECT * FROM Flashcards WHERE nextReview <= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, currentTime);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Flashcard>>() {
      @Override
      @NonNull
      public List<Flashcard> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfWord = CursorUtil.getColumnIndexOrThrow(_cursor, "word");
          final int _cursorIndexOfDefinition = CursorUtil.getColumnIndexOrThrow(_cursor, "definition");
          final int _cursorIndexOfPhonetic = CursorUtil.getColumnIndexOrThrow(_cursor, "phonetic");
          final int _cursorIndexOfPartOfSpeech = CursorUtil.getColumnIndexOrThrow(_cursor, "partOfSpeech");
          final int _cursorIndexOfInterval = CursorUtil.getColumnIndexOrThrow(_cursor, "interval");
          final int _cursorIndexOfRepetition = CursorUtil.getColumnIndexOrThrow(_cursor, "repetition");
          final int _cursorIndexOfEaseFactor = CursorUtil.getColumnIndexOrThrow(_cursor, "easeFactor");
          final int _cursorIndexOfNextReview = CursorUtil.getColumnIndexOrThrow(_cursor, "nextReview");
          final List<Flashcard> _result = new ArrayList<Flashcard>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Flashcard _item;
            final String _tmpWord;
            if (_cursor.isNull(_cursorIndexOfWord)) {
              _tmpWord = null;
            } else {
              _tmpWord = _cursor.getString(_cursorIndexOfWord);
            }
            final String _tmpDefinition;
            if (_cursor.isNull(_cursorIndexOfDefinition)) {
              _tmpDefinition = null;
            } else {
              _tmpDefinition = _cursor.getString(_cursorIndexOfDefinition);
            }
            final String _tmpPhonetic;
            if (_cursor.isNull(_cursorIndexOfPhonetic)) {
              _tmpPhonetic = null;
            } else {
              _tmpPhonetic = _cursor.getString(_cursorIndexOfPhonetic);
            }
            final String _tmpPartOfSpeech;
            if (_cursor.isNull(_cursorIndexOfPartOfSpeech)) {
              _tmpPartOfSpeech = null;
            } else {
              _tmpPartOfSpeech = _cursor.getString(_cursorIndexOfPartOfSpeech);
            }
            final int _tmpInterval;
            _tmpInterval = _cursor.getInt(_cursorIndexOfInterval);
            final int _tmpRepetition;
            _tmpRepetition = _cursor.getInt(_cursorIndexOfRepetition);
            final double _tmpEaseFactor;
            _tmpEaseFactor = _cursor.getDouble(_cursorIndexOfEaseFactor);
            final long _tmpNextReview;
            _tmpNextReview = _cursor.getLong(_cursorIndexOfNextReview);
            _item = new Flashcard(_tmpWord,_tmpDefinition,_tmpPhonetic,_tmpPartOfSpeech,_tmpInterval,_tmpRepetition,_tmpEaseFactor,_tmpNextReview);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
