package com.sagetech.contactmanager

import java.text.SimpleDateFormat;

class Employment {
    Person employee;
    Company company
    Date beginDate
    Date endDate
    String role
    String roleDescription

    static constraints = {
	role(nullable:false, blank:false)
	roleDescription(nullable:true, blank:false, maxSize:800)
    }

    String toString() {
	SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy")
	def beginDateStr = (beginDate) ? sdf.format(beginDate) : "N/A"
	def endDateStr = (endDate) ? sdf.format(endDate) : "N/A"
	"E: ${employee}, P: ${role}, C: ${company}, from ${beginDateStr} to ${endDateStr}"
    }
}
