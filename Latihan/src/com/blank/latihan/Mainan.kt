package com.blank.latihan

fun main() {
    val pilihan = arrayOf("gunting", "batu", "kertas")
    var komputer = pilihan.random()
    println("Siapa nama kamu?")
    var namaPlayer = readLine()
    println("Hi, $namaPlayer !! Selamat datang di permainan gunting, batu, kertas")
    println("Masukan Antara (Gunting,Batu, Kertas) ")
    print("Input : ")

    var player = readLine()
    var status = false

    if (player!!.toLowerCase().equals(komputer.toLowerCase())) {
        println("Seri $komputer dengan $player")
    }
    else if (player.toLowerCase().equals("batu")) {
        if(komputer.toLowerCase().equals("gunting")){
            status = true
            hasil(status,player,komputer)
        }else{
            status = false
            hasil(status,player,komputer)
        }
    }
    else if (player.toLowerCase().equals("gunting")) {
        if (komputer.toLowerCase().equals("kertas")) {
            status = true
            hasil(status,player,komputer)
        } else {
            status = false
            hasil(status,player,komputer)
        }
    }
    else if (player.toLowerCase().equals("kertas")) {
        if (komputer.toLowerCase().equals("batu")) {
            status = true
            hasil(status,player,komputer)
        } else {
            status = false
            hasil(status,player,komputer)
        }
    }
}

fun hasil(status: Boolean, p1: String, p2: String) {
    if (status) {
        println("Kamu Menang!! $p1 mengalahkan $p2")
    } else {
        println("Yah.. Kamu Kalah!! $p2 mengalahkan $p1")

    }
}

