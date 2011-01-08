package com.sagetech.contactmanager

import java.text.SimpleDateFormat;

class LastContacted {
    Date dateOfContact;
    String description
    String shortDesc;
    
    static belongsTo = [person:Person]
    static constraints = {
	dateOfContact(blank:false)
	shortDesc(blank:false)
	description(blank:false, maxSize:500)
    }

    String toString() {
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy")
	shortDesc + " " + sdf.format(dateOfContact)
    }
}
