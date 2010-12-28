package com.sagetech.contactmanager

class Skill {
    String name
    String description
    static hasMany = [person:Person]
    static belongsTo = Person
    static constraints = {
	name(blank:false, unique:true)
	description(nullable:true, maxSize:800)
    }

    String toString() {
	name	
    }
}
