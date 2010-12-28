package com.sagetech.contactmanager

import grails.test.*

class LastContactedTests extends GrailsUnitTestCase {
    LastContacted lc
    protected void setUp() {
        super.setUp()
	mockDomain(LastContacted)
	Person p = new Person()
	lc = new LastContacted(person:p, dateOfContact:new Date(), description:"Good discussion")
    }

    void testValid() {
	assertTrue "Should be valid", lc.validate()
	assertFalse "Should not be any errors", lc.hasErrors()
    }

    void testInvalid() {
	LastContacted test = new LastContacted()
	assertFalse "Should be invalid", test.validate()
	assertTrue "Should be errors", test.hasErrors()

	println "Errors"
	println test.errors ?: "no errors found"

	assertEquals 3, test.errors.errorCount

	test.dateOfContact = new Date();
	test.description = "Just had some drinks"
	test.person = new Person()

	assertTrue "Should be valid", test.validate()
	assertFalse "Should not be any errors", test.hasErrors()

    }
}
