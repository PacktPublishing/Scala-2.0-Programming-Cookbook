package com.cookbook.templogger.temp

object  TempConverter{

def fahrenheitToCelsius(fah: Double): Double = {
    (fah - 32) * 0.5556
  }

}
