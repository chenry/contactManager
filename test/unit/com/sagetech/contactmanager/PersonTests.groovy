package com.sagetech.contactmanager

import grails.test.*

class PersonTests extends GrailsUnitTestCase {
    Person p
    def m = [firstName:"Carlus", lastName:"Henry", description:"Awesome Dude"]
    protected void setUp() {
        super.setUp()
	mockForConstraintsTests(Person)
	p = new Person(m)
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testPersonConstructorWithMap() {
        assert m.firstName == p.firstName
        assert m.lastName == p.lastName
        assert m.description == p.description
        assert "${m.firstName} ${m.lastName}" == p.fullName
    }

    void testValidate_NullFirstName() {
	Person pTest = new Person(lastName:"Henry", description:"Awesome")

	assertFalse "this should not validate since we are missing the first name", pTest.validate()
	assertTrue "there should be errors present", pTest.hasErrors()
	assertNotNull pTest.errors.getFieldError('firstName')

	println "Errors:"
	println pTest.errors ?: "no errors found"

	pTest.firstName = 'Carlus'

	assertTrue "There should validate", pTest.validate()
	assertFalse "There should no longer be any errors", pTest.hasErrors()
    }

    void testValidate_BlankFirstName() {
	Person pTest = new Person(firstName:'', lastName:"Henry", description:"Awesome")

	assertFalse "this should not validate since we are missing the first name", pTest.validate()
	assertTrue "there should be errors present", pTest.hasErrors()
	assertNotNull pTest.errors.getFieldError('firstName')

	//println "Errors:"
	//println pTest.errors ?: "no errors found"

	pTest.firstName = 'Carlus'

	assertTrue "There should validate", pTest.validate()
	assertFalse "There should no longer be any errors", pTest.hasErrors()
    }
}
