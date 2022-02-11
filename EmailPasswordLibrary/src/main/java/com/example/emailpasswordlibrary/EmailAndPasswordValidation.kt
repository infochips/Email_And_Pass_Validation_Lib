package com.example.emailpasswordlibrary

import java.util.regex.Matcher
import java.util.regex.Pattern

class EmailAndPasswordValidation {

    fun isValidPassword(password: String): Boolean {

        val pattern: Pattern
        val matcher: Matcher

        val password_pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$"
        pattern = Pattern.compile(password_pattern)
        matcher = pattern.matcher(password)

        return matcher.matches()
    }

    fun isValidEmail(email: String): Boolean {

        val pattern: Pattern
        val matcher: Matcher

        val password_pattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
        pattern = Pattern.compile(password_pattern)
        matcher = pattern.matcher(email)

        return matcher.matches()
    }

}