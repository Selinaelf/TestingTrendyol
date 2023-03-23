import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.example.Main;



public class LoginStep{
    @Given("user is on login page")
    public void UserIsOnLoginPage(){
    Main.TrendyolTestPage LogIn=new Main.TrendyolTestPage();
        LogIn.GirisYapBas();
        System.out.println("1");

    }

    @When("user enter username and password")
    public void UserEnterUsernameAndPassword() {
        System.out.println("2");

    }

    @And("clicks on login button")
    public void ClicksOnLoginButton(){
        System.out.println("3");


    }

    @Then("verify that succesfull login")
    public void VerifyThatSuccesfullLogin(){
        System.out.println("4");


    }

}
