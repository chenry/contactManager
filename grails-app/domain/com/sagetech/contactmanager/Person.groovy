package com.sagetech.contactmanager

class Person {
    String firstName
    String lastName
    String description
    transient String fullName
    static constraints = {
	firstName(blank:false, maxSize:80)
	lastName(blank:false, maxSize:80)
	fullName(unique:true)
	description(nullable:true, blank:false, maxSize:800)
    }

    String getFullName() {
	"$firstName $lastName"
    }
}
