package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // null check option 1 this exclusive works where ‘nullableVariable’ is immutable

        val nullCheckofString: String? = "Hello World"
        if (nullCheckofString != null && nullCheckofString.length > 0) {
            print("String of length ${nullCheckofString.length}")
        } else {
            print("Empty string")
        }


       // null check option 2

        val l = if (nullCheckofString != null) nullCheckofString.length else -1



        //Difference between Safe calls(?) and null check

        // null check option 3

        val StringVariable: String? = null
        println(StringVariable?.length)

        //This calls the method if the property is not null or returns null if that property is null without throwing an NPE (null pointer exception).


    /* lateinit means late initialization. If you do not want to initialize a variable in the constructor instead you want to initialize it later on and if you can guarantee the initialization before using it,
    then declare that variable with lateinit keyword.
    It will not allocate memory until initialized */

         lateinit var courseName: String
        // demo function to get course name using the courseId
       // fun fetchCourseName(courseId: String) {
         //   courseName = courseRepository.getCourseName(courseId)
            // this is an example, you can add other suff according to your usecase
       // }


         //lazy key word

    /*

   Lazy keyword is use to delay the  whole class creation process.

   class SomeClass {
    private val heavyObject: HeavyClass by lazy {
        println("Heavy Object initialised")
        HeavyClass()
    }
     */

    }

}