$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/TekSchoolScenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Tek School Scenarios",
  "description": "",
  "id": "tek-school-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4996184915,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on TekSchool page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Click on Test Environment link",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User should see Test Environment page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_TekSchool_page()"
});
formatter.result({
  "duration": 4971089431,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_Click_on_Test_Environment_link()"
});
formatter.result({
  "duration": 1580506588,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_should_see_Test_Environment_page()"
});
formatter.result({
  "duration": 11023162,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "SDET2019AUG_SDET_Register_Form_Test",
  "description": "",
  "id": "tek-school-scenarios;sdet2019aug-sdet-register-form-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 42,
      "name": "@SDET_RF_DBV"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "User click on myAccount menu on top of the page",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "User click on register on myAccount menu",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "User fill register form with below information",
  "rows": [
    {
      "comments": [
        {
          "line": 48,
          "value": "#firstname|lastname|email|phone|password|"
        }
      ],
      "cells": [
        "Jahan",
        "Rejepova",
        "pearl.garza@sakilacustomer.org",
        "2021256455",
        "Test123"
      ],
      "line": 49
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "User click on \u0027yes\u0027 radio button for Subscribe",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "User should see \u0027Your Account Has been Created!\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "User connects to DataBase",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "User sends query \u0027select * from public.customer where email\u003d\u0027pearl.garza@sakilacustomer.org\u0027\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "User verify email account is created with email \u0027pearl.garza@sakilacustomer.org\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "TekSchoolScenariosStepdefinitions.user_click_on_myAccount_menu_on_top_of_the_page()"
});
formatter.result({
  "duration": 696981930,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenariosStepdefinitions.user_click_on_register_on_myAccount_menu()"
});
formatter.result({
  "duration": 767501343,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenariosStepdefinitions.user_fill_register_form_with_below_information(DataTable)"
});
formatter.result({
  "duration": 708676079,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yes",
      "offset": 15
    }
  ],
  "location": "TekSchoolScenariosStepdefinitions.user_click_on_radio_button_for_Subscribe(String)"
});
formatter.result({
  "duration": 430283504,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenariosStepdefinitions.user_click_on_continue_button()"
});
formatter.result({
  "duration": 636254041,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenariosStepdefinitions.user_should_see_Your_Account_Has_been_Created()"
});
formatter.result({
  "duration": 411248279,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenariosStepdefinitions.user_connects_to_DataBase()"
});
formatter.result({
  "duration": 96831996,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "select * from public.customer where email\u003d\u0027pearl.garza@sakilacustomer.org\u0027",
      "offset": 18
    }
  ],
  "location": "TekSchoolScenariosStepdefinitions.user_sends_query(String)"
});
formatter.result({
  "duration": 31202357,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pearl.garza@sakilacustomer.org",
      "offset": 49
    }
  ],
  "location": "TekSchoolScenariosStepdefinitions.user_verify_email_account_is_created_with_email(String)"
});
formatter.result({
  "duration": 12901410,
  "status": "passed"
});
formatter.after({
  "duration": 913731868,
  "status": "passed"
});
});