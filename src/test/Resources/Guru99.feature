

Feature: Guru99 Demo Site Exercise


@RegressionTest
  Scenario:
    Given user is on the Guru99 login page and is able to see the text "Guru99 Bank"
    When user fills username section as "mngr346090" and password as "asUsugu"
    Then user should be able to see the text "Manger Id : mngr346090"

@RegressionTest
    Scenario:
      Given user clicks on new customer button and verify they are in New Customer Entry Page
      When user fills the information for new customer
      |Customer Name|F|
      |Gender       |male     |
      |Date of Birth|08081900 |
      |Adress       |Kurdistan|
      |City         |Amed  |
      |State        |Rojhelat |
      |PIN          |202323     |
      |Mobile Number|4994994949|
      |E-mail       |ghfchfchf@gmail.com|
      |Password     |JiBoAzadiye     |
      Then user should verify that new customer added successfully