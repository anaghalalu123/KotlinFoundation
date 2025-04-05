package com.example.kotlinquizapp



fun main() {
    var score = 0

    println("🧠 Welcome to the Kotlin Mini Quiz!")
    println("----------------------------------")

    // Question 1
    println("1️⃣ What is the capital of France?")
    println("a) Berlin\nb) Madrid\nc) Paris\nd) Rome")
    print("Your answer: ")
    val answer1 = readLine()?.lowercase()
    if (answer1 == "c") {
        println("✅ Correct!\n")
        score++
    } else {
        println("❌ Wrong. The correct answer is: c) Paris\n")
    }

    // Question 2
    println("2️⃣ Which planet is known as the Red Planet?")
    println("a) Earth\nb) Mars\nc) Venus\nd) Jupiter")
    print("Your answer: ")
    val answer2 = readLine()?.lowercase()
    if (answer2 == "b") {
        println("✅ Correct!\n")
        score++
    } else {
        println("❌ Wrong. The correct answer is: b) Mars\n")
    }

    // Question 3
    println("3️⃣ What is the result of 5 + 3 * 2?")
    println("a) 16\nb) 11\nc) 13\nd) 10")
    print("Your answer: ")
    val answer3 = readLine()?.lowercase()
    if (answer3 == "b") {
        println("✅ Correct!\n")
        score++
    } else {
        println("❌ Wrong. The correct answer is: b) 11\n")
    }

    // Final Score
    println("🎯 Your Score: $score out of 3")
    when (score) {
        3 -> println("🏆 Excellent!")
        2 -> println("👍 Good job!")
        1 -> println("🙂 Keep practicing.")
        else -> println("😅 Better luck next time.")
    }
}
