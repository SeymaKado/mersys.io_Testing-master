# mersys.io Testing

![Static Badge](https://img.shields.io/badge/test-%20pass%20-s?style=for-the-badge&labelColor=darksilver&color=darkgreen)
[![MIT License](https://img.shields.io/badge/licence-%20MIT%20-s?style=for-the-badge&labelColor=darksilver&color=darkgreen)](https://choosealicense.com/licenses/mit/)

This project is created to improve the user experience of mersys.io, an educational application.

Domain : [mersys.io](https://www.mersys.io/), [test.mersys.io](https://test.mersys.io//)


While Starting
---------------

### The simplest method :

```gherkin
Feature: While Starting

  Background:
    Given Follow the path
      | File > New > Project From Version Control |
    When  Copy URL and paste
     

  Scenario: Open this project at your IDE
    Then Select JDK version for project
      | jdk1.8 |
    And To load the POM with Maven, click on
      | pom.xml > Maven > Reload Project |
    And To run all tests, click on
      | Runners > Runner Classes |

```

<img src="https://www.animatedimages.org/data/media/562/animated-line-image-0426.gif" width="1920" />

![Jenkins](Jenkins.gif)

### Dependencies

<img src="https://www.animatedimages.org/data/media/562/animated-line-image-0426.gif" width="1920" />

<div align="right">
<table style="width: 100%; table-layout: fixed; border-collapse: collapse; height: 100%;">
<thead>
<tr>
<th style="width: 33.33%;"><img src="https://img.shields.io/badge/Selenium-%20v4.11.0%20-s?style=for-the-badge&amp;logo=Selenium&amp;labelColor=darksilver&amp;color=darkgreen" alt="TestNG Badge" /></th>
<th style="width: 33.33%;"><img src="https://img.shields.io/badge/Cucumber-%20v7.9.0%20-s?style=for-the-badge&amp;logo=Cucumber&amp;labelColor=darksilver&amp;color=darkgreen" alt="TestNG Badge" /></th>
<th style="width: 33.33%;"><img src="https://img.shields.io/badge/TestNG-%20v6.14.3%20-s?style=for-the-badge&amp;logo=ng&amp;labelColor=darksilver&amp;color=darkgreen" alt="TestNG Badge" /></th>
</tr>
<tr>
<td style="width: 33.33%;">Selenium is an open-source tool that automates web browsers. It can be used to test web applications, web scrape, and data entry.</td>
<td style="width: 33.33%;">Cucumber is a BDD framework that uses human-readable text to define acceptance tests. It can be used to automate tests for a variety of applications</td>
<td style="width: 33.33%;">TestNG is a powerful open-source testing framework for Java that can be used to efficiently automate a wide range of testing tasks and scenarios.</td>
</tr>
</thead>
<tbody>
<tr>
<th style="width: 33.33%;"><img src="https://img.shields.io/badge/Apache%20Commons%20-%20v3.12.0%20-s?style=for-the-badge&amp;logo=Apache&amp;labelColor=darksilver&amp;color=darkgreen" alt="TestNG Badge" /></th>
<th style="width: 33.33%;"><img src="https://img.shields.io/badge/Apache%20POI%20-%20v4.1.0%20-s?style=for-the-badge&amp;logo=Apache&amp;labelColor=darksilver&amp;color=darkgreen" alt="TestNG Badge" /></th>
<th style="width: 33.33%;"><img src="https://img.shields.io/badge/Apache%20POI%20OOXML%20-%20v4.1.0%20-s?style=for-the-badge&amp;logo=Apache&amp;labelColor=darksilver&amp;color=darkgreen" alt="TestNG Badge" /></th>
</tr>
<tr>
<td style="width: 33.33%;">Java library that simplifies essential operations in Java, including text processing, string manipulation, and other language utilities.</td>
<td style="width: 33.33%;">Apache POI is a Java library that provides tools for reading and writing office documents in various formats, including Excel, Word, and PowerPoint.</td>
<td style="width: 33.33%;">Apache POI OOXML is an extension of Apache POI that facilitates handling modern office document formats, such as .xlsx files, in Java applications.</td>
</tr>
<tr>
<th style="width: 33.33%;"><img src="https://img.shields.io/badge/slf4j-%20v1.8.0--Beta2%20-s?style=for-the-badge&amp;logo=ng&amp;labelColor=darksilver&amp;color=darkgreen" alt="TestNG Badge" /></th>
<th style="width: 33.33%;"><img src="https://img.shields.io/badge/Grasshopper%20-%20v1.9.2%20-s?style=for-the-badge&amp;labelColor=darksilver&amp;color=darkgreen" alt="TestNG Badge" /></th>
<th style="width: 33.33%;"><img src="https://img.shields.io/badge/Javafaker%20-%20v1.0.2%20-s?style=for-the-badge&amp;labelColor=darksilver&amp;color=darkgreen" alt="TestNG Badge" /></th>
</tr>
<tr>
<td style="width: 33.33%;">SLF4J (Simple Logging Facade for Java) is a Java logging library that simplifies and standardizes logging operations in Java applications.</td>
<td style="width: 33.33%;">Grasshopper is a versatile and user-friendly tool for generating HTML and PDF reports, aiding in the effective visualization of test results.</td>
<td style="width: 33.33%;">JavaFaker is a versatile and user-friendly Java library that provides realistic fake data for use in project development, testing, and presentations.</td>
</tr>
</tbody>
</table>
</div>


### File Structure

<img src="https://www.animatedimages.org/data/media/562/animated-line-image-0426.gif" width="1920" />

```text
├── src
│   └── test
│       ├── java
│       │   ├── ExcelFiles
│       │   │   └── LoginInfo.xlsx
│       │   ├── FeatureFiles
│       │   │   └── Cucumber Feature Files
│       │   ├── Pages
│       │   │   └── POM Files
│       │   ├── Runners
│       │   │   └── Extent Report and Test Runners Clases
│       │   ├── StepDefinitions
│       │   │   ├── Test Step Definitions Class File
│       │   │   └── Hooks
│       │   └── Utilities
│       │       ├── ExcelManager
│       │       └── Singleton_driver
│       └── resources
│           ├── cucumber.properties
│           └── extent.properties
├── Test Excel Reports
│   └── ExcelOutput.xlsx
├── Test Reports
│   └── TestReport +'(LocalDateTime)'
│       └── test-output
│           ├── SparkReport
│           │   └── Spark.html
│           └── PDFReport
├── .gitignore
└── pom.xml
```

### TEAM

<img src="https://www.animatedimages.org/data/media/562/animated-line-image-0426.gif" width="1920" />
- <h4>Tester <| Şeyma KADO <br /><strong> <a href="mailto:4seyma@gmail.com"> <img src="https://www.freepnglogos.com/uploads/logo-gmail-png/logo-gmail-png-gmail-icon-download-png-and-vector-1.png" alt="E-Posta" width="31" height="25" /></a>&nbsp;</strong></h4>
- <h4>T.Lead <| Burhan SENGUL <br /><strong> <a href="mailto:burhseng@gmail.com"> <img src="https://www.freepnglogos.com/uploads/logo-gmail-png/logo-gmail-png-gmail-icon-download-png-and-vector-1.png" alt="E-Posta" width="31" height="25" /></a></strong></h4>
- <h4>Tester <| D. Fatihhan KARAHANLI <br /><strong> <a href="mailto:fatihhan.karahanli@gmail.com"> <img src="https://www.freepnglogos.com/uploads/logo-gmail-png/logo-gmail-png-gmail-icon-download-png-and-vector-1.png" alt="E-Posta" width="31" height="25" /></a></strong></h4>
- <h4><strong>Tester <| Ramazan INCE </strong><br /><strong><a href="mailto:inceliramazan80@gmail.com"><img src="https://www.freepnglogos.com/uploads/logo-gmail-png/logo-gmail-png-gmail-icon-download-png-and-vector-1.png" alt="E-Posta" width="31" height="25" /></a>&nbsp;</strong></h4>
- <h4>Tester <| Zafer CANSIZ <br /><strong><a href="mailto:zfrcnsz1@gmail.com"><img src="https://www.freepnglogos.com/uploads/logo-gmail-png/logo-gmail-png-gmail-icon-download-png-and-vector-1.png" alt="E-Posta" width="31" height="25" /></a>&nbsp;</strong></h4>



### TODO
<img src="https://www.animatedimages.org/data/media/562/animated-line-image-0426.gif" width="1920" />

* It's crucial to stick to the specified dependencies versions to maintain compatibility and reliability.
  Using different versions can jeopardize project stability and compatibility.
  In case you encounter problems with alternative versions, please note that these
  issues cannot be attributed to the project.<br>
  <br>
* If you experience issues or compatibility problems with a specific version of our project or
  if you are tempted to use different versions, we encourage you to provide feedback. We will
  do our best to assist you.



### LICENSE
<img src="https://www.animatedimages.org/data/media/562/animated-line-image-0426.gif" width="1920" />

- This project is an open-source software licensed under the terms of the[ MIT license](https://opensource.org/license/mit/).