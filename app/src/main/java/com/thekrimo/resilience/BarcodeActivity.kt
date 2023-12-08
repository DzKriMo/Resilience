package com.thekrimo.resilience

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.journeyapps.barcodescanner.CaptureManager
import com.journeyapps.barcodescanner.DecoratedBarcodeView
import com.journeyapps.barcodescanner.BarcodeResult
import com.thekrimo.resilience.databinding.ActivityBarcodeBinding

class BarcodeActivity : AppCompatActivity(), DecoratedBarcodeView.TorchListener {
    private lateinit var binding: ActivityBarcodeBinding
    private lateinit var barcodeView: DecoratedBarcodeView
    private lateinit var captureManager: CaptureManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBarcodeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        barcodeView = binding.barcodeScanner
        barcodeView.setTorchListener(this)
        captureManager = CaptureManager(this, barcodeView)
        captureManager.initializeFromIntent(intent, savedInstanceState)
        captureManager.decode()
    }

    override fun onResume() {
        super.onResume()
        captureManager.onResume()
    }

    override fun onPause() {
        super.onPause()
        captureManager.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        captureManager.onSaveInstanceState(outState)
    }






     fun barcodeResult(result: BarcodeResult?) {
        // Handle barcode result
        result?.let {
            Toast.makeText(this, "Contents = ${it.text}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onTorchOn() {
        TODO("Not yet implemented")
    }

    override fun onTorchOff() {
        TODO("Not yet implemented")
    }
}
