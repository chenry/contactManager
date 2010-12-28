import com.sagetech.contactmanager.Person
import com.sagetech.contactmanager.Skill

class BootStrap {

    def init = { servletContext ->
	environments {
	    development {
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
