package com.sagetech.contactmanager

class Skill {
    String name
    String description
    static constraints = {
	name(blank:false, unique:true)
	description(nullable:true, maxSize:800)
    }
}
