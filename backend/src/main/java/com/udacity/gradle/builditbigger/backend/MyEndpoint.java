package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.example.javajokesupplier.Joke;
//import com.udacity.gradle.Joke;
//import com.example.gradle.Joke;
//import com.example.gradle.Joke;

import javax.inject.Named;

import sun.rmi.runtime.Log;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)

public class MyEndpoint {

    /** A simple endpoint joke method that takes retrieves a joke */
    @ApiMethod(name = "getJokeBean")
    public MyBean getJokeBean() {
        Joke jokeClass=new Joke();
        MyBean response = new MyBean();
        String joke=jokeClass.getJoke();
        response.setJoke(joke);

        return response;
    }

//public class MyEndpoint {
//
//    /** A simple endpoint method that takes a name and says Hi back */
//    @ApiMethod(name = "sayHi")
//    public MyBean sayHi(@Named("name") String name) {
//        MyBean response = new MyBean();
//        response.setData("Hi, " + name);
//
//        return response;
//    }
//
//}



}
