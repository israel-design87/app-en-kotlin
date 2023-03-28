package com.example.androidisrael.todoapp

data class Task(val name:String, val category:TaskCategory,var isSelected:Boolean = false) {
}