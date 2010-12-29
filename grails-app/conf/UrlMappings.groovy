class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/service/$controller"{
		    action = [GET:'serviceShow', PUT:'serviceSave', POST:'serviceUpdate', DELETE:'serviceDelete']
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
