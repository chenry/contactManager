package com.sagetech.contactmanager

import java.text.SimpleDateFormat

class WorkLogEntry {
    Double hoursWorked
    String description
    Person worker
    Project project;
    Date workDate
    
    static constraints = {
	description(nullable:false, blank:false, maxSize:800)
    }

    String toString() {
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy")
	"${worker} - ${sdf.format(workDate)} - ${hoursWorked}"
    }
}
