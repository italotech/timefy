package ag.italo.timefy.cucumber.stepdefs;

import ag.italo.timefy.ItaloTimefyApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ItaloTimefyApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
