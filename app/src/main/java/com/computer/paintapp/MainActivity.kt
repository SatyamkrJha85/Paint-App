package com.computer.paintapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.computer.paintapp.CanvasView.CanvasView.CanvasView
import com.computer.paintapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var canvasView : CanvasView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        canvasView = binding.canvasView

        binding.apply {
            colorButton.setOnClickListener {
                canvasView.setColor()
            }
            clearButton.setOnClickListener {
                canvasView.clearCanvas()
            }
        }
    }
}