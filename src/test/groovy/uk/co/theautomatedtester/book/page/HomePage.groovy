package uk.co.theautomatedtester.book.page

import geb.Page
import uk.co.theautomatedtester.book.config.*

class HomePage extends Page{
	
	static at = {
		title == ClientConfiguration.homePageTitle
		defaultInput.displayed
		chapter1Link.displayed
	}
	
	static content = {
		defaultInput(wait: true) { $("input#q") }
		chapter1Link(wait: true) { $("a[href = '/chapter1']") }
	}
	
	def "User clicks on 'Chapter1' link"() {
		chapter1Link.click()
	}

}
