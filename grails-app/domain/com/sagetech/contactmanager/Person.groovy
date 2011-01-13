package com.sagetech.contactmanager

class Person {
    String firstName
    String lastName
    String description
    String phoneNumber
    String emailAddress
    transient String fullName
    static hasMany = [ lastContacted:LastContacted, skills:Skill, employments:Employment ]
    static mappedBy = [employments:"employee"]

    static constraints = {
	firstName(blank:false, maxSize:80)
	lastName(blank:false, maxSize:80)
	fullName(unique:true)
	description(nullable:true, blank:false, maxSize:800)
	phoneNumber(blank:true, nullable:true)
	emailAddress(blank:true, nullable:true)
    }

    static mapping = {
	table 'people'
	firstName column:'First_Name'
	lastName column:'Last_Name'
    }

    String getFullName() {
	toString()
    }

    String toString() {
	"$firstName $lastName"
    }
}
