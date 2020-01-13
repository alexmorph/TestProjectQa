package uk.co.theautomatedtester.book.spec

import geb.spock.GebSpec
import uk.co.theautomatedtester.book.page.*
import uk.co.theautomatedtester.book.config.*
import org.junit.*


 class CheckingThatTheTextIsDisplayedSpec extends GebSpec{
	
 def "User clicks on 'Chapter1' link, verify the text and go back to the Home page"() {
	 
	 given: "User navigates to Home page"
	 	to HomePage
		 
	 when: 
	 	"User clicks on 'Chapter1' link"()
	 
	 then: "User redirects to the Chapter1 page"
	 	at Chapter1Page
	 
	 when:
	 	 "User clicks on 'HomePage' link"()
	 
	 then: "User returns to the Home page"
	 	at HomePage
	 
    }
 
 }
