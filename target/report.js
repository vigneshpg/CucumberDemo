$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AddCustom.feature");
formatter.feature({
  "name": "Telecom",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "AddCustomer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user click the Add customer button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustom.user_click_the_Add_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the value credential in the boxes",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustom.user_enter_the_value_credential_in_the_boxes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustom.user_click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});