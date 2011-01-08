package com.sagetech.contactmanager

class Company {
    String name
    static hasMany = [skills:Skill, employments:Employment]
    static constraints = {
	name(blank:false, unique:true, maxSize:80)
    }

    String toString() {
	name
    }
}
