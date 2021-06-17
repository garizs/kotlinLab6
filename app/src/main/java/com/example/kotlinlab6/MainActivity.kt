package com.example.kotlinlab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private var characterListRecyclerView: RecyclerView? = null
    private var characterAdapter: CharacterAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        characterListRecyclerView = findViewById(R.id.character_list)
        characterAdapter = CharacterAdapter()
        characterListRecyclerView?.adapter = characterAdapter

        loadCharacter()
    }

    private fun loadCharacter() {
        NetworkService
            .getApi()
            .getCharacters()
            .enqueue(
                object : Callback<List<CharactersData>> {
                    override fun onFailure(call: Call<List<CharactersData>>, t: Throwable) {
                        throw Exception("Ошибочный ответ от сервера! - $t")
                    }

                    override fun onResponse(
                        call: Call<List<CharactersData>>, response: Response<List<CharactersData>>) {
                        val list = response.body()?.toList() ?: emptyList()
                        characterAdapter?.changeList(list)
                    }

                }
            )
    }
}