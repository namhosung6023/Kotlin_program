package com.example.chap09

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.chap09.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var activityResult:ActivityResultLauncher<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        activityResult = registerForActivityResult(ActivityResultContracts.RequestPermission()) {
            if (it) {
                startProcess() // 승인이면 프로그램 진행
            } else {
                finish()
            }
        }

        binding.btnCamera.setOnClickListener {
            activityResult.launch(Manifest.permission.CAMERA)
        }
    }
    fun startProcess() {
        Toast.makeText(this, "카메라를 실행합니다", Toast.LENGTH_LONG).show()
    }
}