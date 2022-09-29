package com.pk4us.object_oriented_programming.anonymousСlass

class Sportsman {
    fun invokeWaterBoy(waterBoy: WaterBoy){
        waterBoy.bringWater()
    }
    inline fun invokeWaterBoy(bringWater: () -> Unit){
        bringWater()
    }
}