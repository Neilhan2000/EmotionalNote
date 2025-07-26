package com.ashley.neil.emotionalnote

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform