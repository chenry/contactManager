package com.sagetech.contactmanager

import grails.test.*

class SkillTests extends GrailsUnitTestCase {
    Skill s
    protected void setUp() {
        super.setUp()
	mockDomain(Skill)
	s = new Skill(name:"Java", description:"Programming Language")
    }

    void testValidate() {
	assertTrue "The skill should validate", s.validate()	
	assertFalse "There should not be any errors", s.hasErrors()
    }

    void test_InvalidSkill() {
	Skill invalidSkill = new Skill()
	assertFalse "The skill should be invalid", invalidSkill.validate()
	assertTrue "There should be errors", invalidSkill.hasErrors()


	println invalidSkill.errors ?: "no errors found"
	invalidSkill.name = "C++"

	assertTrue "The skill should be valid", invalidSkill.validate()
	assertFalse "There should not be any errors", invalidSkill.hasErrors()
	
    }
}
