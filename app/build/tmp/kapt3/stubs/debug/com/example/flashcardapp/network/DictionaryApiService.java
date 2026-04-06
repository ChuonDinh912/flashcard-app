package com.example.flashcardapp.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/flashcardapp/network/DictionaryApiService;", "", "translateWord", "", "client", "sl", "tl", "dt", "word", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface DictionaryApiService {
    
    @retrofit2.http.GET(value = "translate_a/single")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object translateWord(@retrofit2.http.Query(value = "client")
    @org.jetbrains.annotations.NotNull()
    java.lang.String client, @retrofit2.http.Query(value = "sl")
    @org.jetbrains.annotations.NotNull()
    java.lang.String sl, @retrofit2.http.Query(value = "tl")
    @org.jetbrains.annotations.NotNull()
    java.lang.String tl, @retrofit2.http.Query(value = "dt")
    @org.jetbrains.annotations.NotNull()
    java.lang.String dt, @retrofit2.http.Query(value = "q")
    @org.jetbrains.annotations.NotNull()
    java.lang.String word, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}