$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fundtransfer.feature");
formatter.feature({
  "line": 1,
  "name": "Customer Transfer\u0027s Fund",
  "description": "As a customer,\r\nI want to transfer funds\r\nso that I can send money to my friends and family",
  "id": "customer-transfer\u0027s-fund",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2677690119,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Invalid Payee",
  "description": "",
  "id": "customer-transfer\u0027s-fund;invalid-payee",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "the user is on Fund Transfer Page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "he enters \"John\" as payee name",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "he enters \"100\" as amount",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "he Submits request for Fund Transfer",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "ensure a transaction failure message \"Transfer failed!! \u0027John\u0027 is not approved. Please contact your branch\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FundTransferStepDef.the_user_is_on_Fund_Transfer_Page()"
});
formatter.result({
  "duration": 2514916943,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 11
    }
  ],
  "location": "FundTransferStepDef.he_enters_as_payee_name(String)"
});
formatter.result({
  "duration": 220491403,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 11
    }
  ],
  "location": "FundTransferStepDef.he_enters_as_amount(String)"
});
formatter.result({
  "duration": 70105798,
  "status": "passed"
});
formatter.match({
  "location": "FundTransferStepDef.he_Submits_request_for_Fund_Transfer()"
});
formatter.result({
  "duration": 77017078,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transfer failed!! \u0027John\u0027 is not approved. Please contact your branch",
      "offset": 38
    }
  ],
  "location": "FundTransferStepDef.ensure_a_transaction_failure_message_is_displayed(String)"
});
formatter.result({
  "duration": 44882838,
  "status": "passed"
});
formatter.after({
  "duration": 848642907,
  "status": "passed"
});
});