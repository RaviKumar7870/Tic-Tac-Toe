package com.example.tictac

import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

import kotlinx.android.synthetic.main.friends.*
import java.util.*
import kotlin.collections.ArrayList

class Friends : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.friends)
        button36.setOnClickListener {
            val intent26 = Intent(this,MainActivity::class.java)
            startActivity(intent26)
        }
    }




    fun btn_Click(view: View){
        val buSelected = view as Button

        var Position = 0
        when(buSelected.id){
            R.id.btn_1 -> Position = 1
            R.id.btn_2 -> Position = 2
            R.id.btn_3 -> Position = 3
            R.id.btn_4 -> Position = 4
            R.id.btn_5 -> Position = 5
            R.id.btn_6 -> Position = 6
            R.id.btn_7 -> Position = 7
            R.id.btn_8 -> Position = 8
            R.id.btn_9 -> Position = 9
        }
        //Toast.makeText(this, "Cell ID"+ cellID, Toast.LENGTH_SHORT).show()
        playerGame(Position,buSelected)
    }
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activePlayer = 1
    private fun playerGame(cellID:Int,buSelected:Button){
        if (activePlayer == 1){
            buSelected.text = "X"

//foreground="@android:drawable/ic_dialog_info"
            //foreground="@android:drawable/ic_delete"

            buSelected.setTextColor(Color.parseColor("#6cff03"))

            player1.add(cellID)
            activePlayer = 2
        }else{
            buSelected.text = "0"
            buSelected.setTextColor(Color.parseColor("#EDF61234"))
            player2.add(cellID)
            activePlayer = 1
        }
        buSelected.isEnabled = false
        checkWinner()
    }
    private fun checkWinner(){
        var winner = -1
        if (player1.contains(1) and player1.contains(2) and player1.contains(3)){
            winner = 1
        }
        if (player2.contains(1) and player2.contains(2) and player2.contains(3)){
            winner = 2
        }
        if (player1.contains(4) and player1.contains(5) and player1.contains(6)){
            winner = 1
        }
        if (player2.contains(4) and player2.contains(5) and player2.contains(6)){
            winner = 2
        }
        if (player1.contains(7) and player1.contains(8) and player1.contains(9)){
            winner = 1
        }
        if (player2.contains(7) and player2.contains(9) and player2.contains(9)){
            winner = 2
        }
        if (player1.contains(1) and player1.contains(5) and player1.contains(9)){
            winner = 1
        }
        if (player2.contains(1) and player2.contains(5) and player2.contains(9)){
            winner = 2
        }
        if (player1.contains(3) and player1.contains(5) and player1.contains(7)){
            winner = 1
        }
        if (player2.contains(7) and player2.contains(5) and player2.contains(3)){
            winner = 2
        }
        if (player1.contains(1) and player1.contains(4) and player1.contains(7)){
            winner = 1
        }
        if (player2.contains(1) and player2.contains(4) and player2.contains(7)){
            winner = 2
        }
        if (player1.contains(2) and player1.contains(5) and player1.contains(8)){
            winner = 1
        }
        if (player2.contains(2) and player2.contains(5) and player2.contains(8)){
            winner = 2
        }
        if (player1.contains(3) and player1.contains(6) and player1.contains(9)){
            winner = 1
        }
        if (player2.contains(3) and player2.contains(6) and player2.contains(9)){
            winner = 2
        }
        if (winner != -1) {
            if (winner == 1) {
                Toast.makeText(this, "Player 1 Won The Game", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Player 2 Won The Game", Toast.LENGTH_LONG).show()
            }
        }


    }


}