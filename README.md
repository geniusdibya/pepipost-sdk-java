![pepipostlogo](https://pepipost.com/assets/img/pepipost-footLogo.png)

[![Twitter Follow](https://img.shields.io/twitter/follow/pepi_post.svg?style=social&label=Follow)](https://twitter.com/pepi_post)

# Official Java library :coffee: for [Pepipost](http://www.pepipost.com/?utm_campaign=GitHubSDK&utm_medium=GithubSDK&utm_source=GithubSDK)

This library contains methods for easily interacting with the Pepipost Email Sending API to send emails within few seconds.

We are trying to make our libraries Community Driven- which means we need your help in building the right things in proper order we would request you to help us by sharing comments, creating new [issues](https://github.com/pepipost/pepipost-sdk-java/issues) or [pull requests](https://github.com/pepipost/pepipost-sdk-java/pulls).

We welcome any sort of contribution to this library.

The latest 2.5.0 version of this library provides is fully compatible with the latest Pepipost v2.0 API.

For any update of this library check [Releases](https://github.com/pepipost/pepipost-sdk-java/releases).

# Table of Content
  
* [Installation](#installation)
* [Quick Start](#quick-start)
* [Usage](#usage)
* [Announcements](#announcements)
* [Roadmap](#roadmap)
* [About](#about)
* [License](#license)

<a name="installation"></a>
# Installation

<a name="prereq"></a>
## Prerequisites
* Java (latest recommended)
* Java Maven Dependencies
  * Jackson
  * UniRest
  * Apache HttpClient
* Java Development Enviromment (IDE)

<a name="quickstart"></a>
## Quick Start

This Java library uses few Maven Dependencies ([mentioned above](#prereq)). The reference to these dependencies are added in pom.xml file which will be install automatically. Just need internet access for successful build.

* [Download zip](https://github.com/pepipost/pepipost-sdk-java/archive/master.zip) or get a clone for the pepipost repository using 

  ``` git clone https://github.com/pepipost/pepipost-sdk-java.git ```

* In order to open the client library in Eclipse click on ``` File -> Import ```.

  ![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=pepipost-Java&workspaceName=Pepipost&projectName=PepipostLib&rootNamespace=com.pepipost.api)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

  ![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=pepipost-Java&workspaceName=Pepipost&projectName=PepipostLib&rootNamespace=com.pepipost.api)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

  ![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=pepipost-Java&workspaceName=Pepipost&projectName=PepipostLib&rootNamespace=com.pepipost.api)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

  ![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=pepipost-Java&workspaceName=Pepipost&projectName=PepipostLib&rootNamespace=com.pepipost.api)

### Usage of Pepipost library in project

1. Starting a new project

   * Click the menu command ``` File > New > Project ```.

     ![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=pepipost-Java&workspaceName=Pepipost&projectName=PepipostLib&rootNamespace=com.pepipost.api)

   * Choose ``` Maven > Maven Project ```.
   
   * Click ``` Next ```.

     ![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=pepipost-Java&workspaceName=Pepipost&projectName=PepipostLib&rootNamespace=com.pepipost.api)

   * Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below.
   
   * Click ``` Next ```.

     ![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=pepipost-Java&workspaceName=Pepipost&projectName=PepipostLib&rootNamespace=com.pepipost.api)

   * Select the *quick start* project type to create a simple project with an existing class.
   * A ``` main ``` method. 
   * To do this, choose ``` maven-archetype-quickstart ``` item from the list.
   * Click ``` Next ```.

     ![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=pepipost-Java&workspaceName=Pepipost&projectName=PepipostLib&rootNamespace=com.pepipost.api)

   * In the last step, provide a ``` Group Id ```.and ``` Artifact Id ``` as shown in the picture below.
   * Click ``` Finish ```.

     ![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=pepipost-Java&workspaceName=Pepipost&projectName=PepipostLib&rootNamespace=com.pepipost.api)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *PepipostLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=pepipost-Java&workspaceName=Pepipost&projectName=PepipostLib&rootNamespace=com.pepipost.api)

Clicking the ``` Add ``` button will open a dialog where you need to specify Pepipost in ``` Group Id ``` and PepipostLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=pepipost-Java&workspaceName=Pepipost&projectName=PepipostLib&rootNamespace=com.pepipost.api)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=pepipost-Java&workspaceName=Pepipost&projectName=PepipostLib&rootNamespace=com.pepipost.api)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *PepipostLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### 

API client can be initialized as following.

```java

PepipostClient client = new PepipostClient();
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [EmailController](#email_controller)

## <a name="email_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.pepipost.api.controllers.EmailController") EmailController

### Get singleton instance

The singleton instance of the ``` EmailController ``` class can be accessed from the API Client.

```java
EmailController email = client.getEmail();
```

### <a name="create_send_email_async"></a>![Method: ](https://apidocs.io/img/method.png "com.pepipost.api.controllers.EmailController.createSendEmailAsync") createSendEmailAsync

> *Tags:*  ``` Skips Authentication ``` 

> This Endpoint sends emails with the credentials passed.


```java
void createSendEmailAsync(
        final String apiKey,
        final EmailBody body,
        final APICallBack<SendEmailResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| apiKey |  ``` Optional ```  | Generated header parameter. Example value ='5ce7096ed4bf2b39dfa932ff5fa84ed9ed8' |
| body |  ``` Optional ```  | The body passed will be json format. |


#### Example Usage

```java
try {
    String apiKey = "api_key";
    EmailBody body = new EmailBody();
    // Invoking the API call with sample inputs
    email.createSendEmailAsync(apiKey, body, new APICallBack<SendEmailResponse>() {
        public void onSuccess(HttpContext context, SendEmailResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 405 | Method not allowed |



[Back to List of Controllers](#list_of_controllers)



