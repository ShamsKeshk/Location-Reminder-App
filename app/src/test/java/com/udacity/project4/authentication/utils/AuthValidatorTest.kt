package com.udacity.project4.authentication.utils

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
internal class AuthValidatorTest{


    @Test
    fun isEmailValid_emptyState_returnFalse(){
        //Given
        val email = ""

        //When
        val isValidEmail = AuthValidator.isEmailValid(email)

        //Then
        assertEquals(isValidEmail,false)
    }

    @Test
    fun isEmailValid_nullState_returnFalse(){
        //Given
        val email = null

        //When
        val isValidEmail = AuthValidator.isEmailValid(email)

        //Then
        assertEquals(isValidEmail,false)
    }

    @Test
    fun isEmailValid_inValidEmail_returnFalse(){
        //Given
        val email = "124234@ASDF"

        //When
        val isValidEmail = AuthValidator.isEmailValid(email)

        //Then
        assertEquals(isValidEmail,false)
    }

    @Test
    fun isEmailValid_ValidEmail_returnTrue(){
        //Given
        val email = "124@gmail.com"

        //When
        val isValidEmail = AuthValidator.isEmailValid(email)

        //Then
        assertEquals(isValidEmail,true)
    }

    //-------- Password Test Cases --------- //
    @Test
    fun isPasswordValid_emptyState_returnFalse(){
        //Given
        val password = ""

        //When
        val isValidPassword = AuthValidator.isPasswordValid(password)

        //Then
        assertEquals(isValidPassword,false)
    }

    @Test
    fun isPasswordValid_nullState_returnFalse(){
        //Given
        val password = null

        //When
        val isValidPassword = AuthValidator.isPasswordValid(password)

        //Then
        assertEquals(isValidPassword,false)
    }

    @Test
    fun isPasswordValid_inValidPassword_returnFalse(){
        //Given
        val password = "124234"

        //When
        val isValidPassword = AuthValidator.isPasswordValid(password)

        //Then
        assertEquals(isValidPassword,false)
    }

    @Test
    fun isPasswordValid_ValidPassword_returnTrue(){
        //Given
        val password = "1234567"

        //When
        val isValidPassword = AuthValidator.isPasswordValid(password)

        //Then
        assertEquals(isValidPassword,true)
    }

}