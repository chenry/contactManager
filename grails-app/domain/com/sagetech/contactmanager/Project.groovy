package com.sagetech.contactmanager

class Project {
    String name;
    String description;
    Person businessOwner
    static hasMany = [workLogs:WorkLogEntry]
    static constraints = {
	name(blank:false, maxSize:80)
	description(blank:false, maxSize:800)
    }

    String toString() {
	"${name}"
    }
}
