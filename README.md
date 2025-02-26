# accenture-gestor-franquicias
API to manage franchises, branches and products

# Start up 🚀
These instructions will allow you to get a copy of the project running on your local machine for development and testing purposes.

## Requirements  📋
In the first place,  you must have Java Version 17, Gradle 7.6.1, and MySQL 8.0.29 on your computer. 
Also you must need some editor code. I recommend you Intellij IDEA Community.
With Java Version 17 and your editor code in your computer the next step its import the database schema in your MySQL workbench. The importation file is located in te folder `db/franquiciasdb-dump.sql` in this repository; if you don't have MySQL workbench look at this [link](https://dev.mysql.com/downloads/file/?id=506568).

### import the database schema 
For importing the database schema on your MySQL, you only open your workbench and follow these steps:

 1. Open your MySQL workbench. 
 2. In the home screen MySQL Connection: `Create/setup new connection` with name `franquiciasdb`. Verify that the `Hostname` is `127.0.0.1` and the `Port` `3306`.
 3. Open created connection and provide access credentials
 4. Click `Server` on the main tool bar.
 5. Select  `Data Import`.
 6. In the `Import Options` section, check the `Import from Self-Contained File`.
 7. Click the  `...`  and navigate to where your MySQL backup file is located, select the backup you want to load, and click  `OK`.
 8. Select the `Start Import`  on the bottom right.
 9. Finally refresh schemas in the sidebar left. A schema with the name `franquiciasdb` should appear.

### install dependencies
the final requirement is to install the required dependencies, you need to click de 'Build Module' option on the project left-click menu :
![image](https://github.com/user-attachments/assets/deb4afc2-19c0-41d0-b67a-4d8dcd36380b)

# start the server :inbox_tray: 

the server is configured to run on the port 8080, which means the server is listening in the http://localhost:8080.
To start the server you only need to click button run on the screen:

![image](https://github.com/user-attachments/assets/54d0fae5-4dad-4d41-a281-fd0d64688c2a)

At the root of the project, you can find the file `api-docs.json` with the information about how works the endpoints.
[API Docs](https://app.swaggerhub.com/apis-docs/sadithnunez/Gestor-Franquicias/1.0.0-oas3.1)

Additionally, the Postman collection is shared so that each endpoint of the API can be tested. [Postman API Collection for testing](https://app.getpostman.com/join-team?invite_code=11d538e579485bb7cd012457cdced7b21ccf1b2cc8af6fd1dc3f116f124d9be2&target_code=4faeced62f93789a3f28521430d874de)



## Author  ✒️

### this  API was done by:
-   **Sadith Nunez**  -  _Trabajo Inicial_ -  [sadnuro](https://github.com/Sadnuro)

## License  📄

This project is under license from  -"MIT"
url: "http://www.apache.org/lice

