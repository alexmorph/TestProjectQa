package uk.co.theautomatedtester.book.page

import geb.Page
import uk.co.theautomatedtester.book.config.*

class Chapter1Page extends Page{
	
	static at = {
		title == ClientConfiguration.chapter1PageTitle
		leftText.text() == "Assert that this text is on the page"
	}
	
	static content = {
		leftText(wait: true) { $("div#divontheleft") }
		homePageLink(wait:true) { $("a[href = '/']") }
	}
	
	def "User clicks on 'HomePage' link"() {
		homePageLink.click()
	}

}
