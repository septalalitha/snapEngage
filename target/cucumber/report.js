$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "       Exisiting user should be able to login",
  "id": "login-into-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4067254381,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login into account with correct credentials",
  "description": "",
  "id": "login-into-account;login-into-account-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User navigates to snapengage sigin Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters the username and password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the sigin Button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User will see the Agent portal succcessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_navigates_to_snapengage_sigin_Page()"
});
formatter.result({
  "duration": 2339098609,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_enters_the_username_and_password()"
});
formatter.result({
  "duration": 317126310,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_the_sigin_Button()"
});
formatter.result({
  "duration": 3429977292,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_will_see_the_Agent_portal_succcessfully()"
});
formatter.result({
  "duration": 701966089,
  "status": "passed"
});
formatter.after({
  "duration": 354736635,
  "status": "passed"
});
});