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
	Skill java = new Skill(name:"Java", description:"Programming Language")
	Skill ruby = new Skill(name:"Ruby", description:"Programming Language")
	Skill rails = new Skill(name:"Rails", description:"Web framework for Ruby")
	Skill php = new Skill(name:"PHP", description:"Programming Language")
	Skill groovy = new Skill(name:"Groovy", description:"Programming Language")
	Skill grails = new Skill(name:"Grails", description:"Web framework for Groovy")

	Person me = new Person(firstName:"Carlus", lastName:"Henry", description:"Me.")	
	Person atheesh = new Person(firstName:"Atheesh", lastName:"Sanka", description:"Fellow Consultant at GFS for the past 4 years")
	Person ja = new Person(firstName:"Jeremy", lastName:"Anderson", description:"Pillar Consultant at GFS, wrote Flex on Java for Manning")

	me.addToSkills(java)
	me.addToSkills(groovy)
	me.addToSkills(grails)

	atheesh.addToSkills(java)

	ja.addToSkills(java)
	ja.addToSkills(ruby)
	ja.addToSkills(rails)
	ja.addToSkills(groovy)
	ja.addToSkills(grails)

	def people = [me, atheesh, ja]


	people.each {
	   it.save(flush:true) 
	}
	
    }

    def destroy = {
    }
}
