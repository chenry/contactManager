package com.sagetech.contactmanager

class PersonController {
     static scaffold = Person

    def serviceShow= {
	render "Will show"
    }

    def serviceSave = {
	render "Will save"
    }

    def serviceUpdate = {
	render "Will update"
    }

    def serviceDelete = {
	render "Will delete"
    }
}
