# Brainnest# Test automation project for [Brainnest](https://www.brainnest.consulting/)

<p  align="center">
<img src="images/logos/brainnest_logo.png" alt="BrainnestLogo" width="500">
</p>

# <a name="TableOfContents">Table of contents</a>
+ [Description](#Description)
  + [Tools and technologies](#Technology)
+ [How to run](#Jenkins)
    + [Gradle command](#GradleCommand)
    + [Run in Jenkins](#RunInJenkins)
+ [Telegram Notifications](#TelegramNotifications)


# <a name="Description">Description</a>
The test project consists of Web tests.
<p  align="center">
<img src="images/screenshots/main_page.png" alt="MainPage" width="700">
<img src="images/screenshots/contact_page.png" alt="contact_page" width="700">
<img src="images/screenshots/contact_us_button.png" alt="button" width="700">
</p>
Test-run GIF
<p  align="center">
<img src="images/screenshots/Brainnest.gif" alt="test_run_gif" width="700">
</p>

## <a name="Technology">Tools and a technologies</a>
<p  align="center">
  <code><img width="5%" title="IntelliJ IDEA" src="images/logos/IDEA-logo.svg"></code>
  <code><img width="5%" title="Java" src="images/logos/java-logo.svg"></code>
  <code><img width="5%" title="Selenide" src="images/logos/selenide-logo.svg"></code>
  <code><img width="5%" title="Selenoid" src="images/logos/selenoid-logo.svg"></code>
  <code><img width="5%" title="Gradle" src="images/logos/gradle-logo.svg"></code>
  <code><img width="5%" title="JUnit5" src="images/logos/junit5-logo.svg"></code>
  <code><img width="5%" title="Allure Report" src="images/logos/allure-Report-logo.svg"></code>
  <code><img width="5%" title="Github" src="images/logos/git-logo.svg"></code>
  <code><img width="5%" title="Jenkins" src="images/logos/jenkins-logo.svg"></code>
  <code><img width="5%" title="Telegram" src="images/logos/Telegram.svg"></code>
</p>

The autotests in this project are written in `Java` using `Selenide` framework.\
`Gradle` - is used as a build automation tool.  \
`JUnit5` - to execute tests.\
`Jenkins` - CI/CD for running tests remotely.\
`Selenoid` - to remote launching browsers in `Docker` containers.\
`Allure Report` - for test results visualisation.\
`Telegram Bot` - for test results notifications.

[Back to the table of contents ⬆](#TableOfContents)

# <a name="HowToRun">How to run</a>

## <a name="GradleCommand">Gradle command</a>
To run locally and in Jenkins the following command is used:
```
gradle clean <tests_to_be_executed>   
```
tests_to_be_executed:
>`test` - all tests\
>`header` - header tests\
>`contact` - contact tests

Additional parameters:
> `-Dbrowser=browser` - browser\
> `-DbrowserSize=browserSize` - browser size\
> `-DremoteUrl=remoteUrl` - remote URL

[Back to the table of contents ⬆](#TableOfContents)




## <a name="RunInJenkins">Run in [Jenkins](https://jenkins.autotests.cloud/job/C15-anna_rkchv-Unit15_Project_HW/)</a>
Main page of the build and parameters for Jenkins job:
<p  align="center">
<img src="images/screenshots/jenkins_main_page.png" alt="JenkinsBuildMainPage" width="700">
<img src="images/screenshots/jenkins_params.png" alt="JenkinsBuildParameters" width="700">
</p>

After the build is done the test results are available in <code>Allure Report</code>
<p  align="center">
<img src="images/screenshots/allure_main_page.png" alt="JenkinsBuildParameters" width="700">
<img src="images/screenshots/allure_tests.png" alt="JenkinsBuildParameters" width="700">
</p>

[Back to the table of contents ⬆](#TableOfContents)


# <a name="TelegramNotifications">Telegram Notifications</a>
Results of each build are sent to a specified telegram chat.
<p  align="center">
<img src="images/screenshots/telegram_notification.png" alt="TelegramNotificaton" width="700">
</p>


[Back to the table of contents ⬆](#TableOfContents)
