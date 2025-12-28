package com.example.lab_week_08.worker

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class ThirdWorker(
    context: Context,
    params: WorkerParameters
) : Worker(context, params) {

    override fun doWork(): Result {
        Thread.sleep(3000)
        return Result.success()
    }
}
