package com.sagetech.contactmanager

class Project {
    String name;
    String description;
    Person businessOwner
    static constraints = {
	name(blank:false, maxSize:80)
	description(blank:false, maxSize:800)
    }
}
