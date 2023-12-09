package com.thekrimo.resilience

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.zxing.integration.android.IntentIntegrator
import com.thekrimo.resilience.databinding.ActivityBarcodeBinding // Replace with your package name

class BarcodeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBarcodeBinding
    private val REQUEST_CODE_SCAN = 123 // Request code for barcode scanner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBarcodeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Check for camera permission
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CAMERA
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.CAMERA),
                REQUEST_CODE_SCAN
            )
        } else {
            startScanner()
        }
    }

    private fun startScanner() {
        val integrator = IntentIntegrator(this)
        integrator.setPrompt("Scan a barcode")
        integrator.setBeepEnabled(false)
        integrator.setOrientationLocked(false)
        integrator.initiateScan()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        if (result != null) {
            if (result.contents != null) {
                val scannedValue = result.contents // Retrieved barcode value
                val intent = Intent(this, BoycottedActivity::class.java)
                intent.putExtra("BARCODE_VALUE", scannedValue)
                startActivity(intent)
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_CODE_SCAN) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                startScanner()
            } else {
                // Handle permission denied
            }
        }
    }
}

