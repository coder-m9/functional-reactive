/*
 * 
 */
package com.functional;
import io.reactivex.*;
import java.util.*;

public class App {

    List<String> myList =
    Arrays.asList("Java", "Javascript", "C", "Go", "C++");


	public void getGreeting(){
	Flowable.just("Hello world").subscribe(System.out::println);
	}
   
    public static void main(String[] args) {
       
	new App().getGreeting();	

	// Functional composition and pipeline
    new App().myList
    .stream()
    .filter(s -> s.startsWith("J"))
    .map(String::toUpperCase)
    .sorted()
    .forEach(System.out::println);
    
	}
}
