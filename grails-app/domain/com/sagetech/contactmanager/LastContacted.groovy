package com.sagetech.contactmanager

class LastContacted {
    Date dateOfContact;
    String description
    
    static belongsTo = [person:Person]
    static constraints = {
	dateOfContact(blank:false)
	description(blank:false, maxSize:500)
    }

    String toString() {
	dateOfContact
    }
}
