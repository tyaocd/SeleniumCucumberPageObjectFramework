$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/TestCases/baidu.feature");
formatter.feature({
  "name": "try search function in Baidu Homepage",
  "description": "  I want to use this feature to test baidu\u0027s search function",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "try before",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "open baidu home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TryBaidu.open_baidu_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "input \"test\" in search box",
  "keyword": "Then "
});
formatter.match({
  "location": "TryBaidu.input_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "TryBaidu.i_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});