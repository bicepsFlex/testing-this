package no.hvl.dat251;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SplittingNamesSteps {
	
	String fultNavn;
	
	@Given("Navnet er {string}")
	public void navnet_er(String fultNavn) {
		this.fultNavn = fultNavn;		
	}

	@When("Vi splitter navnet")
	public void vi_splitter_navnet() {
	}

	@Then("Fornavnet blir {string}")
	public void fornavnet_blir(String fornavn) {
		assertEquals(fornavn, NameSplitter.getFirstName(fultNavn));
	}

	@Then("Etternavnet blir {string}")
	public void etternavnet_blir(String etternavn) {
		assertEquals(etternavn, NameSplitter.getLastName(fultNavn));
	}

}
