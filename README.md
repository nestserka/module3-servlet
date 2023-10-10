# Quest Application


*Comment for Yura (note: comment will be deleted from readme after checking the project): Здравствуйте! Я опаздала с работой, тк была в отпуске! Я писала заранее об этом вам в слак-канале! Решила уточнить сразу этот вопрос, потому что по гитхабу может быть не совсем явно - что это я! 
Ответы на все вопросы в секции Correct Answers for Quests.*


<img width="899" alt="Screenshot 2023-10-06 at 7 36 07 PM" src="https://github.com/nestserka/module3-servlet/assets/78704791/0067a4d8-4dc0-4be8-a527-e451f9be7f89">



## Task: Create a Maven project using Servlets, JSP, and JSTL.

### Technology Stack:
- Java: Version 20 (also compatible with Java 11)
- Maven: Version 3.9.3
- Java EE 8
- Tomcat: Version 10.1.13
- Gson Library: Version 2.10.1
- JUnit 5
- Bootstrap for page design

### How to Run
This project requires a local server. Follow the steps below to set it up:

1. Download Apache Tomcat (version 10) from the [official website](http://tomcat.apache.org/).
2. Install and configure Apache Tomcat on your local machine.
3. **Important!** Modify the open URL by adding "/login" to access the login page.

Example:


<img width="1046" alt="Screenshot 2023-10-06 at 7 23 04 PM" src="https://github.com/nestserka/module3-servlet/assets/78704791/244e09f7-c18b-4c1c-96b0-3d9d9c1aa08e">



5. Add the artifact: `module3_final_project_war: exploded`.

## Features
- User login page: allows users to enter their nickname, email, and role, and saves user information in the session. An ID is generated on the backend.
- List of quests: new quests can be written and read from JSON files.
- Quest questions and answers dynamically load into JSP pages from Servlets.
- Statistics page: displays total wins and time spent in quests.
- User personal page and logout function that clears the session.
- Includes 11 tests for Servlets:
  
![Screenshot_2](https://github.com/nestserka/module3-servlet/assets/78704791/bdb4cefe-a921-48d7-9165-79c264cd9a9e)



## Possible Issues and Solutions

1. If you encounter issues with file reading on Windows: Windows is case-sensitive with file naming. Ensure that you save your project locally to a path with no extra spacing, commas, or special characters.
2. This project is not connected to a database. All quests can be generated using JSON files. If the project does not build with `module3_final_project_war`, use `war:exploded` instead.

## Correct Answers for Quests

1. Qs1: Random input
2. Qs2: Lie
3. Qs3: Any random radio button.
4. Qs4: Fire
5. Qs5: Any answer, but not all answers will be counted as a win due to the bad ending.

## Future Possible Improvements
- User data can be saved not only in the session but also in YAML or JSON files to maintain user records.
- Quest results can be calculated based on all answers provided in the quest. The initial logic was removed for simplicity in this build.
- Customized error handling.
- Roles could play a more significant role in the application, allowing writers or administrators to edit quests online.
