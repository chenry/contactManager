import com.sagetech.contactmanager.*

class BootStrap {

    def init = { servletContext ->
	environments {
	    development {
		populateDevData();
	    }
	    test {
		populateDevData();
	    }
	}
    }


    def populateDevData() {
	def java = new Skill(name:"Java", description:"Programming Language")
	def ruby = new Skill(name:"Ruby", description:"Programming Language")
	def rails = new Skill(name:"Rails", description:"Web framework for Ruby")
	def php = new Skill(name:"PHP", description:"Programming Language")
	def groovy = new Skill(name:"Groovy", description:"Programming Language")
	def grails = new Skill(name:"Grails", description:"Web framework for Groovy")
	def cplusplus = new Skill(name:"C++", description:"Programming Language").save(flush:true)
	def c = new Skill(name:"C", description:"Programming Language").save(flush:true)

	def gfs = new Company(name:"Gordon Food Service").save(flush:true)
	def johnsonControls = new Company(name:"Johnson Controls").save(flush:true)
	def gvsu = new Company(name:"Grand Valley University").save(flush:true)
	def mutuallyHuman = new Company(name:"Mutually Human").save(flush:true)
	def pillar = new Company(name:"Pillar").save(flush:true)

	def me = new Person(firstName:"Carlus", lastName:"Henry", description:"Me.")	
			.addToSkills(java)
			.addToSkills(groovy)
			.addToSkills(grails)
			.save(flush:true)

	def atheesh = new Person(firstName:"Atheesh", lastName:"Sanka", description:"Fellow Consultant at GFS for the past 4 years")
			.addToSkills(java)
			.save(flush:true)

	def ja = new Person(firstName:"Jeremy", lastName:"Anderson", description:"Pillar Consultant at GFS, wrote Flex on Java for Manning")
			.addToSkills(java)
			.addToSkills(ruby)
			.addToSkills(rails)
			.addToSkills(groovy)
			.addToSkills(grails)
			.save(flush:true)
    }

    def destroy = {
    }
}
