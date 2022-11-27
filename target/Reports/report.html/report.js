$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Test1.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify user is able to login 2",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "I want to login using \"\u003cUsername\u003e\" \"\u003cPassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I want to extract X-auth",
  "keyword": "When "
});
formatter.step({
  "name": "I want to validate response",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "master",
        "123456"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify user is able to login 2",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "I want to login using \"master\" \"123456\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.i_want_to_login_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to extract X-auth",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_want_to_extract_X_auth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to validate response",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.i_want_to_validate_response()"
});
formatter.result({
  "status": "passed"
});
});